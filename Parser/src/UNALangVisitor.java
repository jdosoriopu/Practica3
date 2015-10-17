// Generated from C:/Users/User/Documents/GitHub/Practica3/Parser\UNALang.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link UNALangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface UNALangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link UNALangParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(UNALangParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#genericSelection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericSelection(UNALangParser.GenericSelectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#genericAssocList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericAssocList(UNALangParser.GenericAssocListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#genericAssociation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericAssociation(UNALangParser.GenericAssociationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(UNALangParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentExpressionList(UNALangParser.ArgumentExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(UNALangParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(UNALangParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(UNALangParser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(UNALangParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(UNALangParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(UNALangParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(UNALangParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(UNALangParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(UNALangParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(UNALangParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(UNALangParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(UNALangParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(UNALangParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(UNALangParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(UNALangParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(UNALangParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(UNALangParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(UNALangParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(UNALangParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifiers(UNALangParser.DeclarationSpecifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifiers2(UNALangParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifier(UNALangParser.DeclarationSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclaratorList(UNALangParser.InitDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#initDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclarator(UNALangParser.InitDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageClassSpecifier(UNALangParser.StorageClassSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier(UNALangParser.TypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructOrUnionSpecifier(UNALangParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#structOrUnion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructOrUnion(UNALangParser.StructOrUnionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#structDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclarationList(UNALangParser.StructDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#structDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaration(UNALangParser.StructDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecifierQualifierList(UNALangParser.SpecifierQualifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaratorList(UNALangParser.StructDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#structDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclarator(UNALangParser.StructDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#enumSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumSpecifier(UNALangParser.EnumSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#enumeratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratorList(UNALangParser.EnumeratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#enumerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerator(UNALangParser.EnumeratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#enumerationConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerationConstant(UNALangParser.EnumerationConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicTypeSpecifier(UNALangParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#typeQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifier(UNALangParser.TypeQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#functionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSpecifier(UNALangParser.FunctionSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlignmentSpecifier(UNALangParser.AlignmentSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(UNALangParser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectDeclarator(UNALangParser.DirectDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccDeclaratorExtension(UNALangParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccAttributeSpecifier(UNALangParser.GccAttributeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#gccAttributeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccAttributeList(UNALangParser.GccAttributeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#gccAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccAttribute(UNALangParser.GccAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedParenthesesBlock(UNALangParser.NestedParenthesesBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer(UNALangParser.PointerContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#typeQualifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifierList(UNALangParser.TypeQualifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#parameterTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterTypeList(UNALangParser.ParameterTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(UNALangParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(UNALangParser.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(UNALangParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(UNALangParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractDeclarator(UNALangParser.AbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectAbstractDeclarator(UNALangParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#typedefName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedefName(UNALangParser.TypedefNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(UNALangParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#initializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerList(UNALangParser.InitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#designation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignation(UNALangParser.DesignationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#designatorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignatorList(UNALangParser.DesignatorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignator(UNALangParser.DesignatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticAssertDeclaration(UNALangParser.StaticAssertDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(UNALangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(UNALangParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(UNALangParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#blockItemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItemList(UNALangParser.BlockItemListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItem(UNALangParser.BlockItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(UNALangParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement(UNALangParser.SelectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(UNALangParser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement(UNALangParser.JumpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(UNALangParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationUnit(UNALangParser.TranslationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#externalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalDeclaration(UNALangParser.ExternalDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(UNALangParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UNALangParser#declarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationList(UNALangParser.DeclarationListContext ctx);
}