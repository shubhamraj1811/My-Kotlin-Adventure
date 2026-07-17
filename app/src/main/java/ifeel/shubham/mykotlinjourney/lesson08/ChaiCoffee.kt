package ifeel.shubham.mykotlinjourney.lesson08

// ====== COFFEE MODEL ======
class Coffee (
   val name: String,
   val price: Double
) {}

// ====== COFFEE SHOP : CHAICOFFEE ======
class ChaiCoffee {
   // since menu should be changed, use private
   private val menu = listOf(
      Coffee("Espresso", 120.0),
      Coffee("Latte", 150.0),
      Coffee("Cappuccino", 140.0),
      Coffee("Cold COffee", 85.0),
      Coffee("Chai", 10.0),
      Coffee("Masala Chai", 50.0),
      Coffee("Water", 10.0)
   )

   // display menu
   fun showMenu() {
      println("========== MENU ==========")
      menu.forEachIndexed { index, coffee ->
         println("${index+1}. ${coffee.name} - ₹${coffee.price}")
      }
      println("==========================")
   }

   fun getCoffee(index: Int): Coffee? { // GET COFFEE BY INDEX
      return menu.getOrNull(index)
   }
}

// ===== CUSTOMER ORDER =====
class Order {
   private val coffeeMug = mutableListOf<Coffee>()

   fun addCoffee(coffee: Coffee) {
      coffeeMug.add(coffee)  // list added
      println("${coffee.name} added to your Mug")
   }

   fun printBill() {
      println("\n========== BILL ==========")

      var subtotal = 0.0

      coffeeMug.forEach {
         println("${it.name}   ₹${it.price}")
         subtotal += it.price
      }

      val tax = subtotal * 0.25
      val total = subtotal + tax

      println("--------------------------")
      println("Subtotal : ₹$subtotal")
      println("GST (25%): ₹$tax")
      println("Total    : ₹$total")
      println("==========================")
   }
}

fun main() {
   val chaiCoffee = ChaiCoffee()
   chaiCoffee.showMenu()
   val myOrder = Order()

   // CUSTOMER CHOOSES COFFEE

//   myOrder.addCoffee(chaiCoffee.getCoffee(0))
//   myOrder.addCoffee(chaiCoffee.getCoffee(2))
//   myOrder.addCoffee(chaiCoffee.getCoffee(5))

   chaiCoffee.getCoffee(0)?.let {myOrder.addCoffee(it)}
   chaiCoffee.getCoffee(5)?.let {myOrder.addCoffee(it)}
   chaiCoffee.getCoffee(3)?.let {myOrder.addCoffee(it)}

   myOrder.printBill()
}