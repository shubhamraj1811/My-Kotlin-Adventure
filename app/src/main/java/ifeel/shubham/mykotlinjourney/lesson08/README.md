# 🔥 Table of Contents

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
