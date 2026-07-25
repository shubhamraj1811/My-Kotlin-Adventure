package ifeel.shubham.mykotlinjourney.lesson08

// Exercise 02 -  Building a NETFLIX like app

class Movie (
   val title: String,
   val director: String,
   val releaseYear: Int,
   val durationMinutes: Int,
   val genre: String,
   val rating: Double = 0.0,
   val isPremium: Boolean = false
) {
   // init function
   init {
      // movie validation
      if (durationMinutes <= 0)
         throw IllegalArgumentException("Invalid duration")
      // movie validation
      if (releaseYear < 1888)
         throw IllegalArgumentException("Invalid release year")
      println("🎬 Movie loaded: $title ($releaseYear)")
   }

   fun getDetails() {
      println("Title    : $title")
      println("Director : $director")
      println("Year     : $releaseYear")
      println("Duration : ${durationMinutes/60}h ${durationMinutes%60}m")
      println("Genre    : $genre")
      println("Rating   : $rating ⭐")
      println("Premium  : ${if(isPremium) "Yes" else "No"}")
   }
}

class StreamingUser (
   val username: String,
   val email: String,
   val plan: String = "FREE"
) {
   init {
      println("👤 User registered: $username ($plan plan)")
   }

   constructor(username: String) : this(
      username = username,
      email = "$username@guest.com"
   )

   // water history property
   val watchHistory = mutableListOf<String>()

   fun watchMovie(movie: Movie) {
      if(movie.isPremium && plan == "FREE") {
         println("❌ Upgrade to watch ${movie.title}")
         return
      } else {
         watchHistory.add(movie.title)
         println("▶️ Now watching: ${movie.title}")
      }
   }

   fun printWatchHistory() {
      println("Watch History:")
      watchHistory.forEachIndexed { index, movieTitle ->
         println("${index+1}. $movieTitle")
      }
   }
}

fun main () {
   val movie1 = Movie(
      "Pushpa 2",
      "Sukumar",
      2024,
      210,
      "Action",
      8.5,
      false
   )

   val movie2 = Movie(
      "Avengers: Doomsday",
      "Russo Brothers",
      2026,
      300,
      "Action",
      9.5,
      true
   )

   val movie3 = Movie(
      "RRR",
      "Rajamouli",
      2022,
      230,
      "Action",
      8.0,
      true
   )

   val user1 = StreamingUser(
      "shubham_dev",
      "shubham@gmail.com"
   )

   val user2 = StreamingUser(
      "itsvru.18",
      "vsvsvs@gmail.com",
      "PREMIUM"
   )

   // get movie details
   listOf(movie1, movie2, movie3).forEach { movie ->
      movie.getDetails()
      println()
   }

   // user watch movies
   listOf(movie1, movie2, movie3).forEach { movie ->
      listOf(user1, user2).forEach { user ->
         user.watchMovie(movie)
      }
   }
}