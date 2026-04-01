package ifeel.shubham.mykotlinjourney.lesson02

fun main() {
    // to
    val pair = "India" to "New Delhi"
    println(pair)           // (India, New Delhi)
    println(pair.first)     // India
    println(pair.second)    // New Delhi
    // We'll see this constantly in Android with Maps:
    val capitals = mapOf(
        "India" to "New Delhi",
        "Japan" to "Tokyo",
        "France" to "Paris"
    )

    // is
    val value: Any = "Hello"

    println(value is String)   // true
    println(value is Int)      // false
}