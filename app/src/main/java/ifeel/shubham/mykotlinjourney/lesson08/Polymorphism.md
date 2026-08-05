# 🚀 POLYMORPHISM

## ❇️ What is Polymorphism?

Poly = Many   
Morph = Forms

One interface, many implementations.  
Treat different objects in the same way, while each object behaves in its own way.  

`val vehicle: Vehicle = Bike()`   

We're storing a Bike...  inside a Vehicle variable.    
Why?   
Because Bike IS-A Vehicle.   

Inheritance makes this legal.   

This is called Upcasting.   


### 🛡️ Why is this Useful?

Suppose:  
`val vehicle: Vehicle = Bike()`   

Now call:
`vehicle.startRide()`   

Which function runs?   

Vehicle? or Bike?   
Answer: Bike Ride Started   
Even though the variable type is Vehicle.   


## 🛡️ Visualization

```
Variable

vehicle
    │
    ▼
Vehicle Reference
    │
    ▼
Bike Object
```

- The reference type is Vehicle.   
- The actual object is Bike.
- The object decides the behavior.
- Not the variable.
- This is one of the biggest ideas in OOP.


## 📱 Real Android Example

This is happening all over Android.  
`class MainActivity : AppCompatActivity()`    

Android stores your activity internally as an Activity.   
But when it calls   
`onCreate()`

it actually executes MainActivity's overridden version.   

The framework doesn't need to know whether it's MainActivity, LoginActivity, or SettingsActivity.    

It simply works with an Activity reference and lets polymorphism call the correct implementation.    

Another example is a RecyclerView.Adapter. The framework calls methods like onBindViewHolder(), and your adapter's overridden implementation runs.    


## ❇️ What is Upcasting?
`val vehicle: Vehicle = Bike()`   

Storing a child object in a parent reference.


## 🌐 Runtime vs Compile-time Polymorphism

Runtime Polymorphism (what we studied today):

- Achieved using inheritance + method overriding.
- The method to execute is chosen at runtime.

Compile-time Polymorphism:

- Achieved through method overloading.
- The compiler decides which method to call based on the arguments.

Kotlin supports both, but runtime polymorphism is the classic OOP concept.


## 🔥 Learning Map

- Inheritance lets a child inherit behavior.
- Method Overriding-  lets the child customize inherited behavior.
- Polymorphism lets you treat all those children as the same parent type while still getting each child's customized behavior.

That's why these three topics are always taught together—they're different pieces of the same idea.

