import java.util.*

fun main(){
    // array has some more functionalities from lists

    // create an array
    val school = arrayOf("tuna", "salmon", "shark")
    println(school)

    // we can have mixed type of values inside an array
    val mix = arrayOf("fish", 1)
    println(mix)

    // array to string
    println(mix.contentToString())

    // create an typed array
    // we can't add another type in this array
    val numbers = intArrayOf(1, 2, 3)

    // nesting arrays
    val bigSwarm = arrayOf(school, arrayOf("dolphin", "whale"))
    println(bigSwarm.contentToString())

    // initializing with dynamic code
    // initialize an array of size 5
    // each item is it's index times 2
    val array = Array(5){it * 2}
    println(array)
}