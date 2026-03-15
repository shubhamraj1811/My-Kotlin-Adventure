package ifeel.shubham.mykotlinjourney.lesson02
// Exercise 3
fun main() {
    // immutable variable basePrice
    val basePrice: Double = 10.50
    // use built in method on Double Object to convert it into Int
    val roundedPrice: Int = basePrice.toInt()
    // nullable integer
    val userDiscount: Int? = null
    // convert roundedPrice to String
    val priceTag: String = basePrice.toString()

    println("Base Price (Double): $basePrice")
    println("Rounded Price (Int): $roundedPrice")
    println("User Discount (Int?): $userDiscount")
    println("Price Tag (String): $priceTag")
}