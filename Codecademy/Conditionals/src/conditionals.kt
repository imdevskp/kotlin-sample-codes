fun main(){

    // if
    // ==
    var isTuesday = true
    if(isTuesday){
        println("Take out the trash")
    }

    // if else
    // =======
    var isHerbivore = false
    var diet: String
    if (isHerbivore) {
        diet = "vegetables"
    } else {
        diet = "meat"
    }
    println("This animal can eat $diet.")

    // else if
    // =======
    var temp = 60
    if (temp > 65) {
        println("Wear a t-shirt")
    } else if (temp > 45) {
        println("Wear a light coat")
    } else {
        println("Wear a winter coat")
    }

    // comparison
    // ==========
    var liquidTemp = 50 // Fahrenheit
    if (liquidTemp >= 212) {
        println("The liquid will vaporize.")
    } else {
        println("The liquid will remain liquid.")
    }

    // equality
    // ========
    var userPassword = "secret884"
    var attemptedPassword = "secret884"
    if (userPassword == attemptedPassword) {
        println("The password you entered is correct.")
    }

    // Logical
    // =======
    // logical - and
    var isSunny = true
    var temp1 = 85
    if (isSunny && temp1 > 80) {
        println("Wear sunglasses.")
    }
    // logical - or
    var isSnowing = false
    var temp2 = 38
    if (isSnowing || temp2 < 40 ) {
        println("Wear a scarf.")
    }
    // logical - not
    var isSnowing1 = true
    println(!isSnowing1)

    // when
    // ====
    var lightColor = "red"
    when (lightColor) {
        "green" -> println("Go.")
        "yellow" -> println("Slow down.")
        "red" -> println("Stop.")
        else -> println("Not a valid traffic light color.")
    }

    // range
    // =====
    var num = 5
    if (num in 1..10) {
        println("This value is between 1 and 10.")
    }

    var letter = 'c'
    when (letter) {
        in 'a'..'m' -> println("Letter is in 1st half of alphabet.")
        in 'n'..'z' -> println("Letter is in 2nd half of alphabet.")
        else -> println("Not a valid value")
    }
}