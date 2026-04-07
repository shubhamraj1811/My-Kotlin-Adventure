package ifeel.shubham.mykotlinjourney.lesson04

fun createProfile(
    name: String,
    age: Int,
    city: String,
    isPremium: Boolean
) {
    println("Name: $name | Age: $age | City: $city | Premium: $isPremium")
}

fun main() {
    // ❌ Hard to read — what does true mean here?
    createProfile("Shubham", 22, "Mumbai", true)
    println()

    // ✅ Named arguments — crystal clear
    createProfile(
        name = "Shubham",
        age = 22,
        city = "Mumbai",
        isPremium = true
    )
    println()

    // ✅ Can reorder with named arguments
    createProfile(
        isPremium = false,
        city = "Delhi",
        age = 25,
        name = "Anmol",
    )
}