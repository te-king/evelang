package language


sealed class Type

data class NamedType(val name: String, val genericArguments: List<Type>) : Type()
data class OptionalType(val inner: Type) : Type()
data class ReferenceType(val inner: Type) : Type()
data class ArrayType(val size: Long, val inner: Type) : Type()
data class StructureType(val fields: List<FieldDeclaration>) : Type()
data class FunctionType(val parameters: List<ParameterDeclaration>, val result: Type) : Type()


val UnitType = NamedType("unit", emptyList())
val BoolType = NamedType("bool", emptyList())

val I8Type = NamedType("i8", emptyList())
val I16Type = NamedType("i16", emptyList())
val I32Type = NamedType("i32", emptyList())
val I64Type = NamedType("i64", emptyList())
val U8Type = NamedType("u8", emptyList())
val U16Type = NamedType("u16", emptyList())
val U32Type = NamedType("u32", emptyList())
val U64Type = NamedType("u64", emptyList())
val F32Type = NamedType("f32", emptyList())
val F64Type = NamedType("f64", emptyList())


fun Type.inOptional() =
    OptionalType(this)

fun Type.inReference() =
    ReferenceType(this)

fun Type.inArray(size: Long) =
    ArrayType(size, this)


fun Type.descriptivePrint(): String =
    when (this) {
        is ArrayType -> "array of $size ${inner.descriptivePrint()}(s)"
        is FunctionType -> "function creating a ${result.descriptivePrint()} from ..."
        is NamedType -> name
        is OptionalType -> "optional ${inner.descriptivePrint()}"
        is ReferenceType -> "reference(s) to ${inner.descriptivePrint()}"
        is StructureType -> "struct"
    }