fun main(){
    // List
    // ====
    // A list is a type of Kotlin Collection that contains ordered elements.

    // Immutable list
    // ==============
    // An immutable list is declared with listOf and indicates a list whose values cannot change throughout a program.
    var vowels = listOf('A', 'E', 'I', 'O', 'U')
    print(vowels)

    // Mutable list
    // =============
    // A mutable list is declared with mutableListOf and indicates a list whose values can be altered.
    var primeNumbers = mutableListOf(3, 5, 7, 11, 13)
    print(primeNumbers)

    // Accessing elements
    // ==================
    // Elements within a list can be accessed using their index.
    println(primeNumbers[1])

    // Properties
    // =========
    // The size property returns the number of elements in a collection.
    println(primeNumbers.size)
    // The lastIndex property returns the last index of a collection.
    println(primeNumbers.lastIndex)

    // Functionalities
    // ===============
    // Immutable lists possess read-only functionalities, meanwhile, mutable lists support both read and write functionalities.

    // The contains() function checks if an element exists in a given list. It returns a Boolean true or false.
    println(primeNumbers.contains(1))
    println(primeNumbers.contains(4))

    // The add() function appends an element to the end of a mutable list.
    primeNumbers.add(17)
    println(primeNumbers)

    // The remove() function removes an element from a mutable list.
    primeNumbers.remove(3)
    println(primeNumbers)

    // The random() function generates a random element from a given list.
    println(primeNumbers.random())

    // sort
    primeNumbers.sort()
    println(primeNumbers)

    // shuffle
    primeNumbers.shuffle()
    println(primeNumbers)

    // reverse
    primeNumbers.reverse()
    println(primeNumbers)

    println(primeNumbers.max())
    println(primeNumbers.min())

    println(primeNumbers.sum())
    println(primeNumbers.average())

    println(primeNumbers.first())
    println(primeNumbers.last())
}