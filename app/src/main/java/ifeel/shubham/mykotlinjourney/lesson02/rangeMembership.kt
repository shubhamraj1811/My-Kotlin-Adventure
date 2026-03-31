package ifeel.shubham.mykotlinjourney.lesson02

fun main() {
    val roll = 30

    // ✅ The Kotlin way
    val isHit = roll in 10..20

    // You can also check if something is NOT in a range
    val isMiss = roll !in 15..35
}