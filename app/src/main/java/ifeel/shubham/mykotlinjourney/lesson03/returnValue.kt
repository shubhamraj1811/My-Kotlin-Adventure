package ifeel.shubham.mykotlinjourney.lesson03

fun main() {
    // writing a code to check student pass
    print("Enter Marks: ")
    val marks = readln().toIntOrNull() ?: 0
    val status:String
    // ❌ The old, verbose way (Don't do this in Kotlin)
    if (marks >= 60) {
        status = "First"
    } else {
        status = "Pass"
    }

    // ✅ The Production Kotlin Way (If as an Expression)
    val newStatus = if (marks >= 60) "Yayyyy" else "Passs"

    println("Status 1 : $status")
    println("Status 2 : $newStatus")
    println()

}