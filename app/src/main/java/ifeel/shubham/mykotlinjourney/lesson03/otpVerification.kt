package ifeel.shubham.mykotlinjourney.lesson03

fun main() {
    var otpAttempts = 0
    var isOtpCorrect = false
    val correctOtp = "1234"
    do {
        val enteredOtp = "1234"   // simulating user entering OTP
        otpAttempts++

        if (enteredOtp == correctOtp) {
            isOtpCorrect = true
            println("OTP Verified! ✅")
        } else {
            println("Wrong OTP. Try again. (Attempt $otpAttempts)")
        }
    } while (!isOtpCorrect && otpAttempts < 3)

    if (!isOtpCorrect) {
        println("Too many attempts. Request new OTP.")
    }
}