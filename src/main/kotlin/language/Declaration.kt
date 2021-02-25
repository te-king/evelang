package language

interface Declaration {
    val name: String
}

interface GenericDeclaration : Declaration {
    val generics: List<String>
}

interface ValueDeclaration : Declaration {
    val type: Type
}

data class StructureDeclaration(override val name: String, override val generics: List<String>, val type: StructureType) : GenericDeclaration
data class FunctionDeclaration(override val name: String, override val generics: List<String>, val type: FunctionType, val body: List<Expression>) : GenericDeclaration
data class MemberDeclaration(override val name: String, override val generics: List<String>, val scope: Type, val get: List<Expression>?, val set: List<Expression>?) : GenericDeclaration
data class FieldDeclaration(override val name: String, override val type: Type) : ValueDeclaration
data class ParameterDeclaration(override val name: String, override val type: Type) : ValueDeclaration
data class LocalDeclaration(override val name: String, override val type: Type) : ValueDeclaration


