# #️⃣ CHEATSHEET 01

```
DEFINING A CLASS
class ClassName {
    var property = value          → class property
    fun method() { }              → class method
}

CREATING AN OBJECT (INSTANCE)
val obj = ClassName()             → creates one instance

ACCESSING MEMBERS
obj.property                      → read property
obj.property = newValue           → write (if var)
obj.method()                      → call method

THE 'this' KEYWORD
this.property                     → current object's property
this.method()                     → current object's method
                                   (needed when names conflict)

KEY CONCEPTS
Class     → blueprint / recipe
Object    → instance built from blueprint
Instance  → one specific object
           (dog1 and dog2 are two instances of Dog)

Each object has its own COPY of properties
Methods operate on the object they're called on
```

---

# #️⃣ CHEATSHEET 2

```
PRIMARY CONSTRUCTOR
class Person(val name: String, var age: Int)
→ params become properties automatically with val/var
→ clean, idiomatic, always prefer this

DEFAULT VALUES
class Person(val name: String, val age: Int = 0)
→ makes params optional
→ replace most secondary constructors

INIT BLOCK
init {
    // runs immediately when object is created
    // can validate, compute derived values, log
}

SECONDARY CONSTRUCTOR
constructor(x: Type) : this(x, default, default)
→ must call primary constructor via this(...)
→ use only when default params aren't enough

EXECUTION ORDER
1. Primary constructor params set
2. init blocks run (top to bottom)
3. Object is ready to use
4. Methods run only when called

NAMED ARGUMENTS (always use for 3+ params)
val p = Person(name = "Shubham", age = 22)
```
