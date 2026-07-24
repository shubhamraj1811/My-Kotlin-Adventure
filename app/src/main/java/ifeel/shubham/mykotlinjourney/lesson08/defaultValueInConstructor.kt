package ifeel.shubham.mykotlinjourney.lesson08

class UserProfile(
   val username: String,
   val email: String,
   var followerCount: Int = 0,          // default = 0
   var isVerified: Boolean = false,     // default = false
   var bio: String = "No bio yet"       // default text
) {
   fun showProfile() {
      println("Username: $username")
      println("Email: $email")
      println("Follower Count: $followerCount")
      println("Is Verified: $isVerified")
      println("Bio: $bio")
   }
}

fun main() {
   // Must provide required params
   val user1 = UserProfile(
      "shubham_dev",
      "shubham@gmail.com"
   )
   user1.showProfile()

   println()

   // Can override defaults
   val user2 = UserProfile(
      "itsvru.18",
      "varshu@gmail.com",
      60,
      true,
      "Hey There! I am using Kotlin"
   )

   user2.showProfile()
}