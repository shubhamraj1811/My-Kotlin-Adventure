package ifeel.shubham.mykotlinjourney.lesson08

open class Vehicle(val brand: String) {

   protected var engineRunning = false   // subclasses can access
   private var secretCode = "XYZ"        // nobody else can access

   fun startEngine() {
      engineRunning = true
      println("$brand engine started")
   }

   protected fun engineStatus(): String {
      return if (engineRunning) "Running" else "Off"
   }
}

class Car(brand: String, val model: String) : Vehicle(brand) {
   fun carStatus() {
      // ✅ Can access protected from parent
      println("Engine: ${engineStatus()}")
      println("Running: $engineRunning")

      // println(secretCode)  ❌ ERROR — private, can't access
   }
}

fun main() {
   val car = Car("Toyota", "Camry")
   car.startEngine()
   car.carStatus()

   // car.engineRunning   ❌ ERROR — protected, only class/subclass
   // car.engineStatus()  ❌ ERROR — protected, only class/subclass
}