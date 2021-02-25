package parsing

import EveBaseVisitor
import EveLexer
import EveParser
import language.Declaration
import language.FunctionDeclaration
import language.MemberDeclaration
import language.StructureDeclaration
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream


object DeclarationParser : EveBaseVisitor<Any>() {

    override fun visitStructureDeclaration(ctx: EveParser.StructureDeclarationContext) =
        StructureDeclaration(
            ctx.Identifier().text,
            ctx.genericParametersBlock()?.genericParameterList()?.genericParameter()?.map { it.text } ?: emptyList(),
            ctx.structurePrototype().let(TypeParser::visitStructurePrototype)
        )

    override fun visitFunctionDeclaration(ctx: EveParser.FunctionDeclarationContext) =
        FunctionDeclaration(
            ctx.Identifier().text,
            emptyList(),
            ctx.functionPrototype().let(TypeParser::visitFunctionPrototype),
            ctx.functionBody().expression().map(ExpressionParser::visit)
        )

    override fun visitMemberDeclaration(ctx: EveParser.MemberDeclarationContext) =
        MemberDeclaration(
            ctx.Identifier().text,
            emptyList(),
            ctx.type().let(TypeParser::visit),
            ctx.memberDeclarationGet()?.let { it.functionBody()?.expression()?.map(ExpressionParser::visit) },
            ctx.memberDeclarationSet()?.let { it.functionBody()?.expression()?.map(ExpressionParser::visit) }
        )

    override fun visitCompilationUnit(ctx: EveParser.CompilationUnitContext) =
        sequence {

            for (structure in ctx.structureDeclaration())
                yield(visitStructureDeclaration(structure))

            for (function in ctx.functionDeclaration())
                yield(visitFunctionDeclaration(function))

            for (member in ctx.memberDeclaration())
                yield(visitMemberDeclaration(member))

        }


    fun parseFunction(str: String): FunctionDeclaration {
        val lexer = EveLexer(CharStreams.fromString(str))
        val parser = EveParser(CommonTokenStream(lexer))
        return visitFunctionDeclaration(parser.functionDeclaration())
    }

    fun parseStructure(str: String): StructureDeclaration {
        val lexer = EveLexer(CharStreams.fromString(str))
        val parser = EveParser(CommonTokenStream(lexer))
        return visitStructureDeclaration(parser.structureDeclaration())
    }

    fun parseCompleteSource(str: String) =
        sequence<Declaration> {
            val lexer = EveLexer(CharStreams.fromString(str))
            val parser = EveParser(CommonTokenStream(lexer))

            for (structure in parser.compilationUnit().structureDeclaration())
                yield(visitStructureDeclaration(structure))

            for (function in parser.compilationUnit().functionDeclaration())
                yield(visitFunctionDeclaration(function))

        }

}

