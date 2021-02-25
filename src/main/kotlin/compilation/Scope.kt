package compilation

import language.*


interface Scope {

    operator fun get(symbol: String): Declaration?

}

class GlobalScope(
    val targetInformation: TargetInformation,
    val declarations: List<Declaration>
) : Scope {

    override fun get(symbol: String): Nothing? = null

}

class FunctionBodyScope(
    val parent: GlobalScope,
    val functionDeclaration: FunctionDeclaration
) : Scope {

    override fun get(symbol: String) = functionDeclaration.type.parameters.firstOrNull { it.name == symbol } ?: parent.declarations.firstOrNull { it.name == symbol && (it is StructureDeclaration || it is FunctionDeclaration) }

}

class StructureDeclarationScope(
    val parent: GlobalScope
): Scope {

    override fun get(symbol: String): Declaration? {
        TODO("Not yet implemented")
    }

}