package ifeel.shubham.mykotlinjourney.lesson08

// These two are IDENTICAL:

// Version 1 — separate declaration + constructor
// We don't need to do this in Kotlin
// This is kotlin's superpower
class Person1 {
   val name: String
   val age: Int
   constructor(name: String, age: Int) {
      this.name = name
      this.age = age
   }
}

// Version 2 — Primary constructor (Kotlin way) ✅
class Person2 (val name: String, val age: Int)