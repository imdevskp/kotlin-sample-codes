fun main(){
    // Set
    // ===
    // A set is an un-ordered collection of unique elements.

    // Immutable set
    // =============
    // An immutable set is declared using the setOf keyword
    // It indicates a set whose values cannot change throughout a program:
    // var setName = setOf(val1, val2, val3)

    var apolloLandingSites = setOf("Mare Tranquillitatis", "Fra Mauro", "Hadley/Apennines", "Descartes")
    println(apolloLandingSites)

    // Mutable set
    // ===========
    // With mutable sets, we are able to add, remove, or replace as many elements as we’d like.
    // The term, mutableSetOf is used to declare a mutable set.

    var colorsOfTheRainbow = mutableSetOf("red", "orange", "yellow", "green", "blue", "red")
    println(colorsOfTheRainbow)

    // Accessing elements
    // ==================
    // Unlike lists, a set is an un-ordered collection,
    // thus we can’t use square brackets and indices to retrieve its elements.
    // However, a set is an intelligent tool that stores its elements in the order in which each element was inserted.
    // We can utilize this order along with a function, elementAt(), to access and retrieve elements.

    println(colorsOfTheRainbow.elementAt(2))
    println(colorsOfTheRainbow.elementAtOrNull(10))

    // Adding elements
    // ===============
    // .add - To add a single element to a set
    // .addAll() - If we were interested in adding many elements to a set at once
    // .clear() - We can also remove all elements from a collection using the clear() function.

    colorsOfTheRainbow.add("indigo")
    println(colorsOfTheRainbow)

    var colors = listOf("violet", "white", "black")
    colorsOfTheRainbow.addAll(colors)
    println(colorsOfTheRainbow)

    colorsOfTheRainbow.clear()
    println(colorsOfTheRainbow)

    // Additional functions
    // ====================
    var numbers = setOf(10, 15, 20, 25)
    println(numbers)
    // To retrieve, the first element of any set, we can use the first() function:
    println(numbers.first()) // 10
    // To retrieve the last element of any set, we can use the last() function:
    println(numbers.last()) // 25
    // To sum up all of the elements in a set, we can use the sum() function:
    println(numbers.sum()) // 70
}
