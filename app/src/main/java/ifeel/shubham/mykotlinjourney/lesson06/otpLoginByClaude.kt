//package ifeel.shubham.mykotlinjourney.lesson06
//
//val registeredNumbers = listOf("9876543210", "8765432109", "7654321098")
//
//fun checkRegisteredNumber(phoneNum: String): Boolean {
//    val isRegistered = phoneNum in registeredNumbers
//    if (isRegistered) println("✅ Number registered")
//    else println("❌ Number not registered. Please sign up.")
//    return isRegistered
//}
//
//fun otpVerification(
//    userNumber: String,
//    generatedOtp: String,
//    otp1: String,
//    otp2: String,
//    otp3: String
//) {
//    println("--- Login Attempt: $userNumber ---")
//
//    if (!checkRegisteredNumber(userNumber)) return
//
//    val attempts = listOf(otp1, otp2, otp3)
//    var isVerified = false
//
//    for ((index, otp) in attempts.withIndex()) {
//        val attempt = index + 1
//        if (generatedOtp == otp) {
//            println("Attempt $attempt: Correct OTP ✅")
//            isVerified = true
//            break
//        }
//        println("Attempt $attempt: Wrong OTP ❌")
//    }
//
//    if (isVerified) {
//        println("User verified successfully!")
//    } else {
//        println("🔒 Account locked after 3 failed attempts")
//    }
//}
//
//fun main() {
//    val correctOTP = "1811"
//
//    otpVerification("9876543210", correctOTP, "1234", "1811", "7878")
//    println()
//
//    otpVerification("1111111111", correctOTP, "1234", "1111", "7878")
//    println()
//
//    otpVerification("8765432109", correctOTP, "1234", "8000", "7878")
//}