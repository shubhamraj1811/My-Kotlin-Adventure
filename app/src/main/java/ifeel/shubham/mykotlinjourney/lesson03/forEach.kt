package ifeel.shubham.mykotlinjourney.lesson03

fun main() {
    val notifications = listOf("Message from Vrshu", "Your order shipped", "New follower")

    println("----- Traditional for loop -----")
    // Traditional for loop
    for (notification in notifications) {
        println(notification)
    }

    println("----- forEach loop -----")
    // ✅ Kotlin idiomatic way — forEach
    notifications.forEach { notification ->
        println(notification)
    }

    println("----- forEach with index -----")
    // Even shorter when body is simple — 'it' is the automatic name
    notifications.forEach {
        println(it)
    }
}