package ifeel.shubham.mykotlinjourney.lesson08

// Building a Social Media Interface

class Instagram (
   val username: String,
   val followers: Int,
   val following: Int,
   var otp: String = "0000"
) {
//   var otp: Int
//   var time: String

   // init block runs immediately when Object is created
   init {
      // Validate Account
      if(!(otp == "1811")) {
         throw Exception("Invalid OTP")
      }
   }

   // do normal work
   fun showProfile() {
      println("===== PROFILE =====")
      println("Username: $username")
      println("Followers: $followers")
      println("Following: $following")
      println("===================")
   }
}

// MAIN
fun main() {
   val shubham = Instagram(
      "shubham_dev",
      100,
      200,
      "1811"
   )

   shubham.showProfile()
}