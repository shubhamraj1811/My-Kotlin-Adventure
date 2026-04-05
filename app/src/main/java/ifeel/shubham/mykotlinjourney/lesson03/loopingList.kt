package ifeel.shubham.mykotlinjourney.lesson03

fun main() {
    // ----- Looping a List -----
    println("----- Looping over a list: -----")
    val apps = listOf("WhatsApp", "Instagram", "YouTube", "Spotify")
    for (app in apps) {
        println("Opening $app...")
    }

    // ----- Loop With Index — withIndex() -----
    println("----- Loop with Index: -----")
    val appsTwo = listOf("WhatsApp", "Instagram", "YouTube")
    for ((index, app) in appsTwo.withIndex()) {
        println("$index. $app")
    }
}