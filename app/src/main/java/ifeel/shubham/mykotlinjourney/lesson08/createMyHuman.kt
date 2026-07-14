package ifeel.shubham.mykotlinjourney.lesson08

class CreateHuman(
   val name: String,
   val year: Int,
   val place: String,
   val canCode: Boolean
) {
   fun born() {
      println("The human is born")
   }

   fun eat() {
      println("Human started eating!")
   }

   fun sleep() {
      println("Human is sleeping")
   }

   fun introduction() {
      println("Hello, I am a human and my name is $name") // string
      println("I was created in $year") // int
      println("I am from $place") // string
      println("Can I write code? - $canCode") // boolean

   }
}

fun main() {
   // call the class to creata a human object
   val human1 = CreateHuman("Shubham", 2026, "Patna", true)
   human1.born()
   human1.eat()
   human1.sleep()
   human1.introduction()

   val human2 = CreateHuman("Varsha", 2026, "Begusarai", true)
   human2.born()
   human2.eat()
   human2.sleep()
   human2.introduction()
}