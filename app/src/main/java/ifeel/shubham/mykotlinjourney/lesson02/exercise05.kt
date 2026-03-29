package ifeel.shubham.mykotlinjourney.lesson02
// text based RPG game
fun main() {
    println("Enter Your Hero Name: ")
    val heroName = readln()
    val critHitChance = 12.5

    var isPoisoned = false
    var goldCoins = 50
    var equippedWeapon: String? = null
    // print statement
    println("Hero Name is $heroName")
    println("$heroName has $goldCoins Coins")
    println("$heroName has a Critical Hit Chance of $critHitChance%")
    println("Poison Status: $isPoisoned")
    println("Equipped Weapon: $equippedWeapon")
}