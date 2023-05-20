// This class is automatically generated. Do not edit.
package io.runescript.plugin.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RsLocalVariableDeclarationStatement extends RsStatement {

  @NotNull
  List<RsExpression> getExpressionList();

  @NotNull
  PsiElement getDefineType();

  @Nullable
  PsiElement getEqual();

  @NotNull
  PsiElement getSemicolon();

  //WARNING: getNameExpression(...) is skipped
  //matching getNameExpression(RsLocalVariableDeclarationStatement, ...)
  //methods are not found in RsPsiImplUtil

}