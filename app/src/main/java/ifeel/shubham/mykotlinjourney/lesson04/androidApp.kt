package ifeel.shubham.mykotlinjourney.lesson04


// Utility functions used across the whole app

fun formatPrice(amount:Int): String = "₹$amount"

fun calculateFinalPrice(
    originalPrice: Int,
    discount: Int = 0,
    deliveryCharge: Int = 40
): Int {
    val discount = originalPrice - (originalPrice * discount / 100)
    return if (discount > 500) discount
    else discount + deliveryCharge
}

fun generateOrderId(userName: String): String {
    return "ORD-${userName.uppercase()}-${(1000..9999).random()}"
}

fun printOrderConfirmation(
    customerName: String,
    itemName: String,
    originalPrice: Int,
    discount: Int = 0
) {
    val finalPrice = calculateFinalPrice(originalPrice, discount)
    val orderId = generateOrderId(customerName)

    println("========= ORDER CONFIRMED =========")
    println("Order ID  : $orderId")
    println("Customer  : $customerName")
    println("Item      : $itemName")
    println("Price     : ${formatPrice(originalPrice)}")
    println("Discount  : $discount%")
    println("Final     : ${formatPrice(finalPrice)}")
    println("===================================")
}

fun main() {
    printOrderConfirmation(
        customerName = "Shubham",
        itemName = "Wireless Headphone",
        originalPrice = 1999,
        discount = 10
    )
}

// Output:
// ====== ORDER CONFIRMED ======
// Order ID  : ORD-SHUBHAM-4821
// Customer  : Shubham
// Item      : Wireless Headphones
// Price     : ₹1999
// Discount  : 10%
// Final     : ₹1799
// =============================