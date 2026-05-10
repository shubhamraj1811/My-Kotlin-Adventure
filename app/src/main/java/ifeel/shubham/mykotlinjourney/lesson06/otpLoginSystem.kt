package ifeel.shubham.mykotlinjourney.lesson06



// user verification
fun userVerification() {
    // since user reached here , it is verified
    println("User verified successfully!")
}


/*
Check Registered Phone Number
And return The Flag
 */
fun checkRegisteredNumber(PhoneNum: String): Boolean {
    // flag to track the number
    var flag: Boolean = false

    // registered phone numbers in database - verifying registered numbers
    when(PhoneNum) {
        "9876543210" -> {
            println("✅ Number registered")
            flag = true
        }
        "8765432109" -> {
            println("✅ Number registered")
            flag = true
        }
        "7654321098" -> {
            println("✅ Number registered")
            flag = true
        }
        else -> println("❌ Number not registered. Please sign up.")
    }
    return flag
}


/*
OTP verification
After 3 attempts -> acc locked
 */
fun otpVerification(userNumber: String, generatedOtp: String, otp1: String, otp2: String, otp3: String) {
    println("--- Login Attempt: $userNumber ---")

    // checking if number is registered
    val isRegistered: Boolean = checkRegisteredNumber(userNumber)

    if (isRegistered) {
        val attempts = listOf(otp1, otp2, otp3)
        for((index, otp) in attempts.withIndex()) {
            val attempt = index+1
            if (generatedOtp == otp) {
                println("Attempt $attempt: Correct OTP ✅")
                break
            }
            println("Attempt $attempt: Wrong OTP ❌")

            if(attempt == 3) {
                println("🔒 Account locked after 3 failed attempts")
                println("Please Try Again After 24 Hours ⌛")
                return
            } else {
                println("Please Try Again.")
            }
        }
        // check if user if verified
        userVerification()
    }
}


// main
fun main() {
    // generated OTP for login by the system
    val correctOTP: String = "1811"

    // --- user1 ---
    val user1PhoneNumber: String = "9876543210"
    otpVerification(user1PhoneNumber, correctOTP, "1234", "1811", "7878")
    println()
    println()

    // --- user2 ---
    val user2PhoneNumber: String = "1111111111"
    otpVerification(user2PhoneNumber, correctOTP, "1234", "1111", "7878")
    println()
    println()


    // --- user1 ---
    val user3PhoneNumber: String = "8765432109"
    otpVerification(user3PhoneNumber, correctOTP, "1234", "8000", "7878")
}