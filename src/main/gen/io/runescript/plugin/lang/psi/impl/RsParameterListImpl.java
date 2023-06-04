// This class is automatically generated. Do not edit.
package io.runescript.plugin.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.runescript.plugin.lang.psi.RsElementTypes.*;
import io.runescript.plugin.lang.psi.mixin.RsParameterListMixin;
import io.runescript.plugin.lang.psi.*;
import io.runescript.plugin.lang.stubs.RsParameterListStub;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.tree.IElementType;

public class RsParameterListImpl extends RsParameterListMixin implements RsParameterList {

  public RsParameterListImpl(@NotNull ASTNode node) {
    super(node);
  }

  public RsParameterListImpl(@NotNull RsParameterListStub stub, @NotNull IStubElementType<?, ?> type) {
    super(stub, type);
  }

  public RsParameterListImpl(@Nullable RsParameterListStub stub, @Nullable IElementType type, @Nullable ASTNode node) {
    super(stub, type, node);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitParameterList(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RsParameter> getParameterList() {
    return PsiTreeUtil.getStubChildrenOfTypeAsList(this, RsParameter.class);
  }

  @Override
  @NotNull
  public PsiElement getLparen() {
    return notNullChild(findChildByType(LPAREN));
  }

  @Override
  @NotNull
  public PsiElement getRparen() {
    return notNullChild(findChildByType(RPAREN));
  }

}
