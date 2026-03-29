package ifeel.shubham.mykotlinjourney.lesson01

//Exercise 002: The Merchant's Shop🛠 Exercise 6: The Merchant's Shop

fun main() {
    // The Setup
    print("Enter your Hero Name: ")
    val heroName: String = readln()

    // Enter Shop
    println("Greetings $heroName! Welcome to the Caster Shop.")
    println("Tell me what do you want to buy?")
    val itemName: String = readln()
    println("Great Choice! How many items you want to buy?")
    val numOfItems: Int = readln().toIntOrNull() ?: 1
    println("How much you can pay per item?")
    val priceOfItem: Double = readln().toDoubleOrNull() ?: 0.0

    val totalCost:Double = numOfItems * priceOfItem
    println("Your Order:")
    println("Item: $itemName")
    println("Quantity: $numOfItems")
    println("You have to pay: $totalCost gold.")
}