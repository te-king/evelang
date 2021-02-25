package parsing

import EveBaseVisitor
import EveLexer
import EveParser
import language.*
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream


object ExpressionParser : EveBaseVisitor<Expression>() {

    override fun visitRealExpression(ctx: EveParser.RealExpressionContext) =
        RealExpression(ctx.text.toDouble())

    override fun visitIntegerExpression(ctx: EveParser.IntegerExpressionContext) =
        IntegerExpression(ctx.text.toLong())

    override fun visitLambdaExpression(ctx: EveParser.LambdaExpressionContext) =
        LambdaExpression(ctx.functionPrototype().let(TypeParser::visitFunctionPrototype), ctx.functionBody().expression().map(::visit))

    override fun visitGetExpression(ctx: EveParser.GetExpressionContext) =
        GetExpression(ctx.Identifier().text)

    override fun visitSetExpression(ctx: EveParser.SetExpressionContext) =
        SetExpression(ctx.Identifier().text, ctx.expression().let(::visit))

    override fun visitCallExpression(ctx: EveParser.CallExpressionContext) =
        CallExpression(ctx.Identifier().text, ctx.expressionList()?.expression()?.map(::visit) ?: emptyList())

    override fun visitMemberGetExpression(ctx: EveParser.MemberGetExpressionContext) =
        MemberGetExpression(ctx.expression().let(::visit), ctx.Identifier().text, ctx.expressionList()?.expression()?.map(::visit) ?: emptyList())

    override fun visitMemberSetExpression(ctx: EveParser.MemberSetExpressionContext) =
        MemberSetExpression(ctx.expression(0).let(::visit), ctx.Identifier().text, ctx.expressionList()?.expression()?.map(::visit) ?: emptyList(), ctx.expression(1).let(::visit))

    override fun visitMemberCallExpression(ctx: EveParser.MemberCallExpressionContext) =
        MemberCallExpression(ctx.expression().let(::visit), ctx.Identifier().text, ctx.expressionList()?.expression()?.map(::visit) ?: emptyList())

    override fun visitDeclarationExpression(ctx: EveParser.DeclarationExpressionContext) =
        DeclarationExpression(ctx.Identifier().text, ctx.expression().let(::visit))


    fun parseString(str: String): Expression {
        val lexer = EveLexer(CharStreams.fromString(str))
        val parser = EveParser(CommonTokenStream(lexer))
        return ExpressionParser.visit(parser.expression())
    }

}