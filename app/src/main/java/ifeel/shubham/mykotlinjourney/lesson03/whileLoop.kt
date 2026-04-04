package ifeel.shubham.mykotlinjourney.lesson03

fun main() {
    var attempts = 0
    val maxAttempts = 3

    while (attempts < maxAttempts) {
        println("Login attempt ${attempts + 1}")
        attempts++
    }
    println("Account locked!")
}