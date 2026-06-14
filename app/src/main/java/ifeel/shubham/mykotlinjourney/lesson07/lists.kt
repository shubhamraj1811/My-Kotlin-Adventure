package ifeel.shubham.mykotlinjourney.lesson07

fun main() {
    val fruits = listOf("Apple", "Banana", "Mango")

    println(fruits[0])        // Apple
    println(fruits.size)      // 3
    println(fruits.first())   // Apple
    println(fruits.last())    // Mango

    // fruits[0] = "Orange"   ❌ ERROR — can't modify
    // fruits.add("Orange")   ❌ ERROR — function doesn't even exist
}