package ifeel.shubham.mykotlinjourney.lesson05

// Checking if lateinit is initialized:

lateinit var authToken: String

fun processRequest() {
    if (::authToken.isInitialized) {
        println("Token: $authToken")
    } else {
        println("Not authenticated yet")
    }
}