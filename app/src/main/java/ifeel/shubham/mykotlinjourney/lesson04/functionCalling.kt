package ifeel.shubham.mykotlinjourney.lesson04

fun validateEmail(email: String): Boolean {
    return "@" in email && "." in email
}

fun validatePassword(password: String): Boolean {
    return password.length >= 8
}

fun canLogin(email: String, password: String): Boolean {
    return validateEmail(email) && validatePassword(password)
}

fun showLoginResult(email: String, password: String) {
    if (canLogin(email, password)) {
        println("Login successful! Welcome 🎉")
    } else {
        println("Invalid credentials. Please try again.")
    }
}

fun main() {
    showLoginResult("shubham@gmail.com", "mypassword123")  // Login successful!
    showLoginResult("invalidemail", "mypassword123")        // Invalid credentials
    showLoginResult("shubham@gmail.com", "short")          // Invalid credentials
}

/*
- Each function does one job.
- validateEmail only validates email.
- canLogin only combines the validations.
- showLoginResult only handles the display.
- This is called the Single Responsibility Principle — the foundation of clean code.
*/