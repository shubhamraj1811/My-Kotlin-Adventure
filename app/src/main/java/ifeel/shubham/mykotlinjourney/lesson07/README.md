# 🔥 Table of Contents
1. [Arrays](#arrays)
2. [Lists](#lists)
3. [Sets](#sets)
4. [Maps](#maps)

---
# Collections in Kotlin

--- 

# Arrays
- Array have fixed size
- They are mutable ( we can add or remove values )
- In modern Kotlin (and Android), you'll almost never use Array directly. 
- It exists mainly for Java interoperability and performance-critical code. List is what you'll use 99% of the time.
- [Check the Code Here](arrays.kt)

---
# Lists

## Immutable List — `listOf`
- `listOf` creates a read-only view.
- It is immutable - can not change values
- Once created, we cannot add, remove, or change items.
- This is the default — just like val, prefer immutability unless you need to change things.
- [Check The Code Here](listof_Immutable.kt)

## Mutable List — mutableListOf
- lists but mutable - can modify an element , add or remove
- [Check The Code Here](listof_Immutable.kt)

---
# Sets

## Immutable Sets
- A set is a collection of unique elements.
- No duplicates are allowed
- Sets in Kotlin are immutable by default.
- To declare a set in kotlin we use - `setOf`
- [Check The Code Here](sets.kt)

# Mutable Sets - `mutableSetOf`
- These are mutable.
- We can add or remove elements.
- [Check The Code Here](mutableSets.kt)

---
# Maps

## Maps — Key-Value Pairs
- A map is a collection of key-value pairs.
- This is one of the most-used collections in real apps.
- These maps are immutable by default.
- `to` - used to create Pair
- key `to` value
- [Check The Code Here](maps.kt)

## Null Safety in Maps

This is why null safety matters everywhere. Maps are a perfect real-world reason ?. and ?: exist — looking up a key that might not be there is one of the most common operations in any app.

[Check The Code Here](nullSafetyInMaps.kt)]

## Mutable Map
- Create a mutable map with mutableMapOf()
- In mutable maps
- used to add or remove elements.
- [Check The Code Here](mutablemaps.kt)

## Looping Over a Map
- [Check The Code Here](loopingOverMap.kt)

---
# Choosing the Right Collection

```
╔════════════════════════════════════════════════════════════╗
║  SCENARIO                          → COLLECTION TO USE     ║
╠════════════════════════════════════════════════════════════╣
║  Ordered items, duplicates OK      → List                  ║
║  (cart items, chat messages,                                ║
║   product catalogue)                                        ║
║                                                              ║
║  Unique items only, order          → Set                   ║
║  doesn't matter (tags, unique                               ║
║   IDs, visited screens)                                      ║
║                                                              ║
║  Lookup by key (user settings,     → Map                   ║
║   API response data, dictionaries)                          ║
║                                                              ║
║  Need to add/remove items          → mutable version       ║
║  Data won't change after creation  → immutable version     ║
╚════════════════════════════════════════════════════════════╝
```

---
# Collections Cheat Sheet

```
LISTS
listOf(1, 2, 3)              → immutable, ordered, duplicates OK
mutableListOf(1, 2, 3)       → mutable version
list[0]                       → access by index
list.add(x) / .remove(x)      → mutable only

SETS
setOf(1, 2, 2, 3)             → {1, 2, 3} — duplicates removed
mutableSetOf<T>()             → mutable version
set.add(x)                    → ignored if exists

MAPS
mapOf("k" to "v")              → immutable key-value pairs
mutableMapOf<K, V>()           → mutable version
map["key"]                     → returns V? (nullable!)
map["key"] ?: "default"        → safe access
map.keys / map.values           → get all keys / values

LOOPING
for (item in list) { }
for ((k, v) in map) { }
list.forEach { }
map.forEach { (k, v) -> }
```