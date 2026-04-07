# 🔥 Table of Contents
1. [Function Definition](#function)
2. [Function With Parameter](#function-with-parameter)

# Function
- A function is a self-contained block of code designed to do exactly one thing.
- If our function is calculating health, saving to a database, and playing a sound effect all at the same time, it’s badly designed.
- We call this the Single Responsibility Principle.
- Functions let you break code into named, reusable blocks.
- Each function does one thing and does it well.
- This is the single most important principle in professional software development.

`One function = One job`

## Function in Kotlin Example:

// fun [name]([parameterName]: [Type]): [ReturnType] { ... code ... }  

fun formatChatTimestamp(timestamp: Long): String {  
    // Logic to convert the raw number into a readable date   
    val formattedDate = "Today at 10:42 AM"  
    return formattedDate  
}  

**[First Function Code](basicFunction.kt)**

## Why Use Function:
- From the above code example we can clearly see that
- You wrote the logic once.
- You used it three times. 
- In a real app, greetUser() might be called from the login screen, the splash screen, and the onboarding screen — same function, zero duplication.

# Function With Parameter
Parameters are inputs you pass into a function:

## Single Parameter
[Check The Code Here](funWithSingleParam.kt)

## Multiple Parameters
[Check The Code Here](funWithMultipleParams.kt)

---

# Function That Return Value
A function can give back a result using return:

## Real Android Use Case:
Real Android use case — calculate discount
[Check Code Here](calcDiscount.kt)

---

# Single Expression Functions
When a function just returns one expression, Kotlin lets you write it in one line: 
Like we had to write a fun to calculate square.  
fun square(n: Int) = n * n  
**[Check The Code Here](singleExpressionFun.kt)**