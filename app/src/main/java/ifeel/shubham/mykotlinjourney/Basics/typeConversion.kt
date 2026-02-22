package ifeel.shubham.mykotlinjourney.Basics
// type conversion
fun main() {
    val i: Int = 6
    println(" i = $i")

    val b1 = i.toByte()
    println("b1 = $b1")

    val b2: Byte = 1
    println("B2 = $b2")

    //    val i1: Int = b2
    // this is not allowed in kotlin for more security...
    val i2: Int = b2.toInt()
    println("i2 = $i2")
    val i3: String = b2.toString()
    println("i3 = $i3")
    val i4: Double = b2.toDouble()
    println("i4 = $i4")

    // To make long numeric constants more readable, Kotlin allows you to place underscores in the numbers, where it makes sense to you. Try entering different numeric constants.
    val million = 1_000_000
    println("One Million = $million")
    val hexBytes = 0xFF_EC_DE_5E
    println("Hex = $hexBytes")

    val fish = 5
    val apple = 10
    println("I have $fish fishes and $apple apples.")
}