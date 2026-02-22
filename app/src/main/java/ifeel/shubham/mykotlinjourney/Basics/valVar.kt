package ifeel.shubham.mykotlinjourney.Basics

fun main() {
    // immutable
    // This is the variable which value cannot be changed after initialization.
    val pi = 3.14159
    val myCollege = "GEC Lakhisarai"
    // pi = 3.14  <-- This would cause a compilation error!
    println("Value of Pi is $pi")
    println("My college is $myCollege")

    // mutable
    // This is the variable which value can be changed after initialization.
    var age = 20
    age = 22
    println("My age is $age")

    // Real World Example of Val vs Var
    // A Person Creating a Profile
    val userid = "ae345hjikl" // userid is fixed

    var username = "Shubham" // username may change
    username = "Prism"

    var pass = 98765 // password might change
    pass = 123456

    val DoB = "18 Nov" // Dob is Fixed

    // printing id Details
    println("User ID: $userid")
    println("Username: $username")
    println("Password: $pass")
    println("Date of Birth: $DoB")
}
