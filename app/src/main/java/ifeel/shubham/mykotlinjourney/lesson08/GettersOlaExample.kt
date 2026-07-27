package ifeel.shubham.mykotlinjourney.lesson08

// Suppose Ola stores earnings in dollars
// but wants to display them with formatting.

class DriverTwo {
   var earnings = 120.0
      get() {
         return field * 90 // convert to Rs
      }
}

fun main() {
   val driver = DriverTwo()
   println("Driver Earning in Rs: ${driver.earnings}")
}