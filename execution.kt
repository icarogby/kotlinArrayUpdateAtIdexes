fun main() {
    val list = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val update = arrayOf(-3, -4, -5, -6, -7)

    list.forEach(::println)
    println()

    list.updateAtIndexes(2..6, update)

    list.forEach(::println)
    println()

    list.updateAtIndexes(8..9) {0}

    list.forEach(::println)
    println()
}