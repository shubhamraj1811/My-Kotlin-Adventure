package ifeel.shubham.mykotlinjourney.week01

fun main() {
    // string interpolation
    var name = "Shubham"
    val age = 20
    name = "Raj"
    println("Hi $name, how are you doing?")
    println("And you are ${age+1}.")
}

// what is happening here ->
// name variable is created and it points to "Shubham", alloted in the memory
// when updated to "Raj"
// New string "Raj" is created
// name variable is made to point Raj