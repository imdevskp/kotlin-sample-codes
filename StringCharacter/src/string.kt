fun main(){
    // String
    // ======
    // String in Kotlin is a sequence of characters wrapped in double-quotes.
    // Its characters can include various combinations of digits, letters, symbols, and whitespace.
    // It is denoted by the String type.
    // format : var variableName: String = "some text"
    var catName : String = "Top"
    print(catName)

    // Character
    // =========
    // A character is a data type representing a single letter, digit, or symbol wrapped in single quotes.
    // It is denoted by the Char type.
    // format : var variableName: Char = 'A'
    var firstLetter: Char = 'A'
    print(firstLetter)

    // String concatenation
    // ====================
    // Strings in Kotlin can stand alone or be combined with other Strings in a process known as String concatenation.
    // With a plus operator, +, we are able to concatenate or append one String to another
    // resulting in a new word, phrase, or sentence.
    var firstName = "Mike"
    var lastName = "Wazowski"
    println(firstName + " " + lastName)
    val userGreeting = firstName + " " + lastName + ", how are you doing today?"
    println(userGreeting)

    // String templates
    // ================
    // String templates contain a String with any variable names preceded by a $ symbol
    val passengerName = "Alex"
    val trainNumber = 2039
    val timeOfDeparture = "16:00"
    val timeOfArrival = "20:00"
    println("Mrs. $passengerName will be on the $trainNumber train departing at $timeOfDeparture to DevCity and arriving at $timeOfArrival.")

    // String properties
    // =================
    // a property provides information on a particular value
    val tallestMountain = "Mount Everest"
    print(tallestMountain.length)

    // String functions
    // ================
    // a String data type also contains built-in functions that can be used to perform certain actions on the String it’s appended on
    var name = "codecademy"
    println(name.capitalize())
    println(name)

    // Escape characters
    // ==================
    // \n Inserts a new line
    // \t Inserts a tab
    // \r Inserts a carriage return
    // \' Inserts a single quote
    // \" Inserts a double quote
    // \\ Inserts a backslash
    // \$ Inserts the dollar symbol
    print("\"May the Force be with you.\" - Star Wars, 1977")
}