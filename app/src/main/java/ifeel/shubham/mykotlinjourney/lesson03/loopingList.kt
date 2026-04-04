package ifeel.shubham.mykotlinjourney.lesson03

fun main() {
    // ----- Looping a List -----
    val apps = listOf("WhatsApp", "Instagram", "YouTube", "Spotify")
    println("----- Looping over a list: -----")
    for (app in apps) {
        println("Opening $app...")
    }

    // ----- Loop With Index — withIndex() -----
    val appsTwo = listOf("WhatsApp", "Instagram", "YouTube")
    println("----- Loop with Index: -----")
    for ((index, app) in appsTwo.withIndex()) {
        println("$index. $app")
    }
}