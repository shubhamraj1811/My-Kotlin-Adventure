package ifeel.shubham.mykotlinjourney.lesson04

/*
------- Basic Structure -------
fun functionName(parameter: Type): ReturnType {
    // body
    return value
}
 */

// ------- First Function -------
fun greetUser() {
    println("Welcome to the app!")
}

fun main() {
    greetUser()   // calling the function
    greetUser()   // call it again — reusable!
    greetUser()   // and again
    greetUser()   // and again
}
// Output:
// Welcome to the app!
// Welcome to the app!
// Welcome to the app!
// Welcome to the app!