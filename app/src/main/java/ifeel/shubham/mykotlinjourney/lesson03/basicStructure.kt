package ifeel.shubham.mykotlinjourney.lesson03

fun main() {
    /* -----
    if (condition) {
        // runs if condition is TRUE
    } else {
        // runs if condition is FALSE
    }
    ----- */

    // ----- Real App Example -----
    val user = "Shubham"
    val isLoggedIn = true
    if(isLoggedIn)
        println("Welcome Back $user!")
    else
        println("Please log in...")

    // ----- More Conditional Uses -----
    println("Enter Battery Status: ")
    val batteryLevel = readln().toIntOrNull() ?: 50
    if (batteryLevel > 50) {
        println("Battery is good")
    } else if (batteryLevel > 20) {
        println("Battery is okay")
    } else if (batteryLevel > 10) {
        println("Battery is low — plug in soon")
    } else {
        println("Critical battery — plug in now!")
    }
}