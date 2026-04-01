package ifeel.shubham.mykotlinjourney.lesson02

fun main() {
    // Increment ++
    var value1 = 1
    value1++
    println("First Increment : $value1")
    ++value1
    println("Second Increment : $value1")
    println("Third Increment : ${value1++}")
    println("Fourth Increment : ${++value1}")
    // Pre Increment = ++Value
    // Post Increment = Value++
}