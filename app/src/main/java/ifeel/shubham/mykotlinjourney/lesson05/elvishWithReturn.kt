package ifeel.shubham.mykotlinjourney.lesson05

// This is a professional pattern used in production Android code:

fun getUserProfile(userId: String?) {
    // If userId is null — return early, stop function
    val id = userId ?: return
    println("Fetching profile for: $id")
}

fun processPayment(amount: Double?) {
    // If amount is null — throw an error
    val price = amount ?: throw IllegalArgumentException("Amount cannot be null")
    println("Processing ₹$price")
}

fun main() {
    getUserProfile(null)         // silently returns, nothing prints
    getUserProfile("user_123")   // Fetching profile for: user_123
}