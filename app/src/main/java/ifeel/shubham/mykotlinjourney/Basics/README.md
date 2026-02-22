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

