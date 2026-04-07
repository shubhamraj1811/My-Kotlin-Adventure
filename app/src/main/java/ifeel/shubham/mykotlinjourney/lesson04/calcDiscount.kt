package ifeel.shubham.mykotlinjourney.lesson04

fun calculateDiscount(price: Int, discountPercent: Int): Int {
    return price - (price * discountPercent / 100)
}

fun main() {
    val originalPrice = 2999
    val finalPrice = calculateDiscount(originalPrice, 10)
    println("Original: ₹$originalPrice")
    println("After 10% discount: ₹$finalPrice")   // ₹2699
}