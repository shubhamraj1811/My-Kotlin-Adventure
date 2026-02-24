package ifeel.shubham.mykotlinjourney.week01

fun main() {
    val price = 45.50 // in Rupees
    val quantity = 5
    val taxRate = 3.05

    val subTotal = price * quantity
    val taxAmount = subTotal * taxRate
    val total = subTotal + taxAmount

    println("Total sum Amount is $total")

    val cash = 900
    val applePrice = 12
    val numApple = cash/applePrice

    println("I can buy $numApple apples")

    println("✅ Running")
}