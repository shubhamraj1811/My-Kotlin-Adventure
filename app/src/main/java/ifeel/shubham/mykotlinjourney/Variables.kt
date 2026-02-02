package ifeel.shubham.mykotlinjourney

fun main () {
    // immutable - val
    val name = "Shubham"
//    name = "Raj" [not possible]

    // mutable - var
    var age = 21
    age = age+1 // mutable

    println("My name is $name and I am $age years old")
    println("Next year I will be ${age+1} years old")
}