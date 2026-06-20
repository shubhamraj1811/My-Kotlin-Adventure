package ifeel.shubham.mykotlinjourney.lesson07

fun main() {
    val mutableTags = mutableSetOf("kotlin", "android")
    mutableTags.add("kotlin")    // ignored — already exists
    mutableTags.add("compose")      // adds compose
    println(mutableTags)         // [kotlin, android, compose]
}