package ifeel.shubham.mykotlinjourney.lesson07

fun main() {
    val uniqueIds = setOf(1, 2, 3, 2, 1)
    println(uniqueIds)    // [1, 2, 3] — duplicates automatically removed!
    println(uniqueIds.size)  // 3

    // sets are immutable - cant add or remove values
    // uniqueIds.add(4)
    // uniqueIds.remove(2)

    val anotherIds = setOf(1, 2, 4, 1, 1, 2, 3, 5)
}