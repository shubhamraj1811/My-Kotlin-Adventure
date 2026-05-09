package ifeel.shubham.mykotlinjourney.lesson05

data class User(
    val id: Int,
    val name: String,
    val email: String,
    val profilePicUrl: String?,    // might not have a photo
    val bio: String?,              // might not have written a bio
    val phoneNumber: String?       // might not have added phone
)

fun displayUserProfile(user: User?) {

    // Tool 1 — Early exit if no user at all
    if (user == null) {
        println("No user logged in. Please sign in.")
        return
    }

    // Smart cast — user is now treated as non-nullable below
    println("===== PROFILE =====")
    println("Name  : ${user.name}")
    println("Email : ${user.email}")

    // Tool 3 — Elvis for defaults
    println("Bio   : ${user.bio ?: "No bio written yet"}")
    println("Phone : ${user.phoneNumber ?: "Not provided"}")

    // Tool 2 — Safe call for nested access
    val picStatus = user.profilePicUrl?.let {
        "Profile picture set ✅"
    } ?: "No profile picture ❌"
    println("Photo : $picStatus")

    println("===================")
}

fun main() {
    val loggedInUser1 = User(
        id = 1,
        name = "Shubham",
        email = "shubham@gmail.com",
        profilePicUrl = null,
        bio = "Android Developer from Patna",
        phoneNumber = "7645860144"
    )

    val loggedInUser2 = User(
        id = 2,
        name = "Varsha",
        email = "varsha@gmail.com",
        profilePicUrl = null,
        bio = "Android Developer from Begusarai",
        phoneNumber = null
    )

    displayUserProfile(loggedInUser1)
    displayUserProfile(loggedInUser2)

    println("---- Test Early Return ----")
    displayUserProfile(null)          // tests the early return
}

// Output:
// ===== PROFILE =====
// Name  : Shubham
// Email : shubham@gmail.com
// Bio   : Android Developer from Mumbai
// Phone : Not provided
// Photo : No profile picture ❌
// ===================
// No user logged in. Please sign in.