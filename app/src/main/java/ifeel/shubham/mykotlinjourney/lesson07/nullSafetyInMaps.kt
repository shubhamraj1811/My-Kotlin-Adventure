package ifeel.shubham.mykotlinjourney.lesson07

fun main() {
    val capitals = mapOf("Bihar" to "Patna", "Jhk" to "Ranchi", "UP" to "Lucknow")

    // ❌ Dangerous if key doesn't exist - Gujrat
    val capital1 = capitals["Gujrat"]   // returns null, not crash — but...
    println(capital1)       // null
    // println(capital1.length)              // ❌ compiler error — capital is String?

    // ✅ Use what you learned in Null Safety!
    val capital2 = capitals["Gujrat"] ?: "Unknown"
    println(capital2)    // Unknown
    val capital3 = capitals["Jhk"] ?: "Unknown"
    println(capital3)

    capitals["Bihar"]?.let {
        println("Capital of Bihar is $it")
    }
    capitals["Gujrat"]?.let {
        println("Capital of Gujrat is $it")
    }

    // ✅ getOrDefault — built-in alternative
    println(capitals.getOrDefault("Gujrat", "Unknown"))  // Unknown
    println(capitals.getOrDefault("UP", "Unknown"))
}