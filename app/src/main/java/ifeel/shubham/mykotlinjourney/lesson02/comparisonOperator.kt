package ifeel.shubham.mykotlinjourney.lesson02

fun main() {
    print("Enter Value of a: ")
    val a = readln().toIntOrNull() ?: 0
    print("Enter Value of b: ")
    val b = readln().toIntOrNull() ?: 0

    println("a == b : ${a==b}")
    println("a != b : ${a!=b}")
    println("a > b : ${a>b}")
    println("a < b : ${a<b}")
    println("a >= b : ${a>b}")
    println("a <= b : ${a<b}")

}