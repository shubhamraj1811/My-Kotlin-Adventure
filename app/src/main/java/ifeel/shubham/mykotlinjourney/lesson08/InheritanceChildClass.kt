package ifeel.shubham.mykotlinjourney.lesson08

// ============ Class for Bike =================
class Bike1 : Vehicle1() {
   fun helmet() {
      println("Helmet on")
   }
}

// ============ class for Car =================
class Car1 : Vehicle1() {
   fun seatbelt() {
      println("Seatbelt on")
   }
}

// ============== main =================
fun main() {
   val bike = Bike1()
   val car = Car1()

   bike.startRide()
   bike.endRide()
   bike.helmet()

   car.startRide()
   car.endRide()
   car.seatbelt()
}