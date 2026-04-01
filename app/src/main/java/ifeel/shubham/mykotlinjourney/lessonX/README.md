# Keywords
## Hard key word soft keyword and so on

# packages and import
# annotation
# visibility modifeiers

# coding convention
# idioms


# The Billion Dollar Mistake
In 1965, Tony Hoare invented the null reference.
Decades later, he called it his "billion-dollar mistake" because it has caused more app crashes (NullPointerExceptions, or NPEs) than almost any other bug in software history.

In Java or Python, if you try to get the length of a string that is actually null, your entire program crashes.
Kotlin's approach is radically different: Null safety is built into the type system.

## The Concept - Null Safety
- By default, standard types in Kotlin cannot hold a null value.
- If you try to assign null to a standard String, the compiler throws an error and refuses to build the app.
- You can't crash in production if you can't even compile!
- 