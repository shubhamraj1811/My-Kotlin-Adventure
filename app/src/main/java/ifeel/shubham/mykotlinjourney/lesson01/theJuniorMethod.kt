package ifeel.shubham.mykotlinjourney.lesson01

fun main() {
    // junior method (show crash)
    print("Enter five: ")
    val num: Int = readln().toInt()
    // the code crashes here if we type "five"
    println("num is $num")

    // Safe Conversion - null
    println("Try Entering five again: ")
    val newNum: Int = readln().toIntOrNull() ?: 0
    // doesn't crash, return Null
    println("newNum is $newNum")

    """
        Similarly for other datatypes:-
        readln().toBooleanOrNull()
        readln().toDoubleOrNull()
        
        [Note:- We also have readlnOrNull(), which we use if there's a chance the input stream gets abruptly closed, returning null]
        [Note:- the standard .toBoolean() returns anything other than "true" or "TRUE" as false]
    """.trimIndent()
}