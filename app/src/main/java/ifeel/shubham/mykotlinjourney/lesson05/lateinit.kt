package ifeel.shubham.mykotlinjourney.lesson05

fun main() {
    // ❌ This doesn't work — non-nullable needs immediate value
    var userName1: String   // compiler error — must initialize

    // ❌ This is wrong — defeats null safety
    var userName2: String? = null   // now you have null checks everywhere

    // ✅ lateinit — "I promise to set this before using it"
    lateinit var userName3: String

    // Later in the code...
    userName3 = "Shubham"    // now it's set
    println(userName3)       // Shubham — no null check needed

//    println(userName2)
//    println(userName1)
}