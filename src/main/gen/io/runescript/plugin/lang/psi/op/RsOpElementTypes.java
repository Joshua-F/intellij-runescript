// This class is automatically generated. Do not edit.
package io.runescript.plugin.lang.psi.op;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import io.runescript.plugin.lang.stubs.OpStubElementTypeFactory;
import io.runescript.plugin.lang.psi.impl.op.*;

public interface RsOpElementTypes {

  IElementType ATTRIBUTE = new RsOpElementType("ATTRIBUTE");
  IElementType ATTRIBUTE_LIST = OpStubElementTypeFactory.create("ATTRIBUTE_LIST");
  IElementType ATTRIBUTE_VALUE = new RsOpElementType("ATTRIBUTE_VALUE");
  IElementType COMMAND = OpStubElementTypeFactory.create("COMMAND");
  IElementType COMMAND_HEADER = OpStubElementTypeFactory.create("COMMAND_HEADER");
  IElementType INTEGER_VALUE = new RsOpElementType("INTEGER_VALUE");
  IElementType NAME_LITERAL = OpStubElementTypeFactory.create("NAME_LITERAL");
  IElementType PARAMETER = OpStubElementTypeFactory.create("PARAMETER");
  IElementType PARAMETER_LIST = OpStubElementTypeFactory.create("PARAMETER_LIST");
  IElementType RETURN_LIST = OpStubElementTypeFactory.create("RETURN_LIST");
  IElementType TYPE_NAME = OpStubElementTypeFactory.create("TYPE_NAME");

  IElementType COMMA = new RsOpElementType(",");
  IElementType DOLLAR = new RsOpElementType("$");
  IElementType HASH = new RsOpElementType("#");
  IElementType IDENTIFIER = new RsOpElementType("IDENTIFIER");
  IElementType INTEGER = new RsOpElementType("INTEGER");
  IElementType LBRACKET = new RsOpElementType("[");
  IElementType LPAREN = new RsOpElementType("(");
  IElementType RBRACKET = new RsOpElementType("]");
  IElementType RPAREN = new RsOpElementType(")");
  IElementType TYPE_LITERAL = new RsOpElementType("TYPE_LITERAL");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ATTRIBUTE) {
        return new RsOpAttributeImpl(node);
      }
      else if (type == ATTRIBUTE_LIST) {
        return new RsOpAttributeListImpl(node);
      }
      else if (type == ATTRIBUTE_VALUE) {
        return new RsOpAttributeValueImpl(node);
      }
      else if (type == COMMAND) {
        return new RsOpCommandImpl(node);
      }
      else if (type == COMMAND_HEADER) {
        return new RsOpCommandHeaderImpl(node);
      }
      else if (type == INTEGER_VALUE) {
        return new RsOpIntegerValueImpl(node);
      }
      else if (type == NAME_LITERAL) {
        return new RsOpNameLiteralImpl(node);
      }
      else if (type == PARAMETER) {
        return new RsOpParameterImpl(node);
      }
      else if (type == PARAMETER_LIST) {
        return new RsOpParameterListImpl(node);
      }
      else if (type == RETURN_LIST) {
        return new RsOpReturnListImpl(node);
      }
      else if (type == TYPE_NAME) {
        return new RsOpTypeNameImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}