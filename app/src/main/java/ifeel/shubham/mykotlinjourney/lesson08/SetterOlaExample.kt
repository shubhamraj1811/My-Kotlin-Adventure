package ifeel.shubham.mykotlinjourney.lesson08

class DriverOne(
   val name: String // primary constructor
){
   var rating = 5.0
      set(value){
         if(value in 0.0..5.0){
            field = value
         }else{
            println("Invalid Rating")
         }
      }
}

fun main(){
   val driver = DriverOne("Rahul")
   driver.rating = 4.9
   println(driver.rating)

   driver.rating = 100.0
   println(driver.rating)
}