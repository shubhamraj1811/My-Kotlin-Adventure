# 🔥 Table of Contents

1. [CORE IDEA](#️⃣-the-core-idea)
2. [FIRST EXAMPLE](#️⃣-first-example---createmyhuman)
3. [THIS KEYWORD](#️⃣-this-keyword)
4. [METHOD CALLING](#️⃣-class-methods-calling-each-other)
5. [REAL WORLD APP](#️⃣-real-world-app---chaicoffee)
6. [CHEATSHEET](#️⃣-cheatsheet)
7. [EXERCISE 01](#️⃣-exercise--oops-1)
8. [CONSTRUCTORS](#️⃣-constructors)
9. [INIT BLOCK](#️⃣-init-block)
10. [PRIMARY VS SECONDARY CONSTRUCTOR](#️⃣-primary-vs-secondary--when-to-use-which)
11. [CHEATSHEET](#️⃣-cheatsheet-2)
12. [EXERCISE 02](#️⃣-exercise---oops-2)

---

# #️⃣ The Core Idea

Imagine we're building a housing app like NoBroker. We need to represent 10,000 apartments. Each apartment has:

- An address
- A rent price
- A number of bedrooms
- Whether it's available or not

```
// For apartment 1
var address1 = "Bandra, Mumbai"
var rent1 = 25000
var bedrooms1 = 2
var isAvailable1 = true

// For apartment 2
var address2 = "Koramangala, Bangalore"
var rent2 = 18000
var bedrooms2 = 1
var isAvailable2 = false

// For 10,000 apartments... 😱
// This is impossible to manage
```

Thats why we use Classes and Objects

```
// Write the BLUEPRINT once
class Apartment(
    val address: String,
    val rent: Int,
    val bedrooms: Int,
    var isAvailable: Boolean
)

// Create as many BUILDINGS from it as you need
val apt1 = Apartment("Bandra, Mumbai", 25000, 2, true)
val apt2 = Apartment("Koramangala, Bangalore", 18000, 1, false)
val apt3 = Apartment("Andheri, Mumbai", 15000, 1, true)
// ... 9,997 more, all from the same blueprint
```

> A class is a blueprint. An object is what we build from it.

---

# #️⃣ First Example - CreateMyHuman

[CHECK THE CODE HERE](createMyHuman.kt)

**class CreateHuman:**
- class is a blueprint for creating objects.
- It defines what a Human has (properties) and what a Human can do (functions).
- No memory is allocated until an object is created.

**Primary Constructor:**
- This is called the Primary Constructor.
- It receives values when creating an object.
- val makes them read-only properties.
- Every object stores its own values.

**Functions:**
- Functions describe the behavior of an object.
- Also called methods when inside a class.

**Create an Object:**
- CreateHuman(...) calls the constructor.
- A new object is created in memory.
- The constructor fills the properties with the provided values.

---

# #️⃣ `this` Keyword
Inside a class, this refers to the current object — the instance the method is being called on.

---

# #️⃣ CLASS METHODS CALLING EACH OTHER

**COFFEE SHOP APP EXAMPLE**
[CHECK THE CODE HERE](methodCalling.kt)

---

# #️⃣ REAL WORLD APP - CHAICOFFEE
The struture of this app  
[CHECK THE CODE HERE](ChaiCoffee.kt)

## ❇️ OOP BREAKDOWN

**One Coffee Item**

```
Coffee
│
├── name
└── price
```

**Coffee Shop**

```
CoffeeShop
│
├── menu
├── showMenu()
└── getCoffee()
```

**Customer Order**

```
Order
│
├── cart
├── addCoffee()
└── printBill()
```

**This example demonstrates:**

✅ Class  
✅ Objects  
✅ Constructor  
✅ Properties  
✅ Methods  
✅ Encapsulation  
✅ Composition (Order contains Coffee objects)  

---

# #️⃣ CHEATSHEET

```
DEFINING A CLASS
class ClassName {
    var property = value          → class property
    fun method() { }              → class method
}

CREATING AN OBJECT (INSTANCE)
val obj = ClassName()             → creates one instance

ACCESSING MEMBERS
obj.property                      → read property
obj.property = newValue           → write (if var)
obj.method()                      → call method

THE 'this' KEYWORD
this.property                     → current object's property
this.method()                     → current object's method
                                   (needed when names conflict)

KEY CONCEPTS
Class     → blueprint / recipe
Object    → instance built from blueprint
Instance  → one specific object
           (dog1 and dog2 are two instances of Dog)

Each object has its own COPY of properties
Methods operate on the object they're called on
```

---

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

# #️⃣ CONSTRUCTORS

Before we even define a constructor, let's ask a question.  
**Imagine there are no constructors.**  

We have our `Ride` class from the Ola example.  

```
class Ride {

    var pickup = ""
    var destination = ""
    var distance = 0.0
}
```

Now in `main()`:

```
fun main() {
    val ride = Ride()

    ride.pickup = "Patna"
    ride.destination = "Airport"
    ride.distance = 12.5
}
```

This works. So why did Kotlin invent constructors?  
This is because when we create a ride, we must remember to write everything, what if we forgot to pass one parameter.  
Like, `ride.pickup = "Patna"`, `ride.distance = 25`  
But destination was never assigned.
> This is called an invalid object state.
> Constructors solve this problem.

---

## ❇️ What is a Constructor?
Constructor is a special function that runs automatically when an object is created.
Its job is:
> Whenever someone creates a `ride` object, it make sure it make sure it gets all the required information.

---

## ❇️ Primary Constructor

The primary constructor lives in the class header - on the same line as class name:  
**[CHECK THE CODE HERE - PRIMARY CONSTRUCTOR](primaryConstructor.kt)**

### CREATING AN OBJECT
1. Memory is allocated -> Heap ( Ride Object )
2. Constructor runs
   1. `name = "Rahul"`
   2. `rating = 4.5`
3. These values are stored inside the project

> `val/var` in the constructor header automatically creates properties. We don't need to declare them separately in the body.

**[CHECK THE CODE HERE](constructor.kt)**

---

## ❇️ Default Values in Primary Constructor

Just like functions, constructors can have default values:  
**[CHECK THE CODE HERE](defaultValueInConstructor.kt)**

---

# #️⃣ `init` BLOCK

`init` stands for initilizer block.  

It is a block of code that runs automatically every time an object is created, immediately after the primary constructor receives its parameters.

## ❇️ init WORKFLOW

```
Object Creation
      │
      ▼
Primary Constructor receives values
      │
      ▼
init block executes
      │
      ▼
Object is ready
```

**EXAMPLE OF init - [CHECK THE CODE HERE](initBlock.kt)

---

# #️⃣ SECONDARY CONSTRUCTOR

A secondary constructor is an alternative way to create an object — useful when we want to support multiple creation patterns:  
**[CHECK THE CODE HERE](secondaryConstructor.kt)**  

> this(...) in secondary constructor means "call the primary constructor with these values." Every secondary constructor must eventually call the primary constructor — directly or through another secondary constructor.

---

# #️⃣ Primary vs Secondary — When to Use Which?

╔══════════════════════════════════════════════════════════════╗
║  USE PRIMARY CONSTRUCTOR WHEN:                               ║
║  → Most creation scenarios use the same params               ║
║  → You can use default values to cover variations            ║
║  → Simpler, cleaner — prefer this always                     ║
║                                                              ║
║  USE SECONDARY CONSTRUCTOR WHEN:                             ║
║  → Different creation scenarios need completely              ║
║    different input types (e.g. String vs Map)                ║
║  → You're integrating with Java code                         ║
║  → Framework requires it (some Android classes)              ║
╚══════════════════════════════════════════════════════════════╝

---

# #️⃣ CHEATSHEET 2

```
PRIMARY CONSTRUCTOR
class Person(val name: String, var age: Int)
→ params become properties automatically with val/var
→ clean, idiomatic, always prefer this

DEFAULT VALUES
class Person(val name: String, val age: Int = 0)
→ makes params optional
→ replace most secondary constructors

INIT BLOCK
init {
    // runs immediately when object is created
    // can validate, compute derived values, log
}

SECONDARY CONSTRUCTOR
constructor(x: Type) : this(x, default, default)
→ must call primary constructor via this(...)
→ use only when default params aren't enough

EXECUTION ORDER
1. Primary constructor params set
2. init blocks run (top to bottom)
3. Object is ready to use
4. Methods run only when called

NAMED ARGUMENTS (always use for 3+ params)
val p = Person(name = "Shubham", age = 22)
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

---

# #️⃣ VISIBILITY MODIFIERS

A visibility modifier controls who is allowed to access a class, property, or function.  
Think of it as an access control system.  

Instead of asking:  
"Does this property exist?"  

we ask:  
"Who is allowed to use it?"  

**[EXAMPLE - VISIBILITY MODIFIER](visibilityModifiers.kt)**  

## ❇️ FOUR TYPES OF VISIBILITY MODIFIERS

```
╔══════════════════════════════════════════════════════════════╗
║  MODIFIER   ║   WHO CAN ACCESS IT                            ║
╠══════════════════════════════════════════════════════════════╣
║  public     ║   Everyone — default in Kotlin                 ║
║  private    ║   Only THIS class/file                         ║
║  protected  ║   This class + subclasses (inheritance)        ║
║  internal   ║   Anywhere in THIS MODULE/project              ║
╚══════════════════════════════════════════════════════════════╝
```

## ❇️ PUBLIC (DEFAULT)

In Kotlin, everything is public by default. Unlike Java where package-private is the default, Kotlin chose the more open default deliberately — but gives you tools to restrict when needed.

## ❇️ PRIVATE

`private` means only the class itself can access it.  
**[PRIVATE EXAMPLE](examplePrivate.kt)**  

- Why hide encrypt()? 
- Because it's an implementation detail. 
- The outside world doesn't need to know HOW you encrypt — just THAT verification works. 
- If you later switch to SHA-256 encryption, nothing outside the class needs to change.

## ❇️ PRIVATE ON CONSTRUCTOR

You can make the constructor itself private — preventing object creation from outside  
**[EXAMPLE - PRIVATE ON CONSTRUCTOR](privateOnConstructor.kt)**

## ❇️ PROTECTED

`protected` means this class AND its subclasses — nobody else
[EXAMPLE - PROTECTED](exampleProtected.kt)

## ❇️ INTERNAL

`internal` means anywhere inside the same module

```
internal class PaymentProcessor {
    internal fun processPayment(amount: Double) {
        println("Processing ₹$amount")
    }
}
```

**Revision:**  
```
PUBLIC    → anyone, anywhere, even other projects
INTERNAL  → anyone inside THIS project
PRIVATE   → only this class
PROTECTED → this class + subclasses
```

**For Android development:**
- internal is useful in multi-module projects (common in large apps like Zomato, Swiggy).
- For now, as a beginner, you'll primarily use public and private.
- internal becomes important when you start building proper multi-module Android architecture.


## ❇️ GETTERS & SETTERS

**[VIEW NOTES](GettersAndSetters.md)**

## ❇️ INHERITANCE IN KOTLIN

**[VIEW NOTES OF INHERITANCE](Inheritance.md)**