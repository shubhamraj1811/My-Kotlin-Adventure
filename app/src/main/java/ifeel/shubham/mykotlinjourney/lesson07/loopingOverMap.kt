package ifeel.shubham.mykotlinjourney.lesson07

fun main() {
    val capitals = mapOf("India" to "New Delhi", "Japan" to "Tokyo", "France" to "Paris")

    for ((country, capital) in capitals) {
        println("$country's capital is $capital")
    }
    // India's capital is New Delhi
    // Japan's capital is Tokyo
    // France's capital is Paris

   // Or using forEach
    capitals.forEach { (country, capital) ->
        println("$country → $capital")
    }

    // Access keys and values separately
    println(capitals.keys)     // [India, Japan, France]
    println(capitals.values)   // [New Delhi, Tokyo, Paris]
}