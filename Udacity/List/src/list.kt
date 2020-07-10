fun main(){
    // you can't reassign the entire 'val' list
    // bu we can manipulate using add, remove ...
    val myList = mutableListOf("tuna", "salmon", "shark")
    println(myList)
    // myList = mutableListOf("blue whale") // this will throw error

    // we can reassign as we well as manipulate 'var' list
    var listTwo = mutableListOf("tuna", "salmon", "shark")
    println(myList)
    listTwo = mutableListOf("blue whale", "dolphin")
    println(myList)
}
