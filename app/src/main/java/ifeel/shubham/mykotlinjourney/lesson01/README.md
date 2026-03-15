# 🔥 Table of Contents

1. [Kotlin](#what-is-kotlin)
2. [First Program in Kotlin](#first-program-in-kotlin--view-code)
3. [Kotlin Output](#kotlin-output--view-code)
4. [Comments](#comments--view-code)
5. [Kotlin Variables](#kotlin-variables--view-code)
6. [Exercise 01](#-exercise-1-the-onboarding-script)


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

# First Program in Kotlin | [View Code](helloWorld.kt)

## Breaking down the code
- **fun:** It is short for function. This is how we declare any function in kotlin.
- **main:** It is the entry point of this code. The JVM (Java Virtual Machine) looks for this specific name to start executing the code.
- **():** This is where parameters would go. In modern Kotlin (1.3+), you don't even need to include args: Array<String> unless you are specifically using command-line arguments.
- **println:** Short for "print line." It prints the text and then moves the cursor to a new line. Notice there is no semicolon (;) at the end! They are optional in Kotlin, and the community style is to leave them out.

---

# Kotlin OutPut | [View Code](print.kt)
In Kotlin, the output is primarily handled by two functions.
1. `print()` 
   Prints the message and keeps the cursor on the same line.
2. `println()`
   Prints the message and then moves the cursor to a new line.

---

# Comments | [View Code](comments.kt)
Comments are used to give the context of the code without the compiler actually reading it.
In Kotlin, there are two types of comments:

1. Single Line Comments
   Used for quick notes or explaining a single line of code. Anything after **//** is ignored by the compiler.

2. Multi Line Comments
   Used for longer explanations or temporarily "hiding" a chunk of code during debugging. It starts with /* and ends with */.

---

# Kotlin Variables | [View Code](ValVar.kt)
Variables are containers for storing data values.
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

# 🛠 Exercise 1: The Onboarding Script
Scenario: You're building the profile screen of an Android app.
Write Kotlin variables to store the following information for a user profile.  
Think carefully — which ones should be val and which should be var? Then use a String template to print a summary.

1. The user's full name (Priya Sharma)
2. Their username (priya_dev)
3. Their age (22)
4. Their follower count (starts at 0, will grow)
5. Whether their account is verified (not verified yet)
6. Their bio ("Android developer from Mumbai")