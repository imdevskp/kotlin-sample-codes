import kotlin.math.pow

fun main(){

    // print
    // =====
    //    1 byte = 1 bytes
    //    1 kilobyte = 1000 bytes
    //    1 megabyte = 1000000 bytes
    //    1 gigabyte = 1000000000 bytes
    //    1 terabyte = 1000000000000 bytes
    //    1 petabyte = 1000000000000000 bytes
    //    1 exabyte = 1000000000000000000 bytes

    val array = Array(7){1000.0.pow(it)}
    val sizes = arrayOf("byte", "kilobyte", "megabyte", "gigabyte",
        "terabyte", "petabyte", "exabyte")
    for ((i, value) in array.withIndex()) {
        println("1 ${sizes[i]} = ${value.toLong()} bytes")
    }

    // ==============================================================

    // 1. Create an integer array of numbers called numbers, from 11 to 15.
    // 2. Create an empty mutable list for Strings.
    // 3. Write a for loop that loops over the array and adds the string representation of each number to the list.

    val numbers = 11..15
    println(numbers)

    var strings = mutableListOf<String>()
    println(strings)

    for (i in numbers) strings.add(i.toString())
    println(strings)

    // ==============================================================

    // How can you use a for loop to create (a list of) the numbers between 0 and 100 that are divisible by 7?

    val div_by_seven = mutableListOf<Int>()
    println(div_by_seven)

    for (i in 0..100) {
        if (i%7==0){
            div_by_seven.add(i)
        }
    }
    println(div_by_seven)


}