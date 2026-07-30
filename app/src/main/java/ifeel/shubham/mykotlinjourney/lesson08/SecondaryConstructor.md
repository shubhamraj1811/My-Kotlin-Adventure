# #️⃣ SECONDARY CONSTRUCTOR

A secondary constructor is an alternative way to create an object — useful when we want to support multiple creation patterns:  
**[CHECK THE CODE HERE](secondaryConstructor.kt)**

> this(...) in secondary constructor means "call the primary constructor with these values." Every secondary constructor must eventually call the primary constructor — directly or through another secondary constructor.

---

# #️⃣ Primary vs Secondary — When to Use Which?

```
╔══════════════════════════════════════════════════════════════╗
║  USE PRIMARY CONSTRUCTOR WHEN:                               ║
║  → Most creation scenarios use the same params               ║
║  → You can use default values to cover variations            ║
║  → Simpler, cleaner — prefer this always                     ║
║                                                              ║
║  USE SECONDARY CONSTRUCTOR WHEN:                             ║
║  → Different creation scenarios need completely              ║
║    different input types (e.g. String vs Map)                ║
║  → You're integrating with Java code                         ║
║  → Framework requires it (some Android classes)              ║
╚══════════════════════════════════════════════════════════════╝
```