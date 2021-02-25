package parsing

import EveBaseVisitor
import EveLexer
import EveParser
import language.*
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream


object TypeParser : EveBaseVisitor<Type>() {

    override fun visitStructurePrototype(ctx: EveParser.StructurePrototypeContext) =
        StructureType(
            ctx.fieldList()?.field()?.map { FieldDeclaration(it.Identifier().text, it.type().let(::visit)) } ?: emptyList()
        )

    override fun visitFunctionPrototype(ctx: EveParser.FunctionPrototypeContext) =
        FunctionType(
            ctx.parameterList()?.parameter()?.map { ParameterDeclaration(it.Identifier().text, it.type().let(::visit)) } ?: emptyList(),
            ctx.type()?.let(::visit) ?: UnitType
        )


    override fun visitNamedType(ctx: EveParser.NamedTypeContext) =
        NamedType(ctx.Identifier().text, ctx.genericArgumentsBlock()?.genericArgumentList()?.genericArgument()?.map(::visit) ?: emptyList())

    override fun visitOptionalType(ctx: EveParser.OptionalTypeContext) =
        OptionalType(ctx.type().let(::visit))

    override fun visitReferenceType(ctx: EveParser.ReferenceTypeContext) =
        ReferenceType(ctx.type().let(::visit))

    override fun visitArrayType(ctx: EveParser.ArrayTypeContext) =
        ArrayType(ctx.Number().text.toLong(), ctx.type().let(::visit))

    override fun visitStructureType(ctx: EveParser.StructureTypeContext) =
        visitStructurePrototype(ctx.structurePrototype())

    override fun visitFunctionType(ctx: EveParser.FunctionTypeContext) =
        visitFunctionPrototype(ctx.functionPrototype())


    fun parseString(str: String): Type {
        val lexer = EveLexer(CharStreams.fromString(str))
        val parser = EveParser(CommonTokenStream(lexer))
        return visit(parser.type())
    }

}