fun main(){
    // Maps
    //  A map consists of a group of key-value pairs where each key corresponds to a single value.

    // Immutable map
    // An immutable map contains read-only entries that cannot be altered

    var codeysMap = mapOf(
        "valley" to "scorpions",
        "creek" to "snakes",
        "forest" to "bears")
    println(codeysMap)

    // Mutable maps
    // have more control of the data they hold

    var tvShows = mutableMapOf(
        "The Big Bang Theory" to 278,
        "Modern Family" to 250,
        "Bewitched" to 254,
        "That '70s Show" to 200)
    println(tvShows)

    // Using the [key] syntax, we are able to retrieve and reassign key values.
    tvShows["The Big Bang Theory"] = 279
    println(tvShows)

    // With the map collection, we are able to retrieve a value using the shorthand [key] syntax.
    println(codeysMap["creek"])

    // we can gather all keys at once using the keys property
    println(codeysMap.keys)

    // a set of all map values can be returned using the values property
    println(codeysMap.values)

    // Adding and removing

    var nationalTrees = mutableMapOf(
        "Italy" to "Strawberry Tree",
        "Greece" to "Olive",
        "Romania" to "Oak",
        "Canada" to "Maple")
    println(nationalTrees)

    // put() function to add a new entry to the mutable map
    nationalTrees.put("Albania", "Olive")
    println(nationalTrees)

    // to remove an entry from the map, we can use the remove()
    nationalTrees.remove("Canada")
    println(nationalTrees)
}