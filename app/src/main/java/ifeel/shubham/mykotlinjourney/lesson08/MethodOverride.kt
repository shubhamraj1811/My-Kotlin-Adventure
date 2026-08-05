package ifeel.shubham.mykotlinjourney.lesson08

// Parent Class
open class Airlines() {
   open fun takeFlight() {
      println("Aeroplane took the flight!")
   }

   open fun safeLanding() {
      println("Aeroplane made safe landing!")
   }
}

// child class
class Indigo : Airlines() {
   override fun takeFlight() {
      println("Indigo took the flight!")
   }

   override fun safeLanding() {
      println("Indigo made safe landing!")
   }
}

fun main() {
   // test the child class - method overriding
   val flight1 = Indigo()

   flight1.takeFlight()
}