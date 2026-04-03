# 🔥 Table of Contents

1. [Introduction to Conditionals](#introduction-to-conditionals)
2. [The Basic Structure of Conditionals](#the-basic-structure---ifelse-ifelse)
3. [When Expression](#when-expression)

# Introduction to Conditionals
- In older languages like Java or C++, conditionals are just "statements" (they do an action).
- In Kotlin, we treat conditionals as expressions (they calculate and return a value).
- This subtle shift changes how we architect code, making it incredibly concise.  
- Conditionals let our code choose a path based on a condition. This is where our app starts to feel alive.

# The Basic Structure - `if`/`else if`/`else`
We already know the basic structure of if/else.
**[Check The Code Here](basicStructure.kt)**

## Returns a Value
- Kotlin does not have ternary operator
- In Kotlin, `if` is an expression that returns a value
- We can assign if block directly to a variable
- **[Check The Code Here](returnValue.kt)**
- We can also check the type of variable using if/else and when
- **[Check The Code Here](checkDatatype.kt)**

# When Expression
- In C++/Java we can use `switch` statements to check a variable against multiple values.
- But switch is clunky and prone to bugs.
- Kotlin threw out switch and Introduced `When`.
- It can check exact values, ranges, and even data types, all in one block.
- **[Check The Code Here](whenExpression.kt)**