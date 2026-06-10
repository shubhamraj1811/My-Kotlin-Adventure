package ifeel.shubham.mykotlinjourney.lesson06

fun canBook(
    age: Int,
    availableSeats: Int,
    requestedSeats: Int,
    hasParentalGuidance: Boolean = false
): Boolean {

    // Age check
    val ageAllowed = age >= 18 || (age >= 13 && hasParentalGuidance)
    if (!ageAllowed) {
        println("❌ Cannot book: Age restriction applies")
        return false
    }

    // Max seats per booking
    if (requestedSeats > 6) {
        println("❌ Cannot book: Maximum 6 seats per booking")
        return false
    }

    // Availability check
    if (requestedSeats > availableSeats) {
        println("❌ Cannot book: Only $availableSeats seats available")
        return false
    }

    return true
}

fun calculateTotal(
    tickets: Int,
    basePrice: Int,
    isWeekend: Boolean,
    membership: String?
): Int {
    val surcharge = if (isWeekend) 50 * tickets else 0
    val priceWithSurcharge = basePrice + surcharge

    return when (membership) {
        "GOLD"   -> priceWithSurcharge - (priceWithSurcharge * 0.2).toInt()
        "SILVER" -> priceWithSurcharge - (priceWithSurcharge * 0.1).toInt()
        else     -> priceWithSurcharge
    }
}

fun printBookingConfirmation(
    movie: String,
    tickets: Int,
    basePrice: Int,
    isWeekend: Boolean,
    membershipType: String?,
    total: Int
) {
    val weekendCharge = if (isWeekend) 50 * tickets else 0
    val memberDisplay = when (membershipType) {
        "GOLD"   -> "GOLD (-20%)"
        "SILVER" -> "SILVER (-10%)"
        else     -> "None"
    }

    println("====== BOOKING SUMMARY ======")
    println("Movie:       $movie")
    println("Tickets:     $tickets")
    println("Base Price:  ₹$basePrice")
    println("Weekend:     +₹$weekendCharge")
    println("Membership:  $memberDisplay")
    println("Total:       ₹$total")
    println("✅ Booking Confirmed!")
}

fun main() {
    val movieName = "Spiderman 4"
    val availableSeats = 8
    val ticketPrice = 250
    val isWeekend = true

    println("--- Test 1: Normal Booking ---")
    val seats1 = 2
    val age1 = 16
    val membership1: String? = "GOLD"
    if (canBook(age = age1, availableSeats = availableSeats, requestedSeats = seats1)) {
        val base = ticketPrice * seats1
        val total = calculateTotal(seats1, base, isWeekend, membership1)
        printBookingConfirmation(movieName, seats1, base, isWeekend, membership1, total)
    }

    println()
    println("--- Test 2: Exceeds Max Seats ---")
    canBook(age = 16, availableSeats = availableSeats, requestedSeats = 7)

    println()
    println("--- Test 3: Age Restriction ---")
    canBook(age = 12, availableSeats = availableSeats, requestedSeats = 3)
}