package ifeel.shubham.mykotlinjourney.lesson02

fun main() {
    val playerName = "Shubham"
    var score = 0
    var level = 1
    var lives = 3
    // player earn 50 pts
    score += 50
    // earn 30 pts
    score += 30
    // level clrd
    level++
    // lost a heart
    lives--
    println("$playerName | Level $level | Score: $score | Lives: $lives")
}