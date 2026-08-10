# 🚀 ABSTRACT CLASS


## ❇️ Why were Abstract Classes invented?

We have:  

```
Vehicle
├── Bike
├── Car
├── Auto
└── SUV
```

Every vehicle has:   

- startRide()
- endRide()
- calculateFare()

From inheritance and polymorphism, we know we can do this:   

```
open class Vehicle {
    open fun calculateFare() {
        println("Calculating Fare")
    }
}
```

Children override it:  

```
class Bike : Vehicle() {
    override fun calculateFare() {
        println("₹50")
    }
}
```

Now your manager says:   
"Every vehicle must calculate its fare."   

We want to force every child to provide its own fare calculation.   

## ❇️ The OOP Solution

We create a parent that says:  
"I know every vehicle can calculate fare...  
But I don't know how.  
Every child must provide its own implementation."  
This is exactly what an abstract function is.  

## 📱 Kotlin Syntax

**Step 1: Make the class abstract**   
`abstract class Vehicle`  

We use abstract, not open.  
An abstract class is automatically open for inheritance.  

**Step 2: Create an abstract function**   
```
abstract class Vehicle {
    abstract fun calculateFare()
}
```

No body.   
No {}.   
No implementation.   
You're basically saying:   
"Every vehicle must know how to calculate fare, but I'm not defining it here."   

```
Now ->

class Bike : Vehicle() {
    override fun calculateFare() {
        println("₹50")
    }
}

class Car : Vehicle() {
    override fun calculateFare() {
        println("₹120")
    }
}

// Now the compiler guarantees that every concrete vehicle knows how to calculate its fare.
```

## ❇️ What Happens If We Forget?

Suppose we write:  

class Bike : Vehicle()  

Compilation Error. Why?  

Because Bike is no longer fulfilling the contract inherited from Vehicle.  

The compiler forces you to either:  
- implement calculateFare(), or
- declare Bike itself as abstract.

This is one of the biggest advantages of abstract classes.  

## ❇️ Can an Abstract Class Have Normal Functions?

Yes.  

This is what makes abstract classes different from a class that only contains abstract methods.  

Example:  
```
abstract class Vehicle {
    fun startRide() {
        println("Ride Started")
    }

    fun endRide() {
        println("Ride Ended")
    }

    abstract fun calculateFare()
}
```

Now every child automatically gets:

`startRide()`  
`endRide()`  

But must implement:   

`calculateFare()`   

This combination of shared behavior + required behavior is the main purpose of an abstract class.      


## 📱 Real Android Example

>I magine Android had a base class for payments:

```agsl
abstract class PaymentMethod {

    abstract fun pay(amount: Double)

    fun printReceipt() {
        println("Receipt Printed")
    }
}

// =================================
class UpiPayment : PaymentMethod() {

    override fun pay(amount: Double) {
        println("Paid using UPI")
    }
}

// =================================

class CardPayment : PaymentMethod() {

    override fun pay(amount: Double) {
        println("Paid using Card")
    }
}
```

- Every payment method prints receipts the same way.
- But each payment method processes payments differently.
- That's an ideal use case for an abstract class.


