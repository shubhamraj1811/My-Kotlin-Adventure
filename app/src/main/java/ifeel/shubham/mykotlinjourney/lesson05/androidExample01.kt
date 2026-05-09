package ifeel.shubham.mykotlinjourney.lesson05

fun main() {
    // Things that are ALWAYS guaranteed → non-nullable
    val appName: String = "MyApp"
    val maxRetry: Int = 3
    val isDebugMode: Boolean = false

    // Things that MIGHT not exist → nullable
    var loggedInUser: String? = null        // no user until login
    var profilePicUrl: String? = null       // user might not have one
    var lastSearchQuery: String? = null     // user might not have searched
    var authToken: String? = null           // null until authenticated
}