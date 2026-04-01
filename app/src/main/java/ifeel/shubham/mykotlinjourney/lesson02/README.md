# 🔥 Table of Contents

1. [Kotlin Datatypes](#kotlin-datatypes)
2. [Type Inference](#type-inference)
3. [Exercise 03](#-exercise-003-defining-a-user-profile-state)
4. [Exercise 04](#-exercise-004-proving-the-concept)
5. [Exercise 05](#-exercise-005-the-rpg-character-state)
6. [Operators](#operators)
7. [Special Symbols](#special-symbols)
8. [Exersice 06](#-exercise-006--operators-in-action)
---

# Kotlin Datatypes
In Kotlin, every type is an object, which gives us access to powerful built-in functions.
The datatypes in Kotlin are grouped into 5 Categories:

**View Code Here:** [Kotlin File](datatypes.kt)
1. **Numbers (Integers & Floating Points):**
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
     - GPS co-ordinates (latitude/longitude) or financial calculations.

2. **Booleans:**
   - Booleans is either True or False
   - Feature flags or UI state

3. **Characters:**
   - A single 16-bit unicode character used sparingly on its own.
   - Parsing custom formats or dealing with keyboard input events.

4. **Strings:**
   - A sequence of characters 
   - String is immutable in kotlin.
   - Used in displaying text to the user.

5. **Array:**
   - A collection of data of the same type.
   - Passing a fixed list of permissions to the Android OS.

---

# Type Inference

- In Python, we are used to dynamically typed variables that just take on whatever type they are assigned.
- And in C++, we are used to statically typed variables where we tell the compiler what type of variable we are declaring.
- Kotlin gives you the best of both worlds.
- It is statically typed (meaning types are checked at compile time, catching errors early).
- But the compiler is smart enough to figure out the type based on the value we assign to it.
- This is Type Inference.
- We don't need to explicitly write the type on the left side of the equals sign if the right side makes it obvious.
- [Note: Type inference is the default, but we always use explicit typing in one specific scenario: **Public APIs and Return Types**.]

---

# 🛠 Exercise 003: Defining a User Profile State
Let's put this into practice. Imagine you are building a "User Profile" screen for a fitness Android app.
I want you to write the Kotlin code to declare the following variables. Explicitly state the data types (e.g., val name: String = ...) so I know you grasp the concepts:
1. A variable for the user's unique database ID (could be billions of users).
2. A variable for the user's current weight in kilograms (can have decimals, e.g., 75.5).
3. A variable tracking whether the user has premium status.
4. A variable for the number of workouts they've completed.
5. A variable for their display name.

**View The Code Here:** [Exercise 03](exercise03.kt)

---

# 🛠 Exercise 004: Proving the Concept
Let's prove that Kotlin numbers act like objects, while combining it with our lesson on data types.
I want you to write a small piece of code. Don't worry about wrapping it in a main function, just write the lines of code:

1. Declare an immutable variable called basePrice and assign it the Double value of 10.50.
2. Because basePrice acts like an object, use the built-in Kotlin method .toInt() on basePrice to convert it to a whole number, and assign the result to a new immutable variable called roundedPrice.
3. Declare a nullable integer called userDiscount and set it to null.
4. Convert roundedPrice to a String using .toString() and assign it to a variable called priceTag.

**View The Code Here:** [Exercise 04](exercise04.kt)

---

# 🛠 Exercise 005: The RPG Character State
Let's put Type Inference into practice.
Let's say we're building the core engine for a text-based RPG game.  
You need to initialize a new player character.  
Write the code to declare the following variables, but you are strictly forbidden from explicitly writing the data types (do not use : Int, : String, etc.). Let the compiler infer everything:

1. A variable for the player's heroName (e.g., "Arthur").
2. A variable for goldCoins starting at 50.
3. A variable for criticalHitChance starting at 12.5 (needs to be inferred as a Double).
4. A variable for isPoisoned starting as false.
5. Challenge: Declare a variable called equippedWeapon. It should currently be null, but it needs to be capable of holding a String later. (Think carefully about this one and how type inference handles nulls!).

**View The Code Here:** [Exercise 05](exercise05.kt)**

---

# Operators
An operator is a symbol that performs an action on one or more values.

## 1️⃣ Arithmetic Operators
Works exactly like maths.  
`+` = add  
`-` = sub  
`*` = product  
`/` = divide  
`%` = module  
**[View Code Here](airthmaticOperator.kt)

## 2️⃣ Assignment Operators
Assigns Value. Like `var score = 10`.  
There are other assignment operators like +=, -=, /=, *=, %=.  

## 3️⃣ Comparison Operator
These always return true or false (Boolean). Used constantly in conditions:  
* `==` Checks for equality
* `!=` Not Equal
* `>` Smaller
* `<` Greater
* `>=` Smaller or Equal
* `<=` Greater or Equal
**Check the Code here:** [View Code](comparisonOperator.kt)

## 4️⃣ Logical Operator
Used to combine multiple conditions together:  
1. && → AND → BOTH sides must be true
2. || → OR → AT LEAST ONE side must be true
3. ! → NOT → flips true to false, false to true
   **Check the Code here:** [View Code](logicalOperator.kt)

## 5️⃣ String Operators
Used with String.  
1. `" "`
2. `$`

## 6️⃣ Range Operator
**[Check The Code Here](rangeMembership.kt)**
This is where Kotlin shines. Instead of writing long, complicated greater-than/less-than checks, Kotlin gives us the Range (..) and Membership (in) operators.  
It Checks Everything between x and y.  

## 7️⃣ Membership Operators
### `in`
- specifies the object being iterated in a for loop.
- is used as an infix operator to check that a value belongs to a range, a collection, or another entity that defines a 'contains' method.
- is used in when expressions for the same purpose.
- marks a type parameter as contravariant.

### `!in`
- is used as an operator to check that a value does NOT belong to a range, a collection, or another entity that defines a 'contains' method.
- is used as an operator to check that a value does NOT belong to a range, a collection, or another entity that defines a 'contains' method.

# Special Symbols

### to
**[View Code Here](specialSymbol.kt)**
- creates a pair
- Link two values together as a key-value pair

### is — Type Check
**[View Code Here](specialSymbol.kt)**
- is performs a Type Check
- It asks the compiler a simple true/false question: "Is this variable a specific data type?"

### Increment & Decrement
**[View Code Here](specialSymbol.kt)**
- We already know

---

# ✍️ Exercise 006 — Operators in Action
Scenario: You're building a simple Android game score tracker.  
Write a Kotlin program that:  
1. Creates a variable playerName = "Shubham", score = 0, level = 1, lives = 3
2. Player earns 50 points → update score using assignment operator
3. Player earns 30 more points → update again
4. Player clears a level → increment level using ++
5. Player loses a life → decrement lives using -- 
6. Print: "Shubham | Level 2 | Score: 80 | Lives: 2"
7. Check if score is in range 50..100 and print "Bonus range: true/false"
8. Check if lives > 0 && score > 50 and print "Still in game: true/false"