// Generated from C:/Users/thomas.king/IdeaProjects/evelang\Eve.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EveParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EveVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EveParser#mulplicitiveOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulplicitiveOperator(EveParser.MulplicitiveOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link EveParser#additiveOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveOperator(EveParser.AdditiveOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code memberGetExpression}
	 * labeled alternative in {@link EveParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberGetExpression(EveParser.MemberGetExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarationExpression}
	 * labeled alternative in {@link EveParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationExpression(EveParser.DeclarationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lambdaExpression}
	 * labeled alternative in {@link EveParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(EveParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getExpression}
	 * labeled alternative in {@link EveParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetExpression(EveParser.GetExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code memberCallExpression}
	 * labeled alternative in {@link EveParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberCallExpression(EveParser.MemberCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callExpression}
	 * labeled alternative in {@link EveParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpression(EveParser.CallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulplicitiveExpression}
	 * labeled alternative in {@link EveParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulplicitiveExpression(EveParser.MulplicitiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpression}
	 * labeled alternative in {@link EveParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(EveParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code memberSetExpression}
	 * labeled alternative in {@link EveParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberSetExpression(EveParser.MemberSetExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setExpression}
	 * labeled alternative in {@link EveParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetExpression(EveParser.SetExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code realExpression}
	 * labeled alternative in {@link EveParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealExpression(EveParser.RealExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerExpression}
	 * labeled alternative in {@link EveParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerExpression(EveParser.IntegerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EveParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(EveParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link EveParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(EveParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link EveParser#fieldList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldList(EveParser.FieldListContext ctx);
	/**
	 * Visit a parse tree produced by {@link EveParser#structurePrototype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructurePrototype(EveParser.StructurePrototypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EveParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(EveParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link EveParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(EveParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link EveParser#functionPrototype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionPrototype(EveParser.FunctionPrototypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EveParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(EveParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link EveParser#genericArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericArgument(EveParser.GenericArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link EveParser#genericArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericArgumentList(EveParser.GenericArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link EveParser#genericArgumentsBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericArgumentsBlock(EveParser.GenericArgumentsBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link EveParser#genericParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericParameter(EveParser.GenericParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link EveParser#genericParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericParameterList(EveParser.GenericParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link EveParser#genericParametersBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericParametersBlock(EveParser.GenericParametersBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code namedType}
	 * labeled alternative in {@link EveParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedType(EveParser.NamedTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code optionalType}
	 * labeled alternative in {@link EveParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalType(EveParser.OptionalTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code referenceType}
	 * labeled alternative in {@link EveParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(EveParser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link EveParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(EveParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code structureType}
	 * labeled alternative in {@link EveParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructureType(EveParser.StructureTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionType}
	 * labeled alternative in {@link EveParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionType(EveParser.FunctionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EveParser#structureDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructureDeclaration(EveParser.StructureDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EveParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(EveParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EveParser#memberDeclarationGet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclarationGet(EveParser.MemberDeclarationGetContext ctx);
	/**
	 * Visit a parse tree produced by {@link EveParser#memberDeclarationSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclarationSet(EveParser.MemberDeclarationSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link EveParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(EveParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EveParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(EveParser.CompilationUnitContext ctx);
}