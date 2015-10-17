// Generated from C:/Users/User/Documents/GitHub/Practica3/Parser\UNALang.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UNALangParser}.
 */
public interface UNALangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link UNALangParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(UNALangParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(UNALangParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void enterGenericSelection(UNALangParser.GenericSelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void exitGenericSelection(UNALangParser.GenericSelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void enterGenericAssocList(UNALangParser.GenericAssocListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void exitGenericAssocList(UNALangParser.GenericAssocListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void enterGenericAssociation(UNALangParser.GenericAssociationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void exitGenericAssociation(UNALangParser.GenericAssociationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(UNALangParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(UNALangParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList(UNALangParser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList(UNALangParser.ArgumentExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(UNALangParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(UNALangParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(UNALangParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(UNALangParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(UNALangParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(UNALangParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(UNALangParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(UNALangParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(UNALangParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(UNALangParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(UNALangParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(UNALangParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(UNALangParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(UNALangParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(UNALangParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(UNALangParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(UNALangParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(UNALangParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(UNALangParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(UNALangParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(UNALangParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(UNALangParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(UNALangParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(UNALangParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(UNALangParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(UNALangParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(UNALangParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(UNALangParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(UNALangParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(UNALangParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(UNALangParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(UNALangParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(UNALangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(UNALangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(UNALangParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(UNALangParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(UNALangParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(UNALangParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers(UNALangParser.DeclarationSpecifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers(UNALangParser.DeclarationSpecifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers2(UNALangParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers2(UNALangParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifier(UNALangParser.DeclarationSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifier(UNALangParser.DeclarationSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(UNALangParser.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(UNALangParser.InitDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(UNALangParser.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(UNALangParser.InitDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStorageClassSpecifier(UNALangParser.StorageClassSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStorageClassSpecifier(UNALangParser.StorageClassSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(UNALangParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(UNALangParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnionSpecifier(UNALangParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnionSpecifier(UNALangParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnion(UNALangParser.StructOrUnionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnion(UNALangParser.StructOrUnionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarationList(UNALangParser.StructDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarationList(UNALangParser.StructDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(UNALangParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(UNALangParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterSpecifierQualifierList(UNALangParser.SpecifierQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitSpecifierQualifierList(UNALangParser.SpecifierQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaratorList(UNALangParser.StructDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaratorList(UNALangParser.StructDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarator(UNALangParser.StructDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarator(UNALangParser.StructDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumSpecifier(UNALangParser.EnumSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumSpecifier(UNALangParser.EnumSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorList(UNALangParser.EnumeratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorList(UNALangParser.EnumeratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(UNALangParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(UNALangParser.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationConstant(UNALangParser.EnumerationConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationConstant(UNALangParser.EnumerationConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAtomicTypeSpecifier(UNALangParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAtomicTypeSpecifier(UNALangParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifier(UNALangParser.TypeQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifier(UNALangParser.TypeQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSpecifier(UNALangParser.FunctionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSpecifier(UNALangParser.FunctionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAlignmentSpecifier(UNALangParser.AlignmentSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAlignmentSpecifier(UNALangParser.AlignmentSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(UNALangParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(UNALangParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectDeclarator(UNALangParser.DirectDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectDeclarator(UNALangParser.DirectDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void enterGccDeclaratorExtension(UNALangParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void exitGccDeclaratorExtension(UNALangParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeSpecifier(UNALangParser.GccAttributeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeSpecifier(UNALangParser.GccAttributeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeList(UNALangParser.GccAttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeList(UNALangParser.GccAttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void enterGccAttribute(UNALangParser.GccAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void exitGccAttribute(UNALangParser.GccAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void enterNestedParenthesesBlock(UNALangParser.NestedParenthesesBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void exitNestedParenthesesBlock(UNALangParser.NestedParenthesesBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(UNALangParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(UNALangParser.PointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifierList(UNALangParser.TypeQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifierList(UNALangParser.TypeQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void enterParameterTypeList(UNALangParser.ParameterTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void exitParameterTypeList(UNALangParser.ParameterTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(UNALangParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(UNALangParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(UNALangParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(UNALangParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(UNALangParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(UNALangParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(UNALangParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(UNALangParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractDeclarator(UNALangParser.AbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractDeclarator(UNALangParser.AbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectAbstractDeclarator(UNALangParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectAbstractDeclarator(UNALangParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void enterTypedefName(UNALangParser.TypedefNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void exitTypedefName(UNALangParser.TypedefNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(UNALangParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(UNALangParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void enterInitializerList(UNALangParser.InitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void exitInitializerList(UNALangParser.InitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#designation}.
	 * @param ctx the parse tree
	 */
	void enterDesignation(UNALangParser.DesignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#designation}.
	 * @param ctx the parse tree
	 */
	void exitDesignation(UNALangParser.DesignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void enterDesignatorList(UNALangParser.DesignatorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void exitDesignatorList(UNALangParser.DesignatorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesignator(UNALangParser.DesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesignator(UNALangParser.DesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticAssertDeclaration(UNALangParser.StaticAssertDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticAssertDeclaration(UNALangParser.StaticAssertDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(UNALangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(UNALangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(UNALangParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(UNALangParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(UNALangParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(UNALangParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterBlockItemList(UNALangParser.BlockItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitBlockItemList(UNALangParser.BlockItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(UNALangParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(UNALangParser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(UNALangParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(UNALangParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(UNALangParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(UNALangParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(UNALangParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(UNALangParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(UNALangParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(UNALangParser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(UNALangParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(UNALangParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnit(UNALangParser.TranslationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnit(UNALangParser.TranslationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExternalDeclaration(UNALangParser.ExternalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExternalDeclaration(UNALangParser.ExternalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(UNALangParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(UNALangParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UNALangParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationList(UNALangParser.DeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UNALangParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationList(UNALangParser.DeclarationListContext ctx);
}