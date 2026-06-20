package ifeel.shubham.mykotlinjourney.lesson07

fun main() {
    val fruits = listOf("Apple", "Banana", "Mango")

    println(fruits[0])        // Apple
    println(fruits.size)      // size = 3
    println(fruits.first())   // first element = Apple
    println(fruits.last())    // last element = Mango

    // fruits[0] = "Orange"   ❌ ERROR — can't modify
    // fruits.add("Orange")   ❌ ERROR — function doesn't even exist

    // experiment
    val hello = listOf("Hello", 1, 2, 3, "World")
    println(hello)
}