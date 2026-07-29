package ifeel.shubham.mykotlinjourney.lesson08

// Example of Code Duplication due to not use of inheritance


// ========== Class for Bike ==========
class Bike {
   val company = "Ola"

   fun startRide() {
      println("Ride Started")
   }

   fun endRide() {
      println("Ride Ended")
   }

   fun helmet() { // This func is unique to bike
      println("Helmet on")
   }
}

// ========== class for Car ==========
class Sedan {
   val company = "Ola"

   fun startRide() {
      println("Ride Started")
   }

   fun endRide() {
      println("Ride Ended")
   }

   fun seatbelt() { // This func is unique to car
      println("Seatbelt on")
   }
}