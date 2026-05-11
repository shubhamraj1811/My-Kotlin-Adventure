package ifeel.shubham.mykotlinjourney.lesson06

data class CartItem( // someone's cart
    val name: String, // dish name
    val price: Int, // price of dish
    val quantity: Int, // no of order
    val isVeg: Boolean // veg hai ya non veg
)

val cartItems = listOf(
    CartItem("Paneer Butter Masala", 320, 1, true),
    CartItem("Chicken Biryani", 280, 2, false),
    CartItem("Garlic Naan", 45, 4, true),
    CartItem("Veg Fried Rice", 180, 1, true),
    CartItem("Chicken Wings", 350, 1, false)
)

val deliveryPartnerName: String? = null   // not assigned yet
val userCouponCode: String? = "SAVE50"

fun main () {
    val subtotal: Int = cartItems.sumOf{it.price * it.quantity}
    val deliveryFee: Int = if(subtotal>500) 0 else 40 // added 40 when below 500
    // ✅ Complete handling with when
    val couponDiscount: Int = when (userCouponCode) {
        "SAVE50" -> {
            println("✅ Coupon applied!")
            50
        }
        null -> 0   // no coupon, no message
        else -> {
            println("❌ Invalid coupon code: $userCouponCode")
            0
        }
    }
    val total: Int = subtotal + deliveryFee - couponDiscount
    val vegCount: Int = cartItems.count{it.isVeg}
    val nonVegCount: Int = cartItems.count{!it.isVeg}

    println("==== YOUR CART ====")

    cartItems.forEach { item ->
        val itemTotal = item.price * item.quantity

        // left side text
        val left: String = "${item.name} x ${item.quantity}"
        // right side text
        val right: String = "₹$itemTotal"

        // format space
        println(left.padEnd(30) + right)
    }
    println()

    println("Subtotal:".padEnd(32) + "₹$subtotal")
    if(subtotal>500) {
        println("Delivery:".padEnd(32) + "Free")
    } else {
        println("Delivery:".padEnd(32) + "₹40")
    }

    if (couponDiscount > 0) {
        println("Coupon ($userCouponCode):".padEnd(32) + "-₹$couponDiscount")
    }
    println("Total:".padEnd(32) + "₹$total")
    println()
    println("Veg Items: $vegCount | Non-Veg: $nonVegCount")

    println(
        "Delivery Partner: ${
            deliveryPartnerName ?: "Assigning partner..."
        }"
    )
}

/*
====== YOUR CART ======
Paneer Butter Masala x1       ₹320
Chicken Biryani x2            ₹560
Garlic Naan x4                ₹180
Veg Fried Rice x1             ₹180
Chicken Wings x1              ₹350

Subtotal:                     ₹1590
Delivery:                     Free
Coupon (SAVE50):             -₹50
Total:                        ₹1540

Veg Items: 3 | Non-Veg: 2
Delivery Partner: Assigning partner...
*/