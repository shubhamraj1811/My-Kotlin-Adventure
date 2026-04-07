package ifeel.shubham.mykotlinjourney.lesson04

/* --------
fun greetUser(name: String, greeting: String = "Welcome") {
    println("$greeting, $name!")
}

fun main() {
    greetUser("Shubham")                  // Welcome, Shubham!
    greetUser("Priya", "Good morning")    // Good morning, Priya!
    greetUser("Rahul", "Namaste")         // Namaste, Rahul!
}
 --------- */

// experiment

fun hello(name: String = "World", age:Int = 100){
    println("Hello This is $name")
    println("I am $age")
}
fun main() {
    // no param
    hello()
    // one param
    hello("Shubham")
    // one param
    hello("21")
    // both
    hello("Shubham", 22)
}