package ifeel.shubham.mykotlinjourney.lesson04

fun showOrderSummary(customerName: String, amount: Int, itemCount: Int) {
    println("Order for $customerName")
    println("Items: $itemCount")
    println("Total: ₹$amount")
}

fun main() {
    showOrderSummary("Shubham", 1499, 3)
}
// Output:
// Order for Shubham
// Items: 3
// Total: ₹1499