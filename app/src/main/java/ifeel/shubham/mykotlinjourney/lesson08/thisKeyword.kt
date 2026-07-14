package ifeel.shubham.mykotlinjourney.lesson08

class Player {
   var name = "Unknown"
   var score = 0

   fun addScore(points: Int) {
      // this = the current player
      this.score += points
      println("$(this.name) = $(this.score) points")
   }

   fun resetScore() {
      this.score = 0
      println("${this.name} reset to $this.score")
   }
}

fun main() {
   val player1 = Player()
   player1.name = "Shubham"

   val player2 = Player()
   player2.name = "Varsha"

   player1.addScore(100)
   player2.addScore(50)
}