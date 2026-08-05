# 🚀 METHOD OVERRIDING



## ❇️ Why Method Overriding

We already have inheritance.  

```
open class Vehicle {

    fun startRide() {
        println("Ride Started")
    }

}

// now

class Bike : Vehicle()

class Car : Vehicle()
```

- Bike inherited startRide().
- Car inherited startRide().

But now Ola gives you a new requirement.  
Bike : Starting Bike ride...     
Car : Starting Car ride...      

Inheritance alone cannot do this  

All children inherited exactly the same function.   
We need a way for each child to keep the same function name but change its implementation.
That's why Method Overriding exists.   

## ❇️ The Problem

Without overriding...   
All the child classes behave the same but different objects should behave different in real android apps.    

### ⚠️ WHY CREATING NEW FUNCTION DOESN'T WORK?

Yes, you absolutely can create new functions in the child class.   
But new functions and overridden functions solve different problems.   

```
open class Vehicle {
    fun startRide() { ... }
    fun blowHorn() { ... }
    fun endRide() { ... }
}

// ======== Bike ========
class Bike : Vehicle() {
    fun wearHelmet() {
        println("Helmet Checked")
    }
}

// ====== Car ===========
class Car : Vehicle() {
    fun wearSeatBelt() {
        println("Seat Belt Checked")
    }
}
```
- Every vehicle can start a ride.
- Every vehicle can blow the horn.
- Every vehicle can end the ride.
- Only bikes wear helmets.
- Only cars wear seat belts.

These are new behaviors, not replacements.  

### ⚠️ So when do we need overriding?

```
Bike.startRide()
↓
Ride Started
```

Now the product manager says:  

"Before a bike ride starts, helmet verification is mandatory."

## 🚀 A SIMPLE RULE

**New Function:** This is a completely new capability   
**Override"** This is the same capability but with different behavior   

---

# ❇️ Kotlin Syntax

**Parent:**
```
open class Vehicle {

    open fun startRide() {
        println("Ride Started")
    }

}
```

**Child:**
```
class Bike : Vehicle() {

    override fun startRide() {
        println("Bike Ride Started")
    }

}
```

[CHECK THE CODE HERE - METHOD OVERRIDING](MethodOverride.kt)

---

## ❇️ `super` KEYWORD

Sometimes you don't want to completely replace the parent's implementation. You want to reuse it.

**EXAMPLE: **

---

## ❇️ Real Android Example

```
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
```

- Now it should make sense.
- The framework already has an onCreate().
- Your MainActivity overrides it to add its own behavior.
- But it still calls: `super.onCreate(savedInstanceState)`
- because the parent performs important initialization.
- This is one of the best real-world examples of overriding.

---

## 💻 Interview Questions

#### 🌐 What is method overriding?
A child class provides its own implementation of a function that already exists in the parent class.

#### 🌐 What is super?
It lets the child call the parent's implementation of an overridden function.

