package ifeel.shubham.mykotlinjourney.lesson02

fun main () {
    // Use In Real Apps

    val isLoggedIn = true
    val hasInternet = false
    val isPremiumUser = true

    // Can watch video?
    val canWatch = isLoggedIn && hasInternet
    println("Can watch: $canWatch")       // Can watch: false

    // Show premium badge?
    val showBadge = isLoggedIn && isPremiumUser
    println("Show badge: $showBadge")      // Show badge: true

    // Show any content?
    val showContent = hasInternet || isPremiumUser  // cached content for premium
    println("Show content: $showContent")           // Show content: true

    // Is user NOT logged in?
    println("Show login screen: ${!isLoggedIn}")    // Show login screen: false
}