package ifeel.shubham.mykotlinjourney.lesson08

// Building a Coffee Shop Revenue Calculator

class CoffeeDen(
   val coffeeName: String,
   val price: Double
) {
   companion object {
      private const val TAX = 0.25
   }
   var totalOrders: Int = 0
      private set
   var totalRevenue: Double = 0.0
      private set

   // Validate order
   fun validateOrder() =
      coffeeName.isNotBlank() && price > 0

   fun calculateTax() =
      price * TAX

   fun placeOrder() {
      // validate order
      if(!validateOrder()) {
         println("INVALID ORDER")
         return
      }

      // calculate revenue
      val tax = calculateTax()
      val total = tax + price

      totalOrders++
      totalRevenue += total

      println("$coffeeName ordered")
      println("Price: $$price")
      println("Tax: $$tax")
      println("Total: $$total")
   }

   fun printStats() {
      println("Total Orders : $totalOrders")
      println("Total Revenue : $totalRevenue")
   }
}

fun main() {
   val coffee1 = CoffeeDen("Tea", 100.0)
   coffee1.placeOrder()
}