package ifeel.shubham.mykotlinjourney.lesson03

fun main() {
    // ----- Food Delivery App Interface -----

    print("Enter Customer Name: ")
    val customerName = readln()
    print("Enter Order Amount (in Rupees): ")
    val orderAmount = readln().toInt()        // in rupees
    print("Is Member: ")
    val isMember = readln().toBoolean()
    print("Enter Distance (in km): ")
    val distance = readln().toInt()            // km from restaurant
    print("Enter Time of Day (morning/afternoon/night): ")
    val timeOfDay = readln()      // "morning", "afternoon", "night"

    // ----- 01. Delivery Check if Delivery is Free -----
    if (orderAmount > 500) {
        println("Delivery: Free")
    } else {
        println("Delivery: ₹40")
    }

    // ====== 02. Greetings -----
    when (timeOfDay) {
        "morning"   -> println("Good Morning, $customerName!")
        "afternoon" -> println("Good Afternoon, $customerName!")
        "night"     -> println("Good Night, $customerName!")
        else        -> println("Hello, $customerName!")
    }

    // ----- 03. Delivery Time -----
    val deliveryTime = when(distance) {
        in 1..5     -> "20-30 mins"
        in 6..10    -> "30-45 mins"
        in 11..20   -> "45-60 mins"
        else             -> "60+ mins"
    }
    println("Estimated delivery: $deliveryTime")

    // ----- 04. Calculate Discount -----
    val discount = when {
        isMember && orderAmount > 1000 -> "20%"
        isMember && orderAmount > 500  -> "10%"
        !isMember && orderAmount > 1000 -> "5%"
        else -> "No Discount"
    }
    println("Discount: $discount")

    // ----- 05. Order Summary -----
    println("Order Summary - $customerName | ₹$orderAmount | $deliveryTime | Discount: $discount")
}