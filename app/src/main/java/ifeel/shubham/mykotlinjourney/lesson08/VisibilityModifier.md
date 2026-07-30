# #️⃣ VISIBILITY MODIFIERS

A visibility modifier controls who is allowed to access a class, property, or function.  
Think of it as an access control system.

Instead of asking:  
"Does this property exist?"

we ask:  
"Who is allowed to use it?"

**[EXAMPLE - VISIBILITY MODIFIER](visibilityModifiers.kt)**

## ❇️ FOUR TYPES OF VISIBILITY MODIFIERS

```
╔══════════════════════════════════════════════════════════════╗
║  MODIFIER   ║   WHO CAN ACCESS IT                            ║
╠══════════════════════════════════════════════════════════════╣
║  public     ║   Everyone — default in Kotlin                 ║
║  private    ║   Only THIS class/file                         ║
║  protected  ║   This class + subclasses (inheritance)        ║
║  internal   ║   Anywhere in THIS MODULE/project              ║
╚══════════════════════════════════════════════════════════════╝
```

## ❇️ PUBLIC (DEFAULT)

In Kotlin, everything is public by default. Unlike Java where package-private is the default, Kotlin chose the more open default deliberately — but gives you tools to restrict when needed.

## ❇️ PRIVATE

`private` means only the class itself can access it.  
**[PRIVATE EXAMPLE](examplePrivate.kt)**

- Why hide encrypt()?
- Because it's an implementation detail.
- The outside world doesn't need to know HOW you encrypt — just THAT verification works.
- If you later switch to SHA-256 encryption, nothing outside the class needs to change.

## ❇️ PRIVATE ON CONSTRUCTOR

You can make the constructor itself private — preventing object creation from outside  
**[EXAMPLE - PRIVATE ON CONSTRUCTOR](privateOnConstructor.kt)**

## ❇️ PROTECTED

`protected` means this class AND its subclasses — nobody else
[EXAMPLE - PROTECTED](exampleProtected.kt)

## ❇️ INTERNAL

`internal` means anywhere inside the same module

```
internal class PaymentProcessor {
    internal fun processPayment(amount: Double) {
        println("Processing ₹$amount")
    }
}
```

**Revision:**
```
PUBLIC    → anyone, anywhere, even other projects
INTERNAL  → anyone inside THIS project
PRIVATE   → only this class
PROTECTED → this class + subclasses
```

**For Android development:**
- internal is useful in multi-module projects (common in large apps like Zomato, Swiggy).
- For now, as a beginner, you'll primarily use public and private.
- internal becomes important when you start building proper multi-module Android architecture.

