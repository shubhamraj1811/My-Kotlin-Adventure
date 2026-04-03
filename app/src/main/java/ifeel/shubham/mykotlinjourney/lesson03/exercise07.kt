package ifeel.shubham.mykotlinjourney.lesson03

fun main() {
    print("Enter Gold Coins: ")
    val goldCoins = readln().toInt()
    val roomTier = if(goldCoins >= 50) "Luxury" else "Standard"

    /* ----------------------------------
    val healthRegen = when(roomTier) {
        "Luxury" -> 100
        "Standard" -> if(goldCoins in 20..49) 50 else 10
        else -> 10
    }
    ---------------------------------- */

    // The Senior "Flat" Approach
    val healthRegen = when {
        roomTier == "Luxury" -> 100
        roomTier == "Standard" && goldCoins in 20..49 -> 50
        else -> 10
    }
    println("Room Tier: $roomTier")
    println("Health Regen: $healthRegen")
}