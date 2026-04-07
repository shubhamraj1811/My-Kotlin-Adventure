package ifeel.shubham.mykotlinjourney.lesson04

fun processPayment(amount: Int, upiId: String) {
    // Local function — only exists inside processPayment
    fun validateUpiId(id: String): Boolean {
        return "@" in id
    }
    fun formatAmount(amt: Int): String {
        return "₹$amt"
    }
    if (!validateUpiId(upiId)) {
        println("Invalid UPI ID")
        return
    }
    println("Processing payment of ${formatAmount(amount)} to $upiId")
    println("Payment successful! ✅")
}

fun main() {
    processPayment(999, "shubham@upi")     // Processing payment of ₹999...
    processPayment(499, "invalididhere")   // Invalid UPI ID
}