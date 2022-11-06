fun main() {
    val list1 = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val list2= arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val list3 = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val update = arrayOf(-3, -4, -5, -6, -7)

    list1.updateAtIndexes(2..6, update)

    list1.forEach(::println)
    println()

    list2.updateAtIndexes(8..9) {0}

    list2.forEach(::println)
    println()

    // list3.updateAtIndexes(2..4, update.slice(2..4).toArray {  })

    list3.updateAtIndexes(4..6,  update.slice(2..4).toTypedArray())
    list3.forEach(::println)
    println()
}