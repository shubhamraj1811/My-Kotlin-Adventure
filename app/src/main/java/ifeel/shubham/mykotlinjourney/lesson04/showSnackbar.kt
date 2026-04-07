package ifeel.shubham.mykotlinjourney.lesson04

fun showMessage(
    message: String,
    duration: Int = 3,
    isError: Boolean = false
) {
    val type = if(isError) "ERROR" else "INFO"
    println("[$type] $message (shows for ${duration}s)")
}

fun main() {
    showMessage("Profile Saved!!")
    // [INFO] Profile saved! (shows for 3s)

    showMessage("Network error", isError = true)
    // [ERROR] Network error (shows for 3s)

    showMessage("Session expired", 5, true)
    // [ERROR] Session expired (shows for 5s)
}