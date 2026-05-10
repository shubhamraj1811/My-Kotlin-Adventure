# 📝 Assessment Test — Phase 1 Checkpoint

## Rules

```
╔══════════════════════════════════════════════════════════════╗
║  ASSESSMENT RULES                                            ║
║  ──────────────────────────────────────────────────────────  ║
║  ✅ Attempt ALL 6 problems                                   ║
║  ✅ Each problem in its own file/package                     ║
║  ✅ No googling solutions — syntax help is okay              ║
║  ✅ Write clean, readable code                               ║
║  ✅ Use the RIGHT tool for each situation                    ║
║  ❌ No skipping tasks within a problem                       ║
║  ❌ No placeholder text like [amount] or [reason]            ║
╚══════════════════════════════════════════════════════════════╝
```

## Topics being tested:
```
Variables & val/var    Null Safety ?.  ?:  ?.let
Data Types             Control Flow if/when
Loops                  Functions
Operators & Symbols    String Templates
```

---

# Problem 1 — OTP Login System 🔐
Build a login OTP verification system like PhonePe or Paytm.  
**Requirements:**
```
- User has a phone number (may or may not be registered)
- System generates a 4-digit OTP
- User gets 3 attempts to enter correct OTP
- After 3 wrong attempts → account locked
- Track whether user is verified after success
```

**Registered numbers: "9876543210", "8765432109", "7654321098"**

**Program must handle:**
1. Phone number "9876543210" — registered, correct OTP entered on attempt 2
2. Phone number "1111111111" — not registered
3. Phone number "8765432109" — registered, wrong OTP all 3 times

## Expected Output style:
```
--- Login Attempt: 9876543210 ---
✅ Number registered
Attempt 1: Wrong OTP
Attempt 2: Correct OTP ✅
User verified successfully!

--- Login Attempt: 1111111111 ---
❌ Number not registered. Please sign up.

--- Login Attempt: 8765432109 ---
✅ Number registered
Attempt 1: Wrong OTP
Attempt 2: Wrong OTP
Attempt 3: Wrong OTP
🔒 Account locked after 3 failed attempts
```

---

> **[Check The Code Here](otpLoginSystem.kt)**

---

## 🤖 Code Review By ClaudeCode 🔐
---
### First Reaction
Solid structure. You broke it into three focused functions — that's exactly the right instinct.  
Let me go deep.

---

### What You Nailed ✅
Function decomposition — excellent
```agsl
checkRegisteredNumber()   // one job — check registration
otpVerification()         // one job — handle OTP flow
userVerification()        // one job — confirm success
```
Most beginners dump everything in main(). You didn't. ✅  

Loop + break + return logic — correct  
```
if (generatedOtp == otp) {
    println("Attempt $attempt: Correct OTP ✅")
    break                    // exits loop on success
}
if (attempt == 3) {
    println("🔒 Account locked...")
    return                   // exits function on failure
}
```

break on success, return on lockout — both used perfectly. ✅
index + 1 for human-readable attempt number — you remembered! ✅

---

### Issues To Fix ⚠️

> Issue 1 — Naming Convention 🔴

```
// ❌ Your code — capital P breaks camelCase rule
fun checkRegisteredNumber(PhoneNum: String)

// ✅ Correct
fun checkRegisteredNumber(phoneNum: String)
```

- This was flagged in Exercise 1 (IsVerified). Same pattern. 
- Parameters follow camelCase — always lowercase first letter.

> Issue 2 — Redundant when branches

```
// ❌ Your code — three cases doing identical things
when(PhoneNum) {
    "9876543210" -> { println("✅ Number registered"); flag = true }
    "8765432109" -> { println("✅ Number registered"); flag = true }
    "7654321098" -> { println("✅ Number registered"); flag = true }
    else -> println("❌ Not registered")
}

// ✅ Kotlin allows multiple values per branch
when(phoneNum) {
    "9876543210", "8765432109", "7654321098" -> {
        println("✅ Number registered")
        flag = true
    }
    else -> println("❌ Number not registered. Please sign up.")
}
```

> Issue 3 — Verbose flag pattern

```
// ❌ Your code — var + flag + reassign = Java style
var flag: Boolean = false
// ... later
flag = true
// ... later
return flag

// ✅ Kotlin way — return directly from when expression
fun checkRegisteredNumber(phoneNum: String): Boolean {
    val isRegistered = phoneNum in listOf("9876543210", "8765432109", "7654321098")

    if (isRegistered) println("✅ Number registered")
    else println("❌ Number not registered. Please sign up.")

    return isRegistered
}
```

- In Kotlin, var flag = false then flag = true is a red flag. 
- When you catch yourself doing this, ask — can I return directly instead?

> Issue 4 — userVerification() is too thin

```
// ❌ Your code — a whole function for one println
fun userVerification() {
    println("User verified successfully!")
}

// ✅ Either inline it directly
println("User verified successfully!")

// OR make the function actually DO something meaningful
fun userVerification(phoneNum: String) {
    println("User verified successfully!")
    println("Welcome back! Logging in as $phoneNum")
    // in real app: start session, save token, navigate to home
}
```

> Issue 5 — Extra output not in spec

```
// ❌ Your code prints this after every wrong attempt
println("Please Try Again.")

// ✅ Not in the expected output — remove it
// Only print what the spec asks for
```

- In real development, output format matters. 
- APIs return exact structures. UI shows exact text. Spec is spec.

> Issue 6 — userVerification() called regardless of how loop ended

- Actually — your logic is correct here, but for the wrong reason.
- Let me show why it works and the subtle risk:

```
// Your loop structure:
for(...) {
    if (correct) { break }         // breaks → reaches userVerification() ✅
    if (attempt == 3) { return }   // returns → never reaches userVerification() ✅
}
userVerification()   // only reached after successful break
```

- This works. But it's fragile — if someone adds a 4th OTP attempt later, the logic breaks. 
- More robust approach:
```
// ✅ Explicit success tracking — clearer intent
var isVerified = false
for ((index, otp) in attempts.withIndex()) {
    if (generatedOtp == otp) {
        isVerified = true
        break
    }
}

if (isVerified) println("User verified successfully!")
else println("🔒 Account locked after 3 failed attempts")
```

---

## 📊 Problem 1 Score: 16/20

| Area                          | Score    |
|-------------------------------|----------|
| Function Decomposition        | 5/5 ✅    |
| Loop + break + return logic   | 4/4 ✅    |
| Null safety usage             | 2/2 ✅    |
| Naming conventions            | 1/3 ⚠️   |
| Kotlin idioms (when, flag)    | 2/4 ⚠️   |
| Output matches spec           | 2/2 ✅    |

---

# Problem 2 — Food Delivery Cart 🛒

Build the cart system for a Swiggy/Zomato-like app.

**Starting data:**
```
data class CartItem(
    val name: String,
    val price: Int,
    val quantity: Int,
    val isVeg: Boolean
)

val cartItems = listOf(
    CartItem("Paneer Butter Masala", 320, 1, true),
    CartItem("Chicken Biryani", 280, 2, false),
    CartItem("Garlic Naan", 45, 4, true),
    CartItem("Veg Fried Rice", 180, 1, true),
    CartItem("Chicken Wings", 350, 1, false)
)

val deliveryPartnerName: String? = null   // not assigned yet
val userCouponCode: String? = "SAVE50"
```