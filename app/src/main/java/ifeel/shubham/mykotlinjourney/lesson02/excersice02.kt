package ifeel.shubham.mykotlinjourney.lesson02

fun main() {
    // # 🛠 Exercise 2: Defining a User Profile State
    val databaseId: Long = 23151158030L
    var weight: Double = 75.5
    var premiumStatus: Boolean = true
    var completedWorkouts: Int = 11
    val name: String = "Shubham Raj"

    // User Update
    weight += 1.3
    premiumStatus = false
    completedWorkouts += 2

    // display
    println("User ID: $databaseId")
    println("User Weight: $weight")
    println("User has Premium Subscription: $premiumStatus")
    println("Number of Workouts Completed: $completedWorkouts")
    println("User Name: $name")
}