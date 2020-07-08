fun main(){

    // If you start with 2 fish,
    // and they breed twice,
    // producing 71 offspring the first time,
    // and 233 offspring the second time,
    // and then 13 fish are swallowed by a hungry moray eel,
    // how many fish do you have left?
    // How many aquariums do you need if you can put 30 fish per aquarium?
    var fish1 = 2
    fish1 += 71
    fish1 += 233
    fish1 -= 13
    var aquariums1 = fish1/30
    aquariums1 += 1
    println(aquariums1)

    // Hint: You can chain method calls.
    var fish2 = 2
    var aquariums2 =fish2.plus(71).plus(233).minus(13).div(30).plus(1)
    println(aquariums2)


    // Create a String variable rainbowColor, set its color value, then change it.
    // Create a variable blackColor whose value cannot be changed once assigned. Try changing it anyway.
    var rainbowColor = "green"
    rainbowColor = "blue"
    println(rainbowColor)

    val blackColor = "black"
    println(blackColor)


    // Try to set rainbowColor to null. Declare two variables, greenColor and blueColor.
    // Use two different ways of setting them to null.
    // rainbowColor = null // we can't set a variable null
    var greenColor = null
    var blueColor:String? = null


    // Create a list with two elements that are null; do it in two different ways.
    // Next, create a list where the list is null.
    var list1:List<Int?> = listOf(null, null)
    var list2:List<Int>? = null


    // Create a nullable integer variable called nullTest, and set it to null.
    // Use a null-check that increases the value by one if it's not null, otherwise returns 0, and prints the result.
    var nullTest:Int? = null
    println(nullTest?.inc() ?:0)
}