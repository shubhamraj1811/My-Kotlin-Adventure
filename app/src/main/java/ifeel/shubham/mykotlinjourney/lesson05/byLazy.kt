package ifeel.shubham.mykotlinjourney.lesson05

// This code only runs the FIRST time you access the variable
val heavyConfig: String by lazy {
    println("Computing config...")   // runs only once
    "AppConfig_v2.4.1"

}

fun main() {
    println("App starting...")
    println("Doing other things...")
    "Hello World"
    println(heavyConfig)   // "Computing config..." runs HERE for first time
    println(heavyConfig)   // Uses cached value — "Computing config..." NOT printed again
}
// Output:
// App starting...
// Doing other things...
// Computing config...
// AppConfig_v2.4.1
// AppConfig_v2.4.1