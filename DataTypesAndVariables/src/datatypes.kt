fun main(){
    // mutable variable
    // =============================
    // mutable variable's value can change
    // `var` keyword specifies beginning of a variable declaration
    // followed by name of the variable
    // it has to be in camel case, concise and descriptive
    // then the type of data, type must always be capital
    // we dont' have to initialize with a value always
    // value can be assigned using '=' and followed by the value
    // format : var variableName: Type = value

    var notePlayed: String // declaration
    notePlayed = "B" // initialization
    println(notePlayed) // Prints: B

    var guitarName: String = "Fender Stratocaster"
    println(guitarName)

    var todaysDate:String = "June 29, 2020"
    println(todaysDate)

    var currentWeather:String = "Cloudy"
    println(currentWeather)

    // immutable variable
    // ==================
    // immutable variable's value cannot change after its initialization
    // denoted by the val keyword and are often referred to as constants in some languages
    // format : val variableName: Type = value

    val goldenRatio: Double = 1.618
    println(goldenRatio)

    // var vs val
    // ==========
    // declare variables with var only if we’re certain the value will change somewhere throughout the program,
    // otherwise always use val

    // Data type inference
    // Type inference indicates that the compiler can infer the type of a declared variable,
    // and its data type can be omitted in the declaration

    // with type
    var lightsOn: Boolean = true
    println(lightsOn)

    // without type
    var lightsOff = false
    println(lightsOff)

}