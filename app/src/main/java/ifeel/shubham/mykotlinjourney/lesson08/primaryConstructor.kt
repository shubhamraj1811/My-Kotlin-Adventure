package ifeel.shubham.mykotlinjourney.lesson08

class Driver1(val name: String, var rating: Double) { // primary constructor in the header of class name
   fun printName() {
      println("Driver: $name")
      println("Rating: $rating")
   }
}

fun main() {
   // must provide values at creation
   val driver1 = Driver1(
      "Rahul",
      4.5
   )

   driver1.printName()   // Driver: Rahul Rating: 4.5
}