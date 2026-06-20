package ifeel.shubham.mykotlinjourney.lesson07

fun main() {
    val cart = mutableListOf("Shoes", "Watch")

    cart.add("Headphones")             // [Shoes, Watch, Headphones]
    cart.add("Bag")                     // [Shoes, Watch, Headphones, Bag]
    cart.add("Pants")                   // [Shoes, Watch, Headphones, Bag, Pants]
    cart.remove("Watch")     // [Shoes, Headphones, Bag, Pants]
    cart[0] = "Sneakers"                // [Sneakers, Headphones, Bag, Pants]
    cart.removeAt(0)            // [Headphones, Bag, Pants]

    println(cart)                    // [Headphones, Bag, Pants]
    println(cart.contains("Headphones"))  // true
}