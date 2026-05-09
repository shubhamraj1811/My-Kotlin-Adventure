package ifeel.shubham.mykotlinjourney.lesson05

fun main () {
    val username: String? = "Shubham"
    println(username!!.length)   // 7 — works because it's not null

    val nullName: String? = null
    println(nullName!!.length)   // 💥 NullPointerException — you lied to Kotlin
}