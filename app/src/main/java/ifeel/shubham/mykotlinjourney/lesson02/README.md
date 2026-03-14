# 🔥 Table of Contents

1. [Kotlin Datatypes](#kotlin-datatypes)
2. [Excersice 2](#-exercise-2-defining-a-user-profile-state)

---

# Kotlin Datatypes
In Kotlin, every type is an object, which gives us access to powerful built-in functions.
The datatypes in Kotlin are grouped into 5 Categories:

1. Numbers (Integers & Floating Points):
   - Int (32-bit):
     - Standard whole number
     - Android Use Case: Referencing Android Resources, counting Items, or setting dimensions.
   - Long (64-bit):
     - For massive Whole Numbers.
     - Timestamps (Epoch Time) or Database Row IDs
   - Float (32-bit):
     - For decimals where extreme precision isn't needed.
     - UI Animations, Alpha (transparency) or view coordinates
   - Double (64-bit):
     - For high precision decimals.
     - GPS cordinates (latitude/longitude) or financial calculations.

2. Booleans:
   - Booleans is either True or False
   - Feature flags or UI state

3. Characters:
   - A single 16-bit unicide character used sparingly on its own.
   - Parsing custom formats or dealing with keyboard input events.

4. Strings:
   - A sequence of characters 
   - String is immutable in kotlin.
   - Used in displaying text to the user.

5. Array:
   - A collection of data of the same type.
   - Passing a fixed list of permissions to the Android OS.

---

# 🛠 Exercise 2: Defining a User Profile State
Let's put this into practice. Imagine you are building a "User Profile" screen for a fitness Android app.
I want you to write the Kotlin code to declare the following variables. Explicitly state the data types (e.g., val name: String = ...) so I know you grasp the concepts:
1. A variable for the user's unique database ID (could be billions of users).
2. A variable for the user's current weight in kilograms (can have decimals, e.g., 75.5).
3. A variable tracking whether the user has premium status.
4. A variable for the number of workouts they've completed.
5. A variable for their display name.

---

# 🛠 Exercise 3: Proving the Concept
Let's prove that Kotlin numbers act like objects, while combining it with our lesson on data types.
I want you to write a small piece of code. Don't worry about wrapping it in a main function, just write the lines of code:

1. Declare an immutable variable called basePrice and assign it the Double value of 10.50.
2. Because basePrice acts like an object, use the built-in Kotlin method .toInt() on basePrice to convert it to a whole number, and assign the result to a new immutable variable called roundedPrice.
3. Declare a nullable integer called userDiscount and set it to null.
4. Convert roundedPrice to a String using .toString() and assign it to a variable called priceTag.