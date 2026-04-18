package ifeel.shubham.mykotlinjourney.lesson04

// --- Function to Print Bank Name ------------------
fun showBankName () {
    print("Enter Bank Name: ")
    val bankName: String = readln()
    println("================================")
    println("    Welcome To $bankName 🏦    ")
    println("================================")
}

// --- Function to Show Balance ------------------
fun showBalance(accountHolder: String, balance: Double) {
    println("Account Holder: $accountHolder")
    println("Balance: ₹$balance")
}

// Function to Calculate SI
fun calculateInterest(principal: Double, ratePercent: Double, years: Int): Double {
    val simpleInterest = (principal * ratePercent * years) / 100
    return simpleInterest
}

// --- Transfer Money ---------
fun transferMoney(
    from: String,
    to: String,
    amount: Double,
    remarks: String = "Transfer"
) {
    println("Transfer of ₹$amount from $from to $to")
    println("Remarks: $remarks")
}

// --- validate amount ----------
fun isValidAmount(amount: Double): Boolean {
    return (amount > 0 && amount <= 100000)
}

// --- validate account ----------
fun isValidAccount (accountNumber: String): Boolean {
    val length = accountNumber.length
    return (length == 10)
}

// --- process withdrawal ----------------
fun processWithdrawal(accountNumber: String, amount: Double) {
    when {
        !isValidAccount(accountNumber) ->
            println("Transaction failed ❌ — Invalid account number")
        !isValidAmount(amount) && amount <= 0 ->
            println("Transaction failed ❌ — Amount must be greater than 0")
        !isValidAmount(amount) ->
            println("Transaction failed ❌ — Amount exceeds limit of ₹1,00,000")
        else ->
            println("Withdrawal of ₹$amount successful ✅")
    }
}

// --- main -------------------------
fun main () {
    // --- Basic Info ----------
    print("Enter the name of Account Holder: ")
    val accountHolder: String = readln()
    print("Enter the balance: ")
    var balance: Double = readln().toDouble()
    println("————————————————————————————————————")
    // --- function to print bank name ----------
    showBankName()
    println("————————————————————————————————————")

    // --- function to show balance -----------
    showBalance(accountHolder, balance)
    println("————————————————————————————————————")

    // --- calculate SI ---------
    print("Enter Principal Amount: ")
    val principal: Double = readln().toDouble()

    print("Enter rate: ")
    val rate: Double = readln().toDouble()

    print("Enter Years: ")
    val years: Int = readln().toInt()

    val interest: Double = calculateInterest(principal,rate, years)
    println("Interest is : $interest")
    println("————————————————————————————————————")

    // --- transfer money ----------
    transferMoney("Shubham", "Varsha", 1000.0)
    transferMoney("Shubham", "Varsha", 500.0, remarks = "Birthday Gift")

    // --- withdrawal message
    processWithdrawal("1234567890", 5000.0)
    processWithdrawal("12345", 5000.0)
    processWithdrawal("1234567890", -500.0)
    processWithdrawal("1234567890", 200000.0)
}