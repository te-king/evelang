import language.descriptivePrint
import parsing.ExpressionParser
import parsing.DeclarationParser
import parsing.TypeParser

fun main() {

    ExpressionParser.parseString("val i = 0").let(::println)
    TypeParser.parseString("100?&() -> unit").let { println(it.descriptivePrint()) }
    DeclarationParser.parseStructure("type<T> list_node ( next: ?&list_node<T>, value: T )").let(::println)
    DeclarationParser.parseStructure("type<T> list ( head: ?&list_node<T> )").let(::println)

}