# 🔥 Table of Contents

1. [Kotlin](#what-is-kotlin)
2. [First Program in Kotlin](#first-program-in-kotlin)
3. [Kotlin Output](#kotlin-output)
4. [Taking Input - readln()](#taking-input---readln)
5. [Comments](#comments)
6. [Kotlin Variables](#kotlin-variables)
7. [Exercise 01](#-exercise-1-the-onboarding-script)

---

# What is KOTLIN?
Kotlin is a modern, trending programming language that was released in 2016 by JetBrains.
It has become very popular since it is compatible with Java (one of the most popular programming languages out there), which means that Java code (and libraries) can be used in Kotlin programs.
One of Kotlin's biggest selling points is Null Safety. It’s designed to eliminate the "NullPointerException"—a common bug that crashes Java apps constantly.

## **Kotlin is used for:**
- Mobile applications (specially Android apps)
- Web development
- Server side applications
- Data science
- And much, much more!

## Why we use Kotlin?
- Kotlin is fully compactible with Java.
- Kotlin works on different platforms (Windows, Mac, Linux, Raspberry Pi, etc.).
- Kotlin is concise and safe.
- Kotlin is easy to learn.
- It is free to use.
- Kotlin has big community support.

---

# First Program in Kotlin
First Program in Kotlin - Print Hello World : [View Code](helloWorld.kt)
## Breaking down the code
- **fun:** It is short for function. This is how we declare any function in kotlin.
- **main:** It is the entry point of this code. The JVM (Java Virtual Machine) looks for this specific name to start executing the code.
- **():** This is where parameters would go. In modern Kotlin (1.3+), you don't even need to include args: Array<String> unless you are specifically using command-line arguments.
- **println:** Short for "print line." It prints the text and then moves the cursor to a new line. Notice there is no semicolon (;) at the end! They are optional in Kotlin, and the community style is to leave them out.

---

# Kotlin Output
In Kotlin, the output is primarily handled by two functions.
1. `print()` 
   Prints the message and keeps the cursor on the same line.
2. `println()`
   Prints the message and then moves the cursor to a new line.
3. Example :- [View Code](print.kt)

---

# Taking Input - readln()
The readln() function reads from the standard input. This function reads the entire line the user enters as a string.  
For example, if a user types "50" the computer doesn't know "50". it reads it as a string "5", "0".  
We can use the println(), readln(), and print() functions together to print messages requesting and showing user input:- [View Code](read.kt)

[Note:- We also have readlnOrNull(), which we use if there's a chance the input stream gets abruptly closed, returning null instead of crashing. ]  

## Reading Numbers the Junior Way [💀 Dangerous]
- If we need an integer, we just use .toInt()
- **⚠️ Why it fails:** If user types five (not 5) - app crashes with NumberFormatException.

## Safe Conversion
- Safe Conversion is Null Safety (discussed ahead in detail)
- We use kotlin's built-in safe conversion methods.
- .toIntOrNull() , .toDoubleOrNull().
- If something fails instead of crashing, these methods return `null`
- Combined with the Elvis Operator [?:] , provides a safe fallback!
- Code Example: [View Code](theJuniorMethod.kt)


### Points:-
- readln() default is string, it always returns `String` as default.
- To work with other datatypes we can convert the input using conversion functions like .toInt(), .toLong(), .toDouble(), .toFloat(), or .toBoolean().
- It is possible to read multiple inputs of different data types and store each input in a variable:

# Comments
Comments are used to give the context of the code without the compiler actually reading it.  
**Code :** [View Code](comments.kt)

In Kotlin, there are two types of comments:
1. Single Line Comments
   Used for quick notes or explaining a single line of code. Anything after **//** is ignored by the compiler.

2. Multi Line Comments
   Used for longer explanations or temporarily "hiding" a chunk of code during debugging. It starts with /* and ends with */.  

---

# Kotlin Variables
Variables are containers for storing data values.  
**Code:** [View Code](ValVar.kt)  
In Kotlin, to create a variable, we use **var** or **val**, and assign a value to it with the equal sign (=):

1. **val (value)**
- Read only
- Immutable
- Once assigned, it cannot be changed.

2. **var (Variable)**
- Read and Write
- Mutable
- Its value can be changed even after value is assigned

## Real World Example:
- In real android apps, most bugs come from data being changed somewhere it shouldn't.
- Therefore, senior developers default to val everywhere, this is called immutability by default.
- They only use var where data is really changing.
- This is one of kotlin's superpower.

---

# 🛠 Exercise 001: The Onboarding Script
Scenario: You're building the profile screen of an Android app.
Write Kotlin variables to store the following information for a user profile.  
Think carefully — which ones should be val and which should be var? Then use a String template to print a summary.

1. The user's full name (Priya Sharma)
2. Their username (priya_dev)
3. Their age (22)
4. Their follower count (starts at 0, will grow)
5. Whether their account is verified (not verified yet)
6. Their bio ("Android developer from Mumbai")

---  

# 🛠 Exercise 002: The Merchant's Shop🛠 Exercise 6: The Merchant's Shop
[Practice for readln()]

Let's build a small interaction for your RPG. The hero has walked into a potion shop.
I want you to write a main function that does the following:
1. Ask the user what item they want to buy (Read as a String).
2. Ask the user how many they want to buy (Read as an Int). Use safe conversion. If they type garbage, default the quantity to 1.
3. Ask the user how much they are willing to pay per item (Read as a Double). Use safe conversion. If they type garbage, default the price to 0.0.
4. Print out a summary of their order, calculating the totalCost (quantity * price).
5. Write the code for this shop interaction below, ensuring it won't crash no matter what the user types!
