package ifeel.shubham.mykotlinjourney.lesson04

// Both are identical — Unit is the default
fun logMessage1(message: String): Unit {
    println("[LOG] $message")
}

fun logMessage2(message: String) {
    println("[LOG] $message")
}

fun main() {
    logMessage1("Hello World!")
    logMessage2("Namastey Duniya!")
}

// Output:
// [LOG] Hello World

//Think of Unit like void in Java. In practice, you never write it — Kotlin assumes it when there's no return type.