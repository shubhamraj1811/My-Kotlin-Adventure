# Print Hello World

`fun main() {
println("Hello World")
}`

## Breaking it Down
* fun: This is the keyword used to declare a function.
* main: This is the name of the function. Entry Point.
* (): This is where parameters would go if we had any.
* { ... }: These curly braces house the "body" of the code—the instructions you want the computer to follow.
* println: Short for "print line." It prints the text inside the quotes to the console and then adds a new line at the end.

# Print vs Println
* Print() fun prints the string but the cursor stays on the same line.
* Println() fun prints the string but the cursor moves on the second line.

# Comments

## Single Line Comments
The most common type. Use these for brief explanations or to temporarily disable a line of code. Anything after the // on that line is ignored.

## Multi Line Comments
Use these for longer descriptions. They start with /* and end with */.

---

# Variables in Kotlin
In Kotlin, the distinction between val and var is all about mutability—specifically, whether a variable's value can change after it’s been assigned.
Kotlin encourages using val by default because it makes the code more predictable and easier to debug.

## Val
When declare a variable with val, it is read-only. Once assign a value to it, we cannot change it. Think of it like a constant, though it can technically be calculated at runtime.
### Why Use it ?
Why use it? It prevents accidental bugs where a value is changed unexpectedly later in our program.

## Var
A var is a standard variable that can be changed as many times as you need.
### Why use it?
Use this for data that legitimately needs to change, like counters, user input, or the state of a game.

---

# Kotlin Data Types

## 1. Numbers
Kotlin is strict about numbers. We cannot just drop a long into an int without conversion.

### Types:-
1. **Int**: The goto for whole numbers. (-2^31 to 2^31 - 1 // 32-bit).
2. **Long**: For massive numbers. Use L suffix. (64-bit)
3. **Double**: Default for Decimals. High Precision. (64-bit)
4. **Float**: For decimals, Lower Precision. Use F or f suffix. (32-bit)

## 2. Boolean
Simple and straightforward. Only two possible values: true or false.

## 3. Character
The Char data type is used to store a single character. A char value must be surrounded by single quotes, like 'A' or 'c'.

## 4. Strings
The String data type is used to store a sequence of characters (text). String values must be surrounded by double quotes.

## Type Inference
Type Inference
One of Kotlin's best "quality of life" features is that we rarely have to write the type. If we assign a value, Kotlin figures it out for us.
`val score = 95       // Kotlin knows this is an Int`

## Type Conversion
If we want to move a value from one type to another, we must be explicit.
We can't just say `val x: Long = age`.
We have to call a helper function:
`val age: Int = 25
val longAge: Long = age.toLong() // Explicit conversion`

---

# Late Declaration

1. val late declare
   `val score: Int
   val input = 20
   score = 100 * input
   println("Score is: $score")`

Requirement: Must be a var (mutable).
Requirement: Cannot be a primitive type (like Int, Boolean, or Double). It must be a non-null object type (like String or a custom class).

2. Local Variables (lateinit)
If you are inside a function or a class,
you can use the lateinit keyword.
This tells the compiler, "I promise I'll give this a value before I use it."
      
`lateinit var name: String
// Later in your code
name = "Gemini"`

3. Nullable Types
   If you need to declare a variable that might stay empty for a while,
   or if you're using a primitive type, you can make it nullable by adding a ? after the type and initializing it to null.

`var age: Int? = null
// Later in your code
age = 25`

4. Property Delegation (by lazy)
   If you want a variable that is assigned "later" but only when it's actually used, you can use lazy. Note that this creates a val (read-only), so it’s perfect for heavy objects that you don't want to create until they are needed.
   `val heavyData: String by lazy {
   "This value is only created when you first touch heavyData"
   }`

---

# Operators in Kotlin
Operators are the symbols that tell the compiler to perform specific mathematical, relational, or logical manipulations.
Kotlin's operators are actually "syntactic sugar"—meaning when you use +, Kotlin is calling a function named plus() under the hood.

1. Airthmatic Operator

| Operator | Name           | Example | Function   |
|----------|----------------|---------|------------|
| +        | Addition       | a + b   | a.plus(b)  |
| -        | Subtraction    | a - b   | a.minus(b) |
| *        | Multiplication | a * b   | a.times(b) |
| /        | Division       | a / b   | a.div(b)   |
| %        | Modulus        | a % b   | a.rem(b)   |

2. Comparison and Equality Operator
3. Logical Operator
4. Assignment Operator
5. Increment and Decrement Operator