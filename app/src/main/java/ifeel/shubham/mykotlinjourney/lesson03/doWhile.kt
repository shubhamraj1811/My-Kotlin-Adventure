package ifeel.shubham.mykotlinjourney.lesson03

fun main() {
    var userInput = 0

    do {
        println("Enter a number between 1-10: ")
        userInput = 7   // simulating user input
    } while (userInput < 1 || userInput > 10)

    println("You entered: $userInput")

// Output:
// Enter a number between 1-10:
// You entered: 7
}