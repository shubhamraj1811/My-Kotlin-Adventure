# 🚀 GETTERS AND SETTERS

Many beginners think getters and setters are functions. Technically yes...  
But why they exist is far more important than how to write them.  



## 🟩 Step 1: The Problem

Let's go back to our Ola example.

```
class Driver(
    var name: String,
    var rating: Double
)
```

Now in main():

```
val driver = Driver("Rahul", 4.8)
driver.rating = 10.0
```
No error.  

Now imagine:
```
driver.rating = -50.0
driver.rating = 1000.0
```

💭 They still pass without any error.  

A driver's rating should only be between 0 and 5.

> The problem is: We gave everyone direct access to modify rating.

---

**💭 Lets try to solve it.**

## 🟦 First Solution - Use Private

```
class Driver(
    val name: String
) {

    private var rating = 4.8
}
```

- Now nobody can change it...
- But nobody can even read it.
- That's also a problem.
- We want driver rating to be visible but we want to restrict what type of input goes there
- That's where getters and setters come in.


## ❇️ What is a Getter?

- A getter is a function that returns the value of a property.
- Imagine your bank account.
- You can check your balance.
- You cannot directly open the database.

🌐 you ask: "What's my balance?"  
The bank returns it.  

That's exactly what a getter does.


## ❇️ What is a Setter?

A setter controls how a property's value changes.  
 
Instead of letting anyone write: `balance = -1000`   

the setter checks:

- Is this value valid?
- Should I allow this update?

Only then does it store the value.


## ❇️ Default Getter and Setter

```
class Driver(
    var rating: Double = 4.8
)
```

- You didn't write any getter or setter.
- But Kotlin secretly generates them.

Conceptually, it's as if Kotlin wrote:

```
fun getRating(): Double {
    return rating
}

fun setRating(value: Double) {
    rating = value
}
```

- You never see these functions
- but they exist behind the scenes.


### 🌐 Behind the Scenes

When you write: `println(driver.rating)`   
You're actually calling: `driver.getRating()`   

When you write: `driver.rating = 4.9`   
You're actually calling: `driver.setRating(4.9)`   

- Kotlin hides this from us.
- That's why property syntax feels clean.


## ❇️ Custom Getter

Sometimes you don't want to return the stored value directly.  

```
class Driver {
    var rating = 4.8
        get() {
            println("Reading rating...")
            return field
        }
}

// inside main

println(driver.rating)
```

#### 🔷 Output

```
Reading rating...
4.8
```


## ❇️ Custom Setter

Suppose ratings must stay between 0 and 5.

```
class Driver {
    var rating = 4.8
        set(value) {
            if (value in 0.0..5.0) {
                field = value
            }
        }
}

// Inside main
driver.rating = 4.9 ✅
driver.rating = 100.0 ❌
```

The setter protects the object.  



## 💻 CODE EXAMPLE

🔶 Ola Driver Example With Setters - [View Code](SetterOlaExample.kt)  
🔶 Ola Driver Example With Getters - [View Code](GettersOlaExample.kt)  

### 🔷 Read Only Property

```
class Driver {
    var rating = 4.8
        private set
}

// Anyone can read
println(driver.rating)

// But nobody outside the class can do
driver.rating = 5.0
```

- Only the class itself can update it.
- This is much cleaner than making the whole property private.


---

## ❇️ Best Practices

Most Kotlin developers follow these guidelines:

- Don't write getters or setters unless you need custom behavior. The default ones are already generated.
- Use a custom setter to validate or sanitize data.
- Use a custom getter when the returned value should be computed or formatted.
- Use private set when other classes should be able to read a property but not modify it.


## 💻 Interview Questions


#### 🟥 What is the difference between a getter and a setter?
- Getter returns the value of a property.
- Setter updates the value of a property.

#### 🟥 Does Kotlin generate getters and setters automatically?

Yes.
- val → only a getter.
- var → both a getter and a setter.


#### 🟥 What is field in Kotlin?

field is the backing field—the actual storage for the property's value. It's available only inside that property's getter and setter.

