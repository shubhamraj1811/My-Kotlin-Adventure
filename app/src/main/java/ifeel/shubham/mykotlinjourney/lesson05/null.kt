package ifeel.shubham.mykotlinjourney.lesson05

fun main () {
    // NON-NULLABLE — Kotlin guarantees a value ALWAYS exists
    val username1: String = "Shubham"     // ✅ safe
//    val username2: String = null          // ❌ COMPILER ERROR — impossible

    // NULLABLE — explicitly says "this might be empty"
    val username3: String? = "Shubham"   // ✅ has value
    val username4: String? = null         // ✅ empty — you opted in knowingly
}