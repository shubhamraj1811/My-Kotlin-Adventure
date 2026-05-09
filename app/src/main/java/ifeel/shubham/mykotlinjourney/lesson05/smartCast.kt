package ifeel.shubham.mykotlinjourney.lesson05

fun main() {
    val username: String? = "Shubham"

    // Outside — username is String? (might be null)
    // username.length  ← ❌ compiler error here
    println("Length: ${username?.length}") // -> ✅ safe
    // println("Length: ${username.length}") // -> ❌ unsafe — null check needed


    if (username != null) {
        // Inside — Kotlin KNOWS it's not null
        // Smart Cast kicks in automatically
        username.length  // ✅ perfectly safe — no ? needed
        username.uppercase() // ✅ safe
        username.reversed()  // ✅ safe
    }
}