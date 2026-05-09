package ifeel.shubham.mykotlinjourney.lesson05

fun main() {
    val username: String? = null

    // ❌ Dangerous — crashes if null
    // println(username.length)    // NullPointerException 💥

    // ✅ Safe call — returns null if username is null
    println(username)           // prints null
    println(username?.length)   // prints: null (safely)

    val username2: String? = "Shubham"
    println(username2?.length)  // prints: 7
}