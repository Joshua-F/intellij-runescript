package io.runescript.plugin.lang.psi.type

import com.intellij.psi.PsiElement
import com.intellij.psi.util.CachedValueProvider
import com.intellij.psi.util.CachedValuesManager
import com.intellij.psi.util.PsiModificationTracker
import com.intellij.psi.util.parentOfType
import io.runescript.plugin.lang.psi.RsScript
import io.runescript.plugin.lang.psi.type.inference.RsTypeDiagnostic
import io.runescript.plugin.lang.psi.type.inference.RsTypeInference

val RsScript.inferenceData: RsTypeInference
    get() = CachedValuesManager.getCachedValue(this) {
        val inferenceData = RsTypeInference(this)
        inferenceData.infer()
        CachedValueProvider.Result.create(inferenceData, PsiModificationTracker.MODIFICATION_COUNT)
    }

val PsiElement.type: RsType
    get() {
        val script = parentOfType<RsScript>(true)!!
        val inferenceData = script.inferenceData
        return inferenceData.typeOf(this) ?: RsErrorType
    }

val PsiElement.typeErrors: List<RsTypeDiagnostic>
    get() {
        val script = parentOfType<RsScript>(true) ?: return emptyList()
        val inferenceData = script.inferenceData
        return inferenceData.errorsFor(this) ?: emptyList()
    }

fun Iterable<RsType>.flatten(): Array<RsType> {
    val flattened = mutableListOf<RsType>()
    for (type in this) {
        when (type) {
            is RsTupleType -> flattened.addAll(type.types)
            is RsPrimitiveType -> flattened.add(type)
            is RsArrayType -> flattened.add(type)
            is RsTypeType -> flattened.add(type)
            else -> error("Called flatten() on non primitive type array: ${type::class}")
        }
    }
    return flattened.toTypedArray()
}

fun List<RsType>.joined(): RsType {
    if (size == 1) {
        return this[0]
    }
    return RsTupleType(toTypedArray())
}