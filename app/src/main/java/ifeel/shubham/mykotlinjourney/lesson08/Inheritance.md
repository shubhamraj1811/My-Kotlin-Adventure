# 🚀 INHERITANCE

## ❇️ WHY WAS INHERITANCE INVENTED

Imagine you're developing the Ola app.  
You need classes for:
- Bike
- Car
- Mini Cab

If we write them:   
**[💻 Check The Code Here](InheritanceExample.kt)**  
As we can see, we are copying the same code over and over again

Imagine after one year... Ola changes the company name.  
We will have to change all the classes one by one as they have the same:
- Company name
- Start fun()
- end fun()

This is known as code duplication.  
Code duplication causes:
- More bugs
- More maintenance
- More work
- Harder updates

That is why OOP introduced... Inheritance

---

## ❇️ The Idea Behind Inheritance

Every vehicle has:

- Company
- Start Ride
- End Ride

Only a few things are different.  
That is why, Instead of repeating common code, we keep it in one place - `PARENT CLASS`


### 🟦 Parent Class

**[💻 PARENT CLASS CODE](InheritanceParentClass.kt)**

This is the example of a parent class which have these common funs:
- Company Name
- `startRide()`
- `endRide()`

And other class such as bike and car can inherit from it, means no need of extra lines of code duplication.  

### 🟦 open class Vehicle()

- open keyword allows other funcs to inherit from it.
- Because in Kotlin... Classes are final by default.

Java allows inheritance by default. Kotlin doesn't.  
Because unrestricted inheritance can create fragile designs.  
Imagine another developer inherits your class and changes behavior in ways you never expected.  

By making classes final by default,   
Kotlin encourages composition over inheritance unless inheritance is intentionally designed.

```
class Vehicle
❌ Cannot be inherited.

open class Vehicle
✅ Can be inherited.
```

### 🟦 Creating a Child Class

Now Bike Becomes: `class Bike : Vehicle()`  
Similarly: `class Car : Vehicle()`  

Now Bike has inherited features: `startRide()`, `endRide()`  
and also their own specific feature: `wearHelmet()`

---

## ❇️ Real Android Examples

This is where you'll realize inheritance is everywhere.  
An Android Activity:  

```
class MainActivity : AppCompatActivity()
```

- AppCompatActivity is the parent.
- MainActivity is the child.
  
Your activity automatically gets lifecycle methods like: 

- onCreate()
- onStart()
- onResume()

You didn't write those—they come from the parent class.

---

## 💭 Interview Questions

#### Q. What is inheritance?

A mechanism that allows one class (child) to acquire the properties and functions of another class (parent), promoting code reuse and hierarchical relationships.

#### Q. Why are classes final by default in Kotlin?

To prevent accidental inheritance and encourage safer, more intentional designs.

#### Q. What keyword enables inheritance?

`open`

#### Q. How does a child class inherit?

```
class Bike : Vehicle()
```