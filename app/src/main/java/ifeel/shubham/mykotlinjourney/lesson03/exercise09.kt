package ifeel.shubham.mykotlinjourney.lesson03

fun main() {
    val productNames = listOf("Shoes", "T-Shirt", "Watch", "Headphones", "Backpack")
    val productPrices = listOf(2999, 599, 4999, 1999, 1499)
    val outOfStock = listOf("Watch")

    // ----- Task 1 -----
    println("Task 1 Initiating...")
    for((index, productName) in productNames.withIndex()) {
        println("${index + 1}. $productName - ₹${productPrices[index]}")
    }
    println()

    // ----- Task 2 -----
    println("Task 2 Initiating...")
    for(i in 5 downTo 1) {
        print("$i... ")
    }
    println("Flash Sale Started! 🔥")
    println()

    // ----- Task 3 -----
    println("Initiating Task 3...")
    for(product in productNames) {
        if (product == "Watch") {
            continue
        }
        println("Available: $product")
    }
    println()

    // ----- Task 4 -----
    println("Initiating Task 4")
    for((index, price) in productPrices.withIndex()) {
        if(price > 3000) {
            println("First expensive item found at position $index — ₹$price")
            break
        }
    }
    println()

    // ----- Task 5 -----
    println("Task 5 Initiating...")

    var loadedItems = 0
    val totalItems = 20
    val chunkSize = 5

    while (loadedItems < totalItems) {
        loadedItems += chunkSize
        println("Loaded $loadedItems/totalTimwa Items...")
    }
    println("All Items Loaded ✅")
}