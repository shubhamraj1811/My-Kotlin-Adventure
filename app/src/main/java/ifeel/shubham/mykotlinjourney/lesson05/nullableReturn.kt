package ifeel.shubham.mykotlinjourney.lesson05

// This function might not find a user — returns null if not found
fun findUser(id: Int): String? {
    val users = mapOf(1 to "Shubham", 2 to "Priya", 3 to "Rahul")
    return users[id]    // returns null if id doesn't exist
}

fun main() {
    val user1 = findUser(1)     // exist
    val user2 = findUser(99)    // doesn't exist

    // Handle both cases

    println("------- Handle Using Elvish ---------")
    println(user1 ?: "User not found")    // Shubham
    println(user2 ?: "User not found")    // User not found

    // Or with let
    println("------- Handle Using let ---------")
    user1?.let { println("Found: $it") }     // Found: Shubham
    user2?.let { println("Found: $it") }     // (nothing prints)
}