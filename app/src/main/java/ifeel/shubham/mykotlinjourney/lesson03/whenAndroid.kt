package ifeel.shubham.mykotlinjourney.lesson03

// real android example of When - Putting all together
fun main() {
    val isLoggedIn = true
    val isPremiumUser = true
    print("Enter Battery Level: ")
    val battery = readln().toInt()
    print("Enter Network Type (wifi/5G/4G/3G): ")
    val networkType = readln()

    // screen access decision
    val screen = if(isLoggedIn) "Home" else "Login"
    println("Navigate to: $screen")

    // Video Quality
    val videoQuality = when (networkType) {
        "wifi"      -> "4K Ultra HD"
        "5G"        -> "2K HD"
        "4G"        -> "1080p"
        "3G"        -> "720p"
        else        -> "144p"
    }
    println("Streaming: $videoQuality")

    // Battery Warning
    val batteryWarning = when {
        battery > 50  -> "All good"
        battery > 20  -> "Consider charging"
        battery > 10  -> "Low battery warning"
        else          -> "Plug in immediately!"
    }
    println("Battery: $batteryWarning")

    // Premium badge
    val badge = if (isLoggedIn && isPremiumUser) "⭐ Premium" else ""
    println("Badge: $badge")
}