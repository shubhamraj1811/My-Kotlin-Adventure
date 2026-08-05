package ifeel.shubham.mykotlinjourney.lesson08

open class TwoWheels {
   open fun startRide() {
      println("Vehicle Checks")
   }
}

class Honda : TwoWheels() {
   override fun startRide() {
      super.startRide()
      println("Helmet Check")
   }
}

fun main() {
   val bike = Honda()
   bike.startRide()
}

//  ❇️ Think of it like
//  Bike.startRide()
//        ↓
//  TwoWheels.startRide()
//        ↓
//  Bike's extra code