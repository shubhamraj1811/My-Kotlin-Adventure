# #️⃣ EXERCISE : OOPs 1

> Scenario: You're building a ride-sharing app like Ola or Uber.

**[CHECK THE CODE HERE](uberClone.kt)**

## ❇️ Task 1 — Create a Driver class with:

- Properties:
    - `name`,
    - `rating` (Double),
    - `totalRides` (Int),
    - `isAvailable` (Boolean),
    - `vehicleNumber` (String)

- Method
    - `acceptRide(passengerName: String)` — prints acceptance message, sets `isAvailable = false`, increments totalRides
    - `completeRide(earnedAmount: Double)` — prints completion message, sets isAvailable = true
    - `receiveRating(newRating: Double)` — updates rating to average of current and new rating
    - `printProfile()` — prints full driver profile

## ❇️ Task 2 — Create a Ride class with:
- Properties:
    - `passengeName`,
    - `pickupLocation`,
    - `dropLocation`,
    - `fare (Double)`,
    - `isCompleted (Boolean)`
- Method:
    - startRide() — prints ride started message, nothing else
    - endRide() — sets isCompleted = true, prints completion message with fare

## ❇️ Task 3 — Connect them in main():

- Create 2 driver objects
- Create 2 ride objects
- Driver 1 accepts Ride 1 → completes it → receives rating of 5.0
- Driver 2 accepts Ride 2 → completes it → receives rating of 4.0
- Print both driver profiles at the end

## ❇️ Expected output style:

```
🚗 Rahul accepted ride from Shubham
✅ Ride completed! Earned: ₹250.0
⭐ New rating for Rahul: 4.75

🚗 Priya accepted ride from Sneha
✅ Ride completed! Earned: ₹180.0
⭐ New rating for Priya: 4.5

===== DRIVER PROFILE =====
Name          : Rahul
Vehicle       : MH02 AB 1234
Rating        : 4.75 ⭐
Total Rides   : 1
Available     : true
==========================
```

---

# #️⃣ EXERCISE - OOPS 2

> You're building a streaming app like Netflix

**[CHECK THE CODE HERE](netflixClone.kt)**

## ❇️ Task 1 — Movie class

Create a Movie class with a primary constructor:

```
title: String
director: String
releaseYear: Int
durationMinutes: Int
genre: String
rating: Double = 0.0 (default)
isPremium: Boolean = false (default)
```

Add an init block that:

```
Validates durationMinutes > 0 — throw IllegalArgumentException("Invalid duration") if not
Validates releaseYear >= 1888 (first ever movie was 1888) — throw exception if not
Prints: "🎬 Movie loaded: [title] ([releaseYear])"
```

Add a method getDetails() that prints:

```
Title    : Pushpa 2
Director : Sukumar
Year     : 2024
Duration : 2h 30m
Genre    : Action
Rating   : 8.5 ⭐
Premium  : Yes
```

> Hint: duration in "2h 30m" format → ${durationMinutes/60}h ${durationMinutes%60}m

---

## ❇️ Task 2 - StreamingUser class:

- Primary constructor: `username: String`, `email: String`, `plan: String = "FREE"`
- Secondary constructor that takes just `username: String` — sets `email` to `"$username@guest.com"`, `plan` to `"FREE"`
- init block prints: `"👤 User registered: [username] ([plan] plan)"`
- Property `watchHistory` — a `mutableListOf<String>()` (empty list, not in constructor)
- Method `watchMovie(movie: Movie)`:
  - If movie is premium AND user plan is `"FREE"` → print `"❌ Upgrade to watch [title]"`
  - Otherwise → add `movie title` to `watchHistory`, print `"▶️ Now watching: [title]"`
- Method `printWatchHistory()` — print all watched titles with numbers

---

## ❇️ Task 3 — Connect in main():

```
// Create 3 movies (mix of premium/free, different details)
// Create 2 users (one FREE, one PREMIUM)
// Have each user try to watch all 3 movies
// Print both users' watch histories at the end
// Also test the invalid movie (negative duration) — catch the exception
```
