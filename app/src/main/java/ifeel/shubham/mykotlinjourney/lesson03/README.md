# 🔥 Table of Contents

1. [Introduction to Conditionals](#introduction-to-conditionals)
2. [The Basic Structure of Conditionals](#the-basic-structure---ifelse-ifelse)
3. [When Expression](#when-expression)
4. [Exercise 07](#-exercise-007-the-tavern-encounter)
5. [Exercise 08](#-exercise-008-conditionals-in-action)
6. [Loops](#loops-in-kotlin)

---

# Introduction to Conditionals
- In older languages like Java or C++, conditionals are just "statements" (they do an action).
- In Kotlin, we treat conditionals as expressions (they calculate and return a value).
- This subtle shift changes how we architect code, making it incredibly concise.  
- Conditionals let our code choose a path based on a condition. This is where our app starts to feel alive.

---

# The Basic Structure - `if`/`else if`/`else`
We already know the basic structure of if/else.  
**[Check The Code Here](basicStructure.kt)**

## Returns a Value
- Kotlin does not have ternary operator
- In Kotlin, `if` is an expression that returns a value
- We can assign if block directly to a variable
- **[Check The Code Here](returnValue.kt)**
- We can also check the type of variable using if/else and when
- **[Check The Code Here](checkDatatype.kt)**

---

# When Expression
- In C++/Java we can use `switch` statements to check a variable against multiple values.
- But switch is clunky and prone to bugs.
- Kotlin threw out switch and Introduced `When`.
- It can check exact values, ranges, and even data types, all in one block.
- **[Check The Code Here](whenExpression.kt)**

## When - Real Android Example
**[Check The Code Here](whenAndroid.kt)**

---

# 🛠 Exercise 007: The Tavern Encounter
Let's put this into practice for our RPG.  
Our hero walks into a tavern and decides how much to pay for a room, which determines their health regeneration.  
Write a main function with the following logic:  

1. Create a val goldCoins = 25.
2. Use an if expression to assign a value to a val roomTier.
   1. If goldCoins is greater than or equal to 50, roomTier is "Luxury".
   2. Otherwise, roomTier is "Standard".
3. Use a when expression to assign a value to a val healthRegen.
   1. If roomTier is "Luxury", return 100.
   2. If roomTier is "Standard" AND goldCoins is between 20 and 49 (use the in range!), return 50.
   3. else, return 10.
4. Print the roomTier and the healthRegen amount.

---

# 🛠 Exercise 008: Conditionals in Action
Scenario: We're building an Android food delivery app.  
Write a Kotlin program with the following logic:  
**Variables to start with:**  
`
val customerName = "Shubham"     
val orderAmount = 850        // in rupees     
val isMember = true     
val distance = 12            // km from restaurant  
val timeOfDay = "night"      // "morning", "afternoon", "night"  
`  

**Tasks:**  
1. Use if/else to check if order qualifies for free delivery → free if orderAmount > 500— print "Delivery: Free" or "Delivery: ₹40"
2. Use when to print a greeting based on timeOfDay:
   1. "morning" → "Good morning, Shubham!"
   2. "afternoon" → "Good afternoon, Shubham!"
   3. "night" → "Good night, Shubham!"
   4. anything else → "Hello, Shubham!"
3. Use when with ranges to assign a delivery time estimate based on distance:
   1. 1..5 km → "20-30 mins"
   2. 6..10 km → "30-45 mins"
   3. 11..20 km → "45-60 mins"
   4. beyond 20 → "60+ mins"
   5. Print: "Estimated delivery: 45-60 mins"
4. Use when without argument to calculate a discount:
   1. Member AND order > 1000 → 20% discount
   2. Member AND order > 500  → 10% discount
   3. Not a member AND order > 1000 → 5% discount
   4. else → no discount
   5. Print: "Discount: 10%"
5. Final summary line using string template:
   1. "Order summary — Shubham | ₹850 | 45-60 mins | Discount: 10%"

---

# ➰ Loops in Kotlin
In production, we use loops for three main things:  
- displaying lists of data (like an Android news feed)
- running background polling (checking a server every 5 seconds)
- game loops (updating the screen 60 times a second).

## 🧠 The Core Idea
Imagine we're building an app that needs to:  
- Send a notification to 1000 users.
- Load 50 messages in a chat screen.
- Check every item in a shopping cart.
- Loops let you repeat a block of code automatically — either a fixed number of times, or until a condition is met.  

[Note: Kotlin's for loop iterates over anything that provides an iterator (like a Range or a List).]   

## 🚗 Types of Loop in Kotlin
1. for loop      → repeat over a range or collection
2. while loop    → repeat while condition is true
3. do-while loop → run once, then repeat while condition is true
4. forEach       → modern Kotlin way to loop collections

## 1️⃣ For Loop
**Basic Structure:**   
`for (item in collection) {`  
`// code to repeat`  
`}`  
**[Check The Code Here](forLoop.kt)**  

### Looping Over a Range
`// Print 1 to 5`  
`for (i in 1..5) {`  
`println(i)`  
`}`  

- `i` is just a variable name — it holds the current value each time.
- We can name it anything.
- Convention is i, j, k for simple counters, or descriptive names for real data.

### until — Exclusive Upper Bound  
- Until is used When working with lists and arrays, their index starts at 0 and ends at size - 1
**[Check The Code Here](forLoop.kt)**  

### downTo — Counting Backwards
- Used in countdown or timers.  
**[Check The Code Here](forLoop.kt)**

### step — Skip Values
- used to skip the iteration and move to next iteration.  
**[Check The Code Here](forLoop.kt)**  

### Looping Over a List
- used to visit each element of an array.
- **[Check The Code Here](loopingList.kt)**

### Loop With Index — withIndex()
- We'll use this in Android RecyclerView adapters constantly — knowing the position of each item.
- **[Check The Code Here](loopingList.kt)**

## The While Loop
- A while loop runs continuously as long as a condition is true.
- It checks the condition BEFORE running the block.
- Use while when we don't know in advance how many times it'll loop — we loop until something happens.

`while (condition) {`  
`// runs as long as condition is TRUE`  
`}`  
**[Check The Code Here](whileLoop.kt]**

# 🟦 Real Android use case — waiting for data to load: