package ifeel.shubham.mykotlinjourney.lesson03

fun main() {
    val value1:Int = 190
    val value2:String = "Hello"
    val value3:String = "12345"
    val roll:Int = 30
    val marks = 90.5

    // method 1 - using is
    println("------- Method 1 -------")
    if(value1 is Int) println("Value 1 is int") else println("NO 1")
    if(value2 is String) println("Value 2 is String") else println("NO 2")
    if(value3 is Boolean) println("Value 3 is String") else println("NO 3")

    // method 2 - x::class
    println("------- Method 2 -------")
    println(roll::class)
    println(roll::class.simpleName)

    // method 3 - when (multiple condition)
    println("------- Method 3 -------")
    when (marks) {
        is Int -> println("Marks is Int")
        is String -> println("Marks is String")
        is Float -> println("Marks is Float")
        is Double -> println("Marks is Double")
        else -> println("Unkown")
    }

}