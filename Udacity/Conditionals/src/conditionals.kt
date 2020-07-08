fun main(){

    // equality operators
    println("apple"=="apple")
    println("apple"!="apple")
    println("apple"=="orange")

    // comparison operators
    println(10<2)
    println(3>4)
    println(3>=2)
    println(6<=4)

    // logical operators
    println(true and true)
    println(true or false)
    println(true xor false)
    println(! false)

    // if
    if (2>1) println("2 is bigger")

    // if else
    var n = 10
    if (n%2==0)
        println("even number")
    else
        println("odd number")

    // else if
    var m = 10
    if (m<0)
        println("negative number")
    else if (m==0)
        println("zero")
    else
        println("positive number")

    // range
    var x = 4
    if (x in 1..10)
        print("x is between 1 and 10")

    // when (kotlin's version of case)
    var a = 3
    when (a) {
        1 -> println("one")
        2 -> println("two")
        3 -> println("three")
    }

}