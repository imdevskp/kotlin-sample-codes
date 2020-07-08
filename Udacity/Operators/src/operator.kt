fun main(){

    // numerical operations
    // ====================
    println(1+1)
    println(5-2)
    println(9*3)
    println(7/3) // integer division gives integer
    println(7.0/3/0)

    // variables
    // =========
    var fish=10 // variable
    println(fish*5)

    // kotlin keep numbers as primitives
    // but it will let you use methods on them like they are objects
    println(fish.plus(3))
    println(fish.minus(4))
    println(fish.times(4))
    println(fish.div(4))

    // kotlin also supports object wrappers for numbers
    println(1.toLong())

    // all the numeric types in kotlin has a secret type called 'Numbers'
    var boxed: Number = 1
    println(boxed.toLong())

    // mutable variable
    // ================
    var apple = 3
    println(apple)

    // non-mutable variable
    // ====================
    val orange = 5
    println(orange)

    println(apple+orange)

    // casting : from one datatype to another datatype
    // ================================================
    println(orange.toFloat())

    // kotlin support underscores with numbers, for readability
    // =========================================================
    val oneMillion = 1_000_000
    println(oneMillion)

    // nullability
    // ===========
    // by default a variable can't be null
    // use the '?' to indicate the variable can be null
    var marbles:Int? = null


}
