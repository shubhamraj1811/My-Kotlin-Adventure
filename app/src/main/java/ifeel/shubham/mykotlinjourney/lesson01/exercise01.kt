package ifeel.shubham.mykotlinjourney.lesson01

fun main() {
    // Profile Screen

    // Immutable Variables
    val fullName: String = "Priya Sharma"
    val userName: String = "priya_dev"

    // Mutable Variables
    var age: Int = 22
    var followerCount = 0
    var IsVerified: Boolean = false
    var bio: String = "Android Developer from Mumbai"

    // [ After a period, var Changes]
    age = age + 1
    followerCount = 100+50+110+40
    IsVerified = true
    bio = "Android Developer in Bangalore"

    // print
    println("Your name is $fullName")
    println("Your id is $userName")
    println("Your age is $age")
    println("Followers: $followerCount")
    println("Status: $IsVerified")
    println("About: $bio")
}