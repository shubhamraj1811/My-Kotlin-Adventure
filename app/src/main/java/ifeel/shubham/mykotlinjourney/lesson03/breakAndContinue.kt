package ifeel.shubham.mykotlinjourney.lesson03

fun main() {
    // ----- break -----
    val messages = listOf("Hey", "How are you?", "SPAM_DETECTED", "Call me", "Meet up?")

    for (message in messages) {
        if (message == "SPAM_DETECTED") {
            println("Spam found! Stopping scan.")
            break   // exits the loop entirely
        }
        println("Reading: $message")
    }

    // ----- continue -----
    val scores = listOf(85, -1, 92, -1, 78, 95)
    // -1 means the test was missed

    for (score in scores) {
        if (score == -1) {
            continue   // skip this score, move to next
        }
        println("Valid score: $score")
    }
}