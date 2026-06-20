package ifeel.shubham.mykotlinjourney.lesson07

fun main() {
    // "key" to "value"
    val capitals = mapOf(
        "India" to "New Delhi",
        "Japan" to "Tokyo",
        "France" to "Paris"
    )

    println(capitals["India"])     // New Delhi
    println(capitals["Germany"])   // null — key doesn't exist!
    println(capitals.size)         // 3
}