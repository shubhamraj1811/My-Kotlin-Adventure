# 🔥 Table of Contents

1. [CORE IDEA](#the-core-idea)
2. [FIRST EXAMPLE](#first-example---createmyhuman)
3. [THIS KEYWORD](#this-keyword)
4. [METHOD CALLING](#class-methods-calling-each-other)
5. [REAL WORLD APP](#real-world-app---chaicoffee)
6. [CHEATSHEET](#cheatsheet)
7. [EXERCISE 01](#exercise--oops-1)

---
# The Core Idea
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
# First Example - CreateMyHuman

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

# `this` Keyword
Inside a class, this refers to the current object — the instance the method is being called on.

---
# CLASS METHODS CALLING EACH OTHER

**COFFEE SHOP APP EXAMPLE**
[CHECK THE CODE HERE](methodCalling.kt)

---
# REAL WORLD APP - CHAICOFFEE
The struture of this app  
[CHECK THE CODE HERE](ChaiCoffee.kt)

## OOP BREAKDOWN

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
# CHEATSHEET

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
# EXERCISE : OOPs 1

> Scenario: You're building a ride-sharing app like Ola or Uber.

## Task 1 — Create a Driver class with:

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

## Task 2 — Create a Ride class with:
- Properties: 
  - `passengeName`, 
  - `pickupLocation`, 
  - `dropLocation`, 
  - `fare (Double)`, 
  - `isCompleted (Boolean)`
- Method: 
  - startRide() — prints ride started message, nothing else
  - endRide() — sets isCompleted = true, prints completion message with fare

## Task 3 — Connect them in main():

- Create 2 driver objects
- Create 2 ride objects
- Driver 1 accepts Ride 1 → completes it → receives rating of 5.0
- Driver 2 accepts Ride 2 → completes it → receives rating of 4.0
- Print both driver profiles at the end

## Expected output style:

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