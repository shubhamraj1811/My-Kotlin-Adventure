package ifeel.shubham.mykotlinjourney.basics

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
    var age = 21
    age = 22
    println("My age is $age")
}
