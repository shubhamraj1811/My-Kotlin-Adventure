# 🔥 Table of Contents
1. [Function Definition](#function)
2. [Function With Parameter](#function-with-parameter)
3. [Function That Return Value](#function-that-return-value)
4. [Single Expression Function](#single-expression-functions)
5. [Default Parameter Value](#-default-parameter-values)
6. [Named Arguments](#-named-arguments)
7. [Unit Function](#-unit-function)
8. [Function Calling Functions](#-functions-calling-functions)
9. [Vargs](#-vararg--variable-number-of-arguments)
10. [Local Functions](#-local-functions)
11. [Real Android Example](#-real-android--complete-feature-example)
12. [Function Cheatsheet](#-functions-cheatsheet)
13. [Exercise 11](#-exercise-11-functions-in-action)

---

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

**💻 [First Function Code](basicFunction.kt)**

## Why Use Function:
- From the above code example we can clearly see that
- You wrote the logic once.
- You used it three times. 
- In a real app, greetUser() might be called from the login screen, the splash screen, and the onboarding screen — same function, zero duplication.

---

# Function With Parameter

Parameters are inputs you pass into a function:

## Single Parameter
**💻 [Check The Code Here](funWithSingleParam.kt)**

## Multiple Parameters
**💻 [Check The Code Here](funWithMultipleParams.kt)**

---

# Function That Return Value

A function can give back a result using return:

## Real Android Use Case:
Real Android use case — calculate discount

**💻 [Check Code Here](calcDiscount.kt)**

---

# Single Expression Functions

When a function just returns one expression, Kotlin lets you write it in one line: 
Like we had to write a fun to calculate square.  

`fun square(n: Int) = n * n`  

**💻 [Check The Code Here](singleExpressionFun.kt)**

- We'll use single expression functions constantly in Android — ViewModels, repositories, utility classes.
- They're clean, readable, and professional.

---

# 📌 Default Parameter Values

We can give parameters a default value so callers don't always have to provide them

**💻 [Check The Code Here](defaultParams.kt)**

## Real Android use case — show toast/snack bar:

**💻 [Check The Code Here](showSnackbar.kt)**

---

# 🔰 Named Arguments

When calling a function, you can name the arguments — order doesn't matter:

> Senior Engineer Rule:
- When a function has more than 2-3 parameters, always use named arguments when calling it.
- Six months later, createProfile("Shubham", 22, "Mumbai", true) tells you nothing.
- Named arguments are self-documenting code.

**💻 [Check The Code Here](namedArguments.kt)**

---

# 🔰 Unit Function

When a function doesn't return anything, its return type is Unit — you usually just omit it:

**💻 [Check The Code Here](unitFunction.kt)**

- Think of Unit like void in Java.
- In practice, you never write it — Kotlin assumes it when there's no return type.

--- 

# 🔰 Functions Calling Functions

This is where real power comes in — functions working together:

**💻 [Check The Code Here](functionCalling.kt)**

- Each function does one job.
- validateEmail only validates email.
- canLogin only combines the validations.
- showLoginResult only handles the display.
- This is called the Single Responsibility Principle — the foundation of clean code.

---

# 🔰 `vararg` — Variable Number of Arguments
Sometimes you don't know how many arguments will be passed:

**💻 [Check The Code Here](varags.kt)**

---

# 🔰 Local Functions
Functions inside functions — for logic that only belongs in one place:

**💻 [Check The Code Here](localFunction.kt)**

---

# 📱 Real Android — Complete Feature Example

**💻 [Check The Code Here](androidApp.kt)**

---

# 🔰 Functions Cheatsheet

DECLARATION
fun name() { }                        → no params, no return
fun name(x: Int) { }                  → with parameter
fun name(x: Int): String { }          → with return type
fun name(x: Int) = x * 2             → single expression
fun name(x: Int = 0) { }             → default parameter
fun name(vararg items: String) { }   → variable arguments

CALLING
name()                                → basic call
name(42)                              → positional argument
name(x = 42)                          → named argument

PRINCIPLES
One function = One job
Default to named args for 3+ params
Single expression for simple returns
Local functions for private helper logic

---

# 🛠 Exercise 11: Functions in Action

Scenario: You're building a banking app in Android.  

> Task 1 — Basic Function:

Write a function showWelcomeBanner() that prints:

================================  
    Welcome to ShubhamBank 🏦  
================================  


> Task 2 — Function With Parameters: 

Write a function showBalance(accountHolder: String, balance: Double) that prints:
```
Account Holder : Shubham
Current Balance: ₹25000.0
```

> Task 3 — Function With Return Value

Write a function calculateInterest(principal: Double, ratePercent: Double, years: Int): Double that returns simple interest:

`Formula: (principal * rate * years) / 100`    
`Call it and print: "Interest earned: ₹2500.0"`  

> Task 4 — Default Parameters:

Write a function transferMoney with these parameters:
- from: String
- to: String
- amount: Double
- remarks: String = "Transfer"

```
Print: 
Transfer of ₹500.0 from Shubham to Priya
Remarks: Birthday Gift
```

> Task 5 — Functions Calling Functions:

Write these three functions that work together:  

```agsl
fun isValidAmount(amount: Double): Boolean
// returns true if amount > 0 and amount <= 100000

fun isValidAccount(accountNumber: String): Boolean  
// returns true if accountNumber length == 10

fun processWithdrawal(accountNumber: String, amount: Double)
// uses above two functions to validate
// if valid: print "Withdrawal of ₹[amount] successful ✅"
// if invalid: print "Transaction failed ❌ — [reason]"
```

**Test With:**  

```
processWithdrawal("1234567890", 5000.0)    // should succeed
processWithdrawal("12345", 5000.0)          // should fail — invalid account
processWithdrawal("1234567890", -500.0)     // should fail — invalid amount
processWithdrawal("1234567890", 200000.0)   // should fail — exceeds limit
```

**[Check The Code Here](exercise11.kt)**