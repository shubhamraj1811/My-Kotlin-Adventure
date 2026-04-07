package ifeel.shubham.mykotlinjourney.lesson03

fun main() {
    // ----- task 1 -----
    for(i in 3 downTo 1) {
        println("Wave Starts in $i...")
    }
    println("FIGHT!")

    // ----- task 2 -----
    var bossHealth = 50
    var roundNumber = 0
    while (bossHealth > 0) {
        bossHealth -= 15
        if (bossHealth < 0) bossHealth = 0
        println("Round $roundNumber: You hit the boss for 15 damage! Boss HP is now $bossHealth")
        roundNumber++
    }
    println("Boss Defeated!")
}