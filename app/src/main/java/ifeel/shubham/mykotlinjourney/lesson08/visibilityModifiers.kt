package ifeel.shubham.mykotlinjourney.lesson08

class BankAccount {
   val accountNumber = "SR-18"      // everyone can see
   private var balance = 30000.0     // only this class can touch
   private var pin = "1234"          // definitely private!

   fun getBalance(): Double {        // controlled public access
      return balance
   }
}

fun main() {
   val ac = BankAccount()
   println(ac.accountNumber)    // ✅ public — accessible
//   println(ac.balance)          // ❌ COMPILER ERROR — private!
//   println(ac.pin)              // ❌ COMPILER ERROR — private!
   println(ac.getBalance())     // ✅ controlled access — fine
}