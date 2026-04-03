package ifeel.shubham.mykotlinjourney.lesson03

fun main() {
    // ----- Food Delivery App Interface -----

    val customerName = "Shubham"
    val orderAmount = 850        // in rupees
    val isMember = true
    val distance = 12            // km from restaurant
    val timeOfDay = "night"      // "morning", "afternoon", "night"

    // ----- 01. Delivery Check if Delivery is Free -----
    if(orderAmount > 500) println("Delivery: Free") else println("Delivery: ₹40")

    // ====== 02. Greetings -----
    when(timeOfDay) {
        "morning" -> println("Good Morning, Shubham!")
        "afternoon" -> println("Good Afternoon, Shubham!")
        "night" -> println("Good Night, Shubham!")
        else -> println("Hello, Shubham!")
    }

    // ----- 03. Delivery Time -----
    val deliveryTime = when(distance) {
        in 1..5     -> "20-30 mins"
        in 6..10    -> "30-45 mins"
        in 11..20   -> "45-60 mins"
        else             -> "60+ mins"
    }

    // ----- 04. Calculate Discount -----
    val discount = when {
        isMember && orderAmount > 1000 -> "20%"
        isMember && orderAmount > 500  -> "10%"
        !isMember && orderAmount > 1000 -> "5%"
        else -> "No Discount"
    }

    // ----- 05. Order Summary -----
    println("Order Summary - $customerName | ₹$orderAmount | $deliveryTime | Discount: $discount")
}