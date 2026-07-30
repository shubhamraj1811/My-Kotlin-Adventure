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
