fun main(){

    // Integer
    // =======
    // Name	    Bit (Size)  Min Value               Max Value
    // Long	    64	        -9,223,372,036,854…	    9,223,372,036,854…
    // Int	    32	        -2,147,483,648	        2,147,483,647
    // Short	16	        -32,768	                32,767
    // Byte	    8	        -128	                127
    var largeNum:Long = 52456262542525
    var mediumNum:Int = 43314314
    var num:Short = 4315
    var smallNum = 2

    // Floating
    // ========
    // Name	    Bit (Size)	    Decimal Digit Precision
    // Double	64	            15-16
    // Float	32	            6-7
    var highPrecNum:Double = 35.2546254254252
    var lowPrecNum:Float = 2.9F

    // Arithmatic operations
    // =====================
    //  +   addition
    //  -   subtraction
    //  *   multiplication
    //  /   division
    //  %   modulus (divides and gives the remainder)
    println(3+5)
    println(5-2)
    println(4*2)
    println(6/2)
    println(5%3)

    // Order of operations
    // ===================
    // The compiler will evaluate this expression in a left to right order
    // Parentheses
    // Multiplication
    // Division
    // Modulus
    // Addition
    // Subtraction
    println(2*3+5-2*(6/2)+(5%3))

    // Exponents / Power
    // =================
    // Kotlin does not have an exponent operator and
    // instead relies on the .pow() function to calculate exponentiation

    // Augmented operation
    // ===================
    // Augmented assignment operators execute a calculation and reassign its result to a variable all in one step.
    // Each consists of an arithmetic operator immediately followed by the = operator.
    // Long Syntax:
    //      a = a + b
    // Short Syntax with an Augmented Assignment Operator:
    //      a += b

    // Increment and decrement
    // =======================
    // An increment operator represents the addition of 1 to a variable using two consecutive plus operators, ++:
    //      variableName++
    // The decrement operator represents the subtraction of 1 from a variable using two consecutive minus operators, --:
    //      variableName--

    // Math library
    // ============
    // mathematical operations we can reference the Math library which is inherited from Java
    // It consists of various mathematical functionalities
    // Math.pow() returns the first value raised to the power of the second value.
    // Math.min() returns the minimum value from two given numbers.
    // Math.random() returns a randomly generated number between 0 and 1.

    // You can use underscores to make number constants more readable:
    val oneMillion = 1_000_000
    println(oneMillion)

    // To specify the Long value explicitly, append the suffix L to the value.
    val oneLong = 1L // Long
    println(oneLong)
}