# 🚀 DATA CLASSES

| Topics                                 | What we'll cover                                                 | Goal                           |
|----------------------------------------|------------------------------------------------------------------|--------------------------------|
| **1. What is a Data Class?**           | Definition, purpose, normal class vs data class                  | Build the core mental model    |
| **2. Why Data Classes?**               | What problem they solve and why Kotlin introduced them           | Understand the *why*           |
| **3. Basic Syntax**                    | `data class`, primary constructor, properties                    | Write your first data class    |
| **4. Generated Functions**             | `toString()`, `equals()`, `hashCode()`, `copy()`, `componentN()` | Understand the real power      |
| **5. `equals()` & `hashCode()`**       | Object comparison vs value comparison                            | Critical for interviews        |
| **6. `copy()`**                        | Copying objects and modifying selected properties                | Very important in Android      |
| **7. Destructuring**                   | `component1()`, `component2()` etc.                              | Understand Kotlin's syntax     |
| **8. Data Class Rules & Restrictions** | What can/can't be a data class                                   | Avoid common mistakes          |
| **9. Data Class vs Normal Class**      | Side-by-side comparison                                          | Know when to use which         |
| **10. Data Classes in Android**        | API models, Room entities, UI state, MVVM                        | Connect it to real development |
| **11. Multiple Practical Examples**    | Student, Food Order, User, API response                          | Strengthen understanding       |
| **12. Interview Round**                | Common questions + tricky cases                                  | Job preparation                |
| **13. Mini Exercise**                  | Build a small model yourself                                     | Verify mastery                 |

---

## 🔰 What is a "data object"?

Imagine you're building a college app.    
You need to represent a student:   
```
Student
----------------
name = "Rahul"
roll = 42
branch = "CSE"
year = 3
```
This object isn't really supposed to do complicated things.  
It's mainly carrying information.  
That's what we call a data object.  

For example: User, Product, Student, Order, Movie, Address, Payment  
These objects primarily represent data.  

In Kotlin, we could create:  
```
class Student(
    val name: String,
    val roll: Int,
    val branch: String,
    val year: Int
)
```
So why does Kotlin need data class?


## 🔰 The Problem

Suppose we create two students:   
```
val student1 = Student("Rahul", 42, "CSE", 3)
val student2 = Student("Rahul", 42, "CSE", 3)
```

To us, these students contain exactly the same information.   
But Kotlin's normal class treats them as two different objects.   

If we compare: `println(student1 == student2)`  

we don't automatically get the kind of value-based comparison we'd usually want for a pure data object.  
And that's only one problem.   

We'd also like our objects to have useful: toString(), equals(), hashCode(), copy()   
Implementing these manually for every model class would be repetitive.   



## 🔰 Kotlin's Solution

Kotlin basically says: "If this class is primarily meant to hold data, tell me that."   
We do that with:  
```
data class Student(
    val name: String,
    val roll: Int,
    val branch: String,
    val year: Int
)
```

That's a data class.  
The data keyword tells Kotlin:  
"This class represents data, so generate useful data-related behavior for me."   
That's the core idea.   



## 🔰 The Mental Model

Think about a normal class:  
```
CLASS
│
├── Data
├── Behavior
├── Business Logic
└── Functions
```

```
A data class is primarily:  

DATA CLASS
│
└── DATA
    ├── name
    ├── roll
    ├── branch
    └── year

It's mainly used to represent a value or piece of information.
```

## 🔰 Real-World Examples

### 👤 User

```
data class User(
    val id: Int,
    val name: String,
    val email: String
)
```

### 🍔 Food Order

```
data class FoodOrder(
    val orderId: Int,
    val foodName: String,
    val quantity: Int,
    val price: Double
)
```

## 🔰 One Important Distinction

Don't think: ❌ "A data class is a class that cannot have functions."   
You can have functions inside a data class.
```
data class Student(
    val name: String,
    val marks: Int
) {

    fun isPassed(): Boolean {
        return marks >= 40
    }
}

A data class is a class designed primarily to represent data, 
where Kotlin automatically provides useful methods for handling that data.
```

## 🔰 Why Android Developers Love Them

We will see a lot of these:

```
data class User(...)
data class Product(...)
data class Movie(...)
data class UiState(...)
data class ApiResponse(...)
```

```
Especially when working with:

API
 ↓
Data Class
 ↓
Repository
 ↓
ViewModel
 ↓
UI
```

**🧠 The One Sentence to Remember**   
A data class is a Kotlin class primarily meant to hold data, with Kotlin automatically generating useful data-handling methods for it.

---

# 🚀 DEEP DIVE

We already know:   
Data class = a class primarily used to hold data.   
Now let's understand why Kotlin bothered creating a special type of class for this.   

## 🔰 The problem with normal classes

```
class Student(
    val name: String,
    val roll: Int,
    val branch: String
)
```

We create two students:  
```
val student1 = Student("Rahul", 101, "CSE")
val student2 = Student("Rahul", 101, "CSE")
```

They contain the same data.   
But they're still two separate objects.   


## 🔰 What would we naturally want?

For a data object, we'd usually want:   
A useful toString()  

Instead of: Student@7a81197d   
we'd want: Student(name=Rahul, roll=101, branch=CSE)   
 
We'd like: `student1 == student2`  
to mean: "Do these students contain the same data?"  
rather than simply: "Are these the exact same object?"  


## 🔰 The Old/Manual Way

With a normal class, you'd potentially have to write these yourself:  
```
class Student(
    val name: String,
    val roll: Int,
    val branch: String
) {
    override fun toString(): String {
        // manually create representation
    }
    override fun equals(other: Any?): Boolean {
        // manually compare properties
    }
    override fun hashCode(): Int {
        // manually calculate hash
    }
    fun copy(...): Student {
        // manually copy
    }
}
```

```
Imagine doing this for:

User
Product
Order
Movie
Address
Message
Payment
Student
```
That's a huge amount of repetitive boilerplate code.  

## 🔰 Kotlin's Philosophy

> "If the developer tells us that a class is primarily a data holder, we already know what common operations it needs."

Instead of Traditional `class Student(...)`  
We write `data class Student(...)`  

And Kotlin generates the important data-related behavior for you.   


## 🔰 What does Kotlin Generate?

```
data class Student(
    val name: String,
    val roll: Int,
    val branch: String
)
```

Kotlin automatically provides implementations for:

```
┌─────────────────────┐
│      Student        │
├─────────────────────┤
│ toString()          │
│ equals()            │
│ hashCode()          │
│ copy()              │
│ component1()        │
│ component2()        │
│ component3()        │
└─────────────────────┘
```

You don't write these yourself.   
We'll study each one properly in the upcoming parts.   


## Why this matters in Android 📱

This isn't just a convenience feature.   
Android applications constantly move data between different layers.    

```
        API
         │
         ▼
   UserResponse
   (Data Class)
         │
         ▼
    Repository
         │
         ▼
     ViewModel
         │
         ▼
       UI
```

Imagine your API returns 20 fields.  

You don't want to manually implement:   

- equality
- string representation
- copying
- hashing

for every model.

That's why you'll see data classes everywhere in professional Kotlin code.   


## 📱 Real Android Example

Let's imagine our Android app calls a random API that returns user information.   








❇️📱✅❌⌛⚙️🔥🔰🛡️🔷💭⚜️🔱🚀💻
