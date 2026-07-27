package ifeel.shubham.mykotlinjourney.lesson08

class AppConfig private constructor() {
   var apiUrl = "https://api.myapp.com"
   var timeout = 30

   // This is how objects are created instead
   companion object {
      fun create(): AppConfig {
         println("Creating app config...")
         return AppConfig()
      }
   }
}

fun main() {
   // val config = AppConfig()  ❌ ERROR — constructor is private

   val config = AppConfig.create()  // ✅ only way to create it
   println(config.apiUrl)
}