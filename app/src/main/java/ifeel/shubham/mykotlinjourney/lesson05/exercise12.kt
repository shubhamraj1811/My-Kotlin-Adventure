package ifeel.shubham.mykotlinjourney.lesson05

// data class to represent social profile
data class SocialProfile(
    val username: String,
    val displayName: String?, // nullable - might not be set
    val bio: String?, // nullable - might not have a bio
    val website: String?, // nullable - might not have a website
    val location: String?, // nullable - might not want to tell location
    val followerCount: Int,
    val isVerified: Boolean
)

// function to display profile
fun displayProfile(profile: SocialProfile?) {
    // check if profile itself is null
    if (profile == null) {
        println("Profile Not Found!")
        return
    }

    // using elvis operator
    val name = profile.displayName ?: "No Name Set"
    val bio = profile.bio ?: "No Bio Yet"

    println("Username: ${profile.username}")
    println("Name: $name")
    println("Bio: $bio")

    // using ?.let to print website if not null
    profile.website?.let {
        println("\uD83C\uDF10 Website: $it")
    }

    // using elvis for location
    val location = profile.location ?: "Location not set"

    // show verified badge
    val verifiedStatus = if (profile.isVerified) "✅ Verified" else "❌ Not Verified"

    // display profile details

    println("Location: $location")
    println("Followers: ${profile.followerCount}")
    println(verifiedStatus)
}

// function to extract website domain
fun getWebsiteDomain(profile: SocialProfile?): String {

    return profile?.website
        ?.let {
            it.removePrefix("https://")
                .removePrefix("http://")
        }
        ?: "No website"
}

// Task 3 — Nullable Return
fun findVerifiedUser(
    profiles: List<SocialProfile>,
    username: String
): SocialProfile? {

    return profiles.find {
        it.username == username && it.isVerified
    }
}

// Task 4 — Elvis with return
fun postContent(profile: SocialProfile?, content: String) {

    // Exit if profile is null
    val user = profile ?: return

    // Exit if bio is null
    user.bio ?: return

    println("@${user.username} posted: $content")
}

// Example usage
fun main() {
    val user1 = SocialProfile(
        username = "shubham_dev",
        displayName = "Shubham",
        bio = "Android Developer | Kotlin Enthusiast",
        website = "https://shubham.dev",
        location = "Mumbai, India",
        followerCount = 1240,
        isVerified = true
    )

    val user2 = SocialProfile(
        username = "new_user_99",
        displayName = null,
        bio = null,
        website = null,
        location = null,
        followerCount = 0,
        isVerified = false
    )

    displayProfile(user1)
    println()

    displayProfile(user2)
    println()

    displayProfile(null)

    // ----- Task 02 ------
    println("Website Domain: ${getWebsiteDomain(user1)}")
    println("Website Domain: ${getWebsiteDomain(user2)}")
    println("Website Domain: ${getWebsiteDomain(null)}")

    // -------- Task 3 Testing --------

    val profiles = listOf(user1, user2)

    findVerifiedUser(profiles, "shubham_dev")?.let {
        println("Verified user found: ${it.username}")
    } ?: println("User not found or not verified")

    findVerifiedUser(profiles, "new_user_99")?.let {
        println("Verified user found: ${it.username}")
    } ?: println("User not found or not verified")

    findVerifiedUser(profiles, "unknown_user")?.let {
        println("Verified user found: ${it.username}")
    } ?: println("User not found or not verified")

    println()

    // -------- Task 4 Testing --------

    postContent(user1, "Learning Kotlin Null Safety!")

    // Will return early because bio is null
    postContent(user2, "Hello everyone!")

    // Will return early because profile is null
    postContent(null, "This won't post")
}
