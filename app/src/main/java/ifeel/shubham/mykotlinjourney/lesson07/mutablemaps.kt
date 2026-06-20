package ifeel.shubham.mykotlinjourney.lesson07

fun main() {
    val userScores = mutableMapOf(
        "Shubham" to 850,
        "Varsha" to 920
    )

    userScores["Shubham"] = 900        // update existing key
    userScores["Rahul"] = 750          // add new key
    userScores["Rakhi"] = 900
    println(userScores)

    userScores.remove("Rakhi")         // remove a key

    println(userScores) 
}