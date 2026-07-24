package ifeel.shubham.mykotlinjourney.lesson08

// CLASS FOR DRIVER
class Driver (
   val name: String, // Driver Name
   var rating: Double,
   var totalRides: Int,
   var isAvailable: Boolean,
   val vehicleNumber: String
) {
   // accepts the ride
   fun acceptRide(passengerName: String) {
      println("$name accepted ride from $passengerName")
      isAvailable = false
      totalRides++
   }

   // Terminate ride
   fun completeRide(earnedAmount: Double) {
      println("$name ride completed! Earned: ₹$earnedAmount")
      isAvailable = true
   }

   // Receive Rating
   fun receiveRating(newRating: Double) {
      rating = newRating
   }

   // Driver Profile
   fun printProfile() {
      println()
      println("===== DRIVER PROFILE =====")
      println("Name          : $name")
      println("Vehicle       : $vehicleNumber")
      println("Rating        : $rating ⭐")
      println("Total Rides   : $totalRides")
      println("Available     : $isAvailable")
      println("==========================")
   }
}

// CLASS FOR RIDE
class Ride (
   val passengerName: String,
   val pickupLocation: String,
   val dropLocation: String,
   val fare: Double,
   var isCompleted: Boolean
) {
   // Start Ride
   fun startRide() {
      println("$passengerName started ride")
      isCompleted = false
   }

   // ride complete
   fun endRide() {
      isCompleted = true
   }
}

// MAIN
fun main() {
   // Create Driver Object
   val driver1 = Driver(
      "Rahul",
      4.75,
      0,
      true,
      "MH02 AB 1234"
   )

   val ride1 = Ride(
      "Shubham",
      "Bandra, Mumbai",
      "Koramangala, Bangalore",
      250.0,
      false
   )

   driver1.acceptRide(ride1.passengerName)
   ride1.startRide()
   ride1.endRide()
   driver1.completeRide(ride1.fare)
   driver1.receiveRating(5.0)
   driver1.printProfile()
}