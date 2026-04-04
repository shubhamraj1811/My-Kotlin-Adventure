package ifeel.shubham.mykotlinjourney.lesson03

fun main() {
    // ❌ This runs FOREVER — will freeze/crash your app
    var count = 0
    while (count < 5) {
        println(count)
        // forgot count++ → condition never becomes false!
    }
}