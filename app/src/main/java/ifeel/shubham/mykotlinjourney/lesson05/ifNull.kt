package ifeel.shubham.mykotlinjourney.lesson05

fun main() {
    val username: String? = "Shubham"
    // simple null check
    if (username != null) {
        println("Hello, $username!")            // kotlin knows this is safe
        println("Length: ${username.length}")   // kotlin knows this is safe
    } else {
        println("No user logged in!")           // kotlin knows not safe - did not used the variable
    }
}