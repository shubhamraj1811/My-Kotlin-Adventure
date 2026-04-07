package ifeel.shubham.mykotlinjourney.lesson04

fun printNotifications(vararg messages: String) {
    println("You have ${messages.size} notifications:")
    for (message in messages) {
        println("  • $message")
    }
}

fun main() {
    printNotifications("New message from Priya")

    printNotifications(
        "Your order shipped",
        "New follower",
        "Payment received",
        "Update available"
    )
}
// Output:
// You have 1 notifications:
//   • New message from Priya
// You have 4 notifications:
//   • Your order shipped
//   • New follower
//   • Payment received
//   • Update available