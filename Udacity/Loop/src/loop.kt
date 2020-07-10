fun main(){
    val school = arrayOf("whale", "shark", "tuna")

    // for loop
    for (element in school) println(element)

    // loop with index
    for ((index, element) in school.withIndex()){
        println("Fish at $index is $element")
    }

    // range of letters
    for (i in 'b'..'g') println(i)

    // range of numbers
    for (i in 1..7) println(i)

    // reverse
    for (i in 5 downTo 1) println(i)

    // step
    for (i in 3..6 step 2) println(i)
}