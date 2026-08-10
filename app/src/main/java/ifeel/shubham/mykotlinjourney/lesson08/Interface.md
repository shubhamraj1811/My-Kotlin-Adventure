# 🚀 INTERFACE

## ❇️ What is an Interface?

Imagine you're applying for a driving license.  
The government says:  
"To get a license, you must know how to:  
- Start a car
- Stop a car
- Follow traffic rules"

The government doesn't teach you how to drive.  
It simply defines what you're expected to be able to do.  

That's a contract.   

---

An Interface is a contract.  
It tells a class: "If you say you implement me, then you must provide these functions."  
An interface describes what a class can do, not how it does it.    

In Kotlin, an interface is a blueprint that defines a set of functions and properties that a class agrees to implement.   

It answers the question:   

> "What capabilities does this class promise to provide?"

## ❇️ Why were Interfaces invented?

> If abstract classes already exist, why did OOP invent interfaces?

---

Imagine you're developing a Smart Home System.  
```
Light
Fan
AC
TV
Door Lock
Speaker
```

You think: "I'll create a parent class."

```
Device
│
├── Light
├── Fan
├── AC
├── TV
└── Speaker
```

Everything looks good.

### 🔷 KotlinRequirements

Your manager says:   
"Some devices support Wi-Fi.   
"Some devices support Voice Control."   
"Some devices are Battery Powered."   

**Interfaces were invented to represent capabilities instead of types.**

---

## 📱 Real Android Example

Think about a button.   

Some UI components can be:     
- Clicked   
- Focused   
- Scrolled   
- Dragged   

Is a Button a Click? No.   
It can be clicked.
Is a RecyclerView a Scroll?
No.
It can scroll.
Android models many of these behaviors using interfaces because they describe capabilities that many unrelated classes can share.

## ❇️ Interfaces in Real Code

The goal here is to see why a developer would actually create an interface.   

### 🔷 Example 1 — Payment System 💳

Suppose we're building a payment app.  

We have:  
- UPI
- Credit Card
- Net Banking

All of them can make a payment, but the implementation is different.  

**Step 1 — Define the contract**   
```
interface Payment {
    fun pay(amount: Double)
}
```

> This says: Any payment method must provide pay().  

**Step 2 — Different implementations**   

```
class UpiPayment : Payment {
    override fun pay(amount: Double) {
        println("Paid ₹$amount using UPI")
    }
}
```

```
class CardPayment : Payment {
    override fun pay(amount: Double) {
        println("Paid ₹$amount using Card")
    }
}
```

```
class NetBankingPayment : Payment {
    override fun pay(amount: Double) {
        println("Paid ₹$amount using Net Banking")
    }
}
```

```

```

> Now we have one contract, multiple implementations.

## 🧠 So What Have We Learned So Far?

```
Interface
   ↓
Defines a contract
   ↓
Classes implement the contract
   ↓
Different classes can implement it differently
   ↓
One class can implement multiple interfaces
   ↓
We can use the interface as a common type
   ↓
This enables polymorphism + loose coupling
```



❇️📱✅❌⌛⚙️🔥🔰🛡️🔷💭⚜️🔱🚀💻