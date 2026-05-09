package ifeel.shubham.mykotlinjourney.lesson05

fun main() {
    val username: String? = null

    // without elvish verbose
    val displayName: String
    if (username != null) {
        displayName = username
    } else {
        displayName = "Guest"
    }

    // with Elvish
    val displayName1 = username?: "Guest"
    println(displayName1)

    // when not null
    val username2: String? = "Shubham"
    val displayName2 = username2 ?: "Guest"
    println(displayName2)   // Shubham

    // ----
    println("---------------- Experimenting ---------------")
    val username3: String? = null
    val displayName3 = username3 ?: "Guest"
    println(displayName3)   // Guest
}