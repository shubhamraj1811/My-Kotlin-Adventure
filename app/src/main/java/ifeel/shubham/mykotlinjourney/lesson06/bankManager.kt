package ifeel.shubham.mykotlinjourney.lesson06

// ----- Global Variable -----
var accountHolder = "Shubham"
var balance = 15000.0
var transactionCount = 0
val accountNumber = "SB-2024-98765"
var isAccountFrozen = false
val dailyTransferLimit = 50000.0
var totalTransferredToday = 0.0

fun deposit(amount: Double) {
    // - Validate amount > 0
    if(amount <= 0){
        println("Invalid amount")
        return
    }

    // - Account must not be frozen
    if(isAccountFrozen){
        println("❌ Transaction failed — Account is frozen")
        return
    }

    // - Update balance and transactionCount
    balance += amount
    transactionCount++

    // - Print confirmation
    println("✅ Deposited ₹$amount | New Balance: ₹$balance")
}

fun withdraw(amount: Double) {
    // - Account must not be frozen
    if(isAccountFrozen){
        println("❌ Transaction failed — Account is frozen")
        return
    }

    // - Validate amount > 0
    if(amount <= 0){
        println("Invalid amount")
        return
    }

    // - Must have sufficient balance
    //   (minimum ₹500 balance must always remain)
    if(balance - amount < 500){
        println("❌ Withdrawal failed — Insufficient balance (min ₹500 must remain)")
        return
    }

    // - Update balance and transactionCount
    balance -= amount
    transactionCount++

    println("✅ Withdrawn ₹$amount | New Balance: ₹$balance")
}

fun transfer(toAccount: String, amount: Double, remarks: String = "Transfer") {
    // - All withdrawal validations apply
    if(isAccountFrozen){
        println("❌ Transaction failed — Account is frozen")
        return
    }
    if(amount <= 0){
        println("Invalid amount")
        return
    }
    if(balance - amount < 500){
        println("❌ Withdrawal failed — Insufficient balance (min ₹500 must remain)")
        return
    }

    // - Check daily transfer limit not exceeded
    if(totalTransferredToday + amount > dailyTransferLimit){
        println("❌ Transfer failed — Daily limit of ₹$dailyTransferLimit exceeded")
        return
    }

    // - Update totalTransferredToday
    balance -= amount
    transactionCount++
    totalTransferredToday += amount

    // - Print success with remarks
    println(
        "✅ Transfer of ₹$amount to $toAccount | Remarks: $remarks"
    )
}

fun printStatement() {
    val remainingLimit = dailyTransferLimit - totalTransferredToday

    // - Print account holder name
    // - Print account number
    // - Current balance
    // - Transactions done today
    // - Remaining daily transfer limit

    println("====== ACCOUNT STATEMENT ======")
    println("Account Holder  : $accountHolder")
    println("Account Number  : $accountNumber")
    println("Balance         : ₹$balance")
    println("Transactions    : $transactionCount")
    println("Transfer Limit  : ₹$remainingLimit remaining")
    println("================================")
}


fun freezeAccount(reason: String) {
    isAccountFrozen = true
    println("🔒 Account frozen — Reason: $reason")
}
// - Set isAccountFrozen = true
// - Print reason

fun main() {
    // -------------------
    deposit(5000.0)
    withdraw(2000.0)
    transfer("SB-2024-11111", 10000.0, "Rent Payment")
    transfer("SB-2024-22222", 45000.0)   // should fail — daily limit exceeded
    withdraw(50000.0)                     // should fail — insufficient balance
    printStatement()
    freezeAccount("Suspicious activity detected")
    deposit(1000.0)                       // should fail — account frozen
}

// Test sequence — run in this exact order:
/*
✅ Deposited ₹5000.0 | New Balance: ₹20000.0
✅ Withdrawn ₹2000.0 | New Balance: ₹18000.0
✅ Transfer of ₹10000.0 to SB-2024-11111 | Remarks: Rent Payment
❌ Transfer failed — Daily limit of ₹50000.0 exceeded
❌ Withdrawal failed — Insufficient balance (min ₹500 must remain)

====== ACCOUNT STATEMENT ======
Account Holder  : Shubham
Account Number  : SB-2024-98765
Balance         : ₹18000.0
Transactions    : 3
Transfer Limit  : ₹35000.0 remaining
================================

🔒 Account frozen — Reason: Suspicious activity detected
❌ Transaction failed — Account is frozen
*/