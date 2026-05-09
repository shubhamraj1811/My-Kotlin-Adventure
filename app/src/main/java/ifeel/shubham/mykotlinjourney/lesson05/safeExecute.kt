package ifeel.shubham.mykotlinjourney.lesson05

fun main() {
    val username: String? = "Shubham"

    // ?.let only runs if username is NOT null
    // 'it' refers to the non-null value inside
    username?.let {
        println("Welcome, $it!")         // Welcome, Shubham!
        println("Username has ${it.length} characters")  // 7 characters
    }

    val nullName: String? = null
    nullName?.let {
        println("This NEVER prints")     // skipped entirely
    }

    // -----------
    // let Returns a Value Too

    val username5: String? = "shubham_dev"

    val formattedName = username5?.let {
        it.uppercase().replace("_", " ")
    } ?: "GUEST"

    println(formattedName)    // SHUBHAM DEV

    // If username was null:
    val username6: String? = null
    val formattedName2 = username6?.let {
        it.uppercase()
    } ?: "GUEST"
    println(formattedName2)   // GUEST
}