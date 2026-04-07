package ifeel.shubham.mykotlinjourney.lesson04
/*

// ❌ Verbose — unnecessary for simple logic
fun square(n: Int): Int {
    return n * n
}

// ✅ Single expression — clean and idiomatic
fun square(n: Int): Int = n * n

// ✅ Even cleaner — Kotlin infers the return type
fun square(n: Int) = n * n

 */

// --------- Example ---------
fun isAdult(age: Int) = age >= 18
fun getFullName(first: String, last: String) = "$first $last"
fun celsiusToFahrenheit(c: Double) = (c * 9/5) + 32

fun main() {
    println(isAdult(20))                        // true
    println(getFullName("Shubham", "Yuvraj"))     // Priya Sharma
    println(celsiusToFahrenheit(100.0))         // 212.0
}