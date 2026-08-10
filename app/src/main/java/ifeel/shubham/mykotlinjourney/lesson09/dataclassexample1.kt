package ifeel.shubham.mykotlinjourney.lesson09

data class Student(
   val name: String,
   val roll: Int,
   val branch: String
)

fun main() {
   val student = Student("Rahul", 101, "CSE")
   println("LOOK")
   println(student)
}