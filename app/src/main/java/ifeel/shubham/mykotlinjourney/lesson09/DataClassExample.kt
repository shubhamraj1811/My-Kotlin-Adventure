package ifeel.shubham.mykotlinjourney.lesson09

//
//   The server responds with JSON like:
//   {
//      "id": 101,
//      "name": "Shubham",
//      "username": "shubham01",
//      "email": "shubham@example.com"
//   }

// We want Kotlin to represent this response.

data class User(
   val id: Int,
   val name: String,
   val username: String,
   val email: String
)
// That's our data model.

// If we're using Retrofit, we might define:

interface UserApi {
   @GET("users/101")
   suspend fun getUser(): User
}

annotation class GET(val value: String)
