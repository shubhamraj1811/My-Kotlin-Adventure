# 🔥 Table of Contents

1. [Assesment Test](#-assessment-test--phase-1-checkpoint)
2. [Problem 01](#problem-1--otp-login-system-)
3. [Code Review - Problem 01](#--code-review-by-claudecode-)
4. [Problem 02](#problem-2--food-delivery-cart-)

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

> Your program must:

1. Print itemized bill — name, quantity, subtotal per item 
2. Calculate total bill amount 
3. Apply delivery charge — free if total > ₹500, else ₹40 
4. Apply coupon — "SAVE50" gives ₹50 off, any other code prints "Invalid coupon", null means no coupon applied 
5. Print delivery partner — if null show "Assigning Partner..."
6. Count and print how many veg vs non-veg items 
7. Print final bill summary

> Expected Output style:

```
====== YOUR CART ======
Paneer Butter Masala x1       ₹320
Chicken Biryani x2            ₹560
Garlic Naan x4                ₹180
Veg Fried Rice x1             ₹180
Chicken Wings x1              ₹350

Subtotal:                     ₹1590
Delivery:                     Free
Coupon (SAVE50):             -₹50
Total:                        ₹1540

Veg Items: 3 | Non-Veg: 2
Delivery Partner: Assigning partner...
```

> **[Check The Code Here](foodDeliveryKart.kt)**

## 🤖 Code Review By ClaudeCode 🔐

### Issues
- Wrong Logic of Delivery Charge
- Didnt Print Veg | Non Veg
- Incomplete Coupon Handling

## 📊 Problem 2 Score: 14/20


| Area                              | Score     |
|-----------------------------------|-----------|
| Cart item display + formatting    | 5/5 ✅     |
| Subtotal calculation              | 2/2 ✅     |
| Delivery fee logic                | 0/3 🔴    |
| Coupon handling                   | 2/4 ⚠️    |
| Null safety (partner)             | 1/2 ⚠️    |
| Veg/Non-veg count + print         | 2/2 ✅     |
| Code structure                    | 2/2 ✅     |

---

# Problem 3 — Fitness Tracker 🏃
Daily fitness tracking like in Google Fit or Samsung Health.

```agsl
val userName: String = Shubham
val dailyStepGoal: Int = 10000
val stepsWalked: Int = 7345
val waterGoalLitres: Double = 3.0
val waterDrunkLitres: Double = 1.8
val sleepGoalHours: Int = 8
val sleepHours: Double = 6.5
val heartRate: Int? = null       // not measured yet
val weight: Double? = 72.5
```

- Calculate step completion percentage — round to 1 decimal
- Use when with ranges to assign step achievement level:
  - 0-30% → "Just Getting Started 🐢"
  - 31-60% → "Keep Going 🚶"
  - 61-90% → "Almost There 🏃"
  - 91-100%+ → "Goal Crushed! 🔥"
- Check water intake — show deficit or surplus
- Check sleep — show how many hours short or over goal
- Heart rate — use null safety to show reading or "Not measured today"
- BMI — weight is nullable, only calculate if available
  - BMI formula: weight / (height * height) — use height 1.75
  - Category: Under 18.5 = Underweight, 18.5-24.9 = Normal, 25+ = Overweight
- Print a full daily report

> Expected Output style:
```
====== FITNESS REPORT — Shubham ======
Steps:    7345/10000 (73.5%) — Almost There 🏃
Water:    1.8L/3.0L — 1.2L remaining
Sleep:    6.5h/8h — 1.5h short
Heart:    Not measured today
BMI:      23.7 — Normal ✅
=====================================
```

---

# Problem 4 — Movie Booking System 🎬
Book movie tickets like BookMyShow.
```agsl
val movieName: String = Pushpa 2
val availableSeats: Int = 8
val ticketPrice: Int = 250
val userAge: Int = 16
val isWeekend: Boolean = true
val membershipType: String? = GOLD   // null, "SILVER", or "GOLD"
```

## Your program must:
- Write a function canBook(age: Int, availableSeats: Int, requestedSeats: Int): Boolean
  - Must be 18+ OR have parental guidance (age >= 13 for U/A)
  - Requested seats must be available
  - Max 6 seats per booking
- Write a function calculateTotal(tickets: Int, price: Int, isWeekend: Boolean, membership: String?): Int
  - Weekend surcharge: +₹50 per ticket
  - GOLD membership: 20% off final amount
  - SILVER membership: 10% off final amount
  - No membership: no discount
- Write a function printBookingConfirmation(...) that prints full ticket summary
- Test with:
  - 2 tickets, age 16, GOLD member on weekend
  - 7 tickets (exceeds limit)
  - 3 tickets, age 12 (age restriction)

> Expected Output style:
```
====== BOOKING SUMMARY ======
Movie:        Pushpa 2
Tickets:      2
Base Price:   ₹500
Weekend:      +₹100
Membership:   GOLD (-20%)
Total:        ₹480
✅ Booking Confirmed!

❌ Cannot book: Maximum 6 seats per booking
❌ Cannot book: Age restriction applies
```

---

# Problem 5 — Bank Account Manager 🏦
A simple banking app with multiple operations.
```agsl
var accountHolder: String = Shubham
var balance: Double = 15000.0
var transactionCount: Int = 0
val accountNumber: String = SB-2024-98765
var isAccountFrozen: Boolean = false
val dailyTransferLimit: Double = 50000.0
var totalTransferredToday: Double = 0.0
```

## Your program must build these functions:
```
fun deposit(amount: Double)
// - Validate amount > 0
// - Account must not be frozen
// - Update balance and transactionCount
// - Print confirmation

fun withdraw(amount: Double)  
// - Validate amount > 0
// - Must have sufficient balance (min ₹500 balance always maintained)
// - Account must not be frozen
// - Update balance and transactionCount

fun transfer(toAccount: String, amount: Double, remarks: String = "Transfer")
// - All withdrawal validations apply
// - Check daily transfer limit not exceeded
// - Update totalTransferredToday
// - Print success with remarks

fun printStatement()
// - Print account details
// - Current balance
// - Transactions done today
// - Remaining daily transfer limit

fun freezeAccount(reason: String)
// - Set isAccountFrozen = true
// - Print reason
```

## Test sequence:

```
deposit(5000.0)
withdraw(2000.0)
transfer("SB-2024-11111", 10000.0, "Rent Payment")
transfer("SB-2024-22222", 45000.0)   // should fail — daily limit
withdraw(50000.0)                     // should fail — insufficient
printStatement()
freezeAccount("Suspicious activity detected")
deposit(1000.0)                       // should fail — frozen
```

---

# Problem 6 — Student Report Card 📊
Scenario: Generate a school report card system.

```
data class Subject(
    val name: String,
    val marksObtained: Int,
    val maxMarks: Int,
    val teacherRemark: String?
)

val studentName: String = "Shubham"
val rollNumber: Int = 42
val className: String = "10th Grade"

val subjects = listOf(
    Subject("Mathematics", 88, 100, "Excellent problem solver"),
    Subject("Science", 76, 100, null),
    Subject("English", 91, 100, "Outstanding writing skills"),
    Subject("History", 55, 100, "Needs more focus"),
    Subject("Computer Science", 95, 100, "Future programmer!")
)
```

## Your program must:

- Calculate percentage for each subject
- Assign grade using when:
  - 90-100 → "A+", 80-89 → "A", 70-79 → "B",
  - 60-69 → "C", 50-59 → "D", below 50 → "F"
- Print teacher remark — if null show "No remarks"
- Find highest and lowest scoring subject
- Calculate overall percentage and overall grade
- Determine result: Pass (all subjects ≥ 40) or Fail
- Print a properly formatted report card

> Expected Output style:

```
╔══════════════════════════════════════════╗
║         ANNUAL REPORT CARD              ║
║  Student: Shubham        Roll No: 42    ║
║  Class: 10th Grade                      ║
╠══════════════════════════════════════════╣
║  Mathematics    88/100   88%    A        ║
║  Remark: Excellent problem solver        ║
║                                          ║
║  Science        76/100   76%    B        ║
║  Remark: No remarks                      ║
║  ...                                     ║
╠══════════════════════════════════════════╣
║  Overall: 81%   Grade: A   Result: PASS ║
║  Best Subject:  Computer Science (95%)  ║
║  Needs Work:    History (55%)           ║
╚══════════════════════════════════════════╝
```


---

# 📊 Assessment Scoring Breakdown

```
╔══════════════════════════════════════════════════════════════╗
║  PROBLEM              MAX     WHAT I'M LOOKING FOR          ║
╠══════════════════════════════════════════════════════════════╣
║  P1 — OTP Login       20pts   loops, null safety, when      ║
║  P2 — Food Cart       20pts   loops, operators, null safety  ║
║  P3 — Fitness         15pts   operators, null, when ranges   ║
║  P4 — Movie Booking   20pts   functions, operators, when     ║
║  P5 — Bank Manager    15pts   functions, validation, loops   ║
║  P6 — Report Card     10pts   loops, when, null safety       ║
╠══════════════════════════════════════════════════════════════╣
║  TOTAL                100pts                                 ║
╠══════════════════════════════════════════════════════════════╣
║  BONUS (+10pts each)                                         ║
║  • Zero hardcoded values                                     ║
║  • Named arguments used where appropriate                    ║
║  • Guard clauses used in functions                           ║
║  • No !! used anywhere                                       ║
╚══════════════════════════════════════════════════════════════╝
```

# 🏆 Grade Scale

```
95-110  → Senior Intern level — exceptional
85-94   → Strong fresher — ready for interviews
75-84   → Good fresher — minor gaps
65-74   → Average — needs more practice
Below   → Revisit fundamentals first
```