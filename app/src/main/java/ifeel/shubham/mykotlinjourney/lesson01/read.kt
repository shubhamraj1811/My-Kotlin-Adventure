package ifeel.shubham.mykotlinjourney.lesson01

fun main () {
    // Kotlin reads everything as string
    print("Enter Your Hero Name: ")
    val heroName: String = readln()

    // input an int
    print("Enter Your Age: ")
    val age: Int = readln().toInt()

    // input a char
    print("Enter Your Gender (M/F): ")
    val gender: Char = readln()[0]

    // input a boolean
    print("Are You Happy? (true/false): ")
    val happy: Boolean = readln().toBoolean()

    // input a double
    print("Enter Your Height (in inches): ")
    val height: Double = readln().toDouble()


    // output
    println("Your Hero Name is $heroName")
    println("Your Age is $age")
    println("Your Gender is $gender")
    println("Are You Happy? $happy")
    println("Your Height is $height")
}
