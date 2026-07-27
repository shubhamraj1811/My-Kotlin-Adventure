package ifeel.shubham.mykotlinjourney.lesson08

class PasswordManager {

   private var storedPassword: String = ""
   private var failedAttempts: Int = 0
   private val maxAttempts: Int = 3

   // Public interface — what outsiders can do
   fun setPassword(newPassword: String) {
      if (newPassword.length < 8) {
         println("❌ Password too short — minimum 8 characters")
         return
      }
      storedPassword = encrypt(newPassword)   // calls private method
      println("✅ Password updated")
   }

   fun verifyPassword(attempt: String): Boolean {
      if (failedAttempts >= maxAttempts) {
         println("🔒 Account locked — too many failed attempts")
         return false
      }

      return if (encrypt(attempt) == storedPassword) {
         failedAttempts = 0
         println("✅ Password correct")
         true
      } else {
         failedAttempts++
         println("❌ Wrong password. Attempts: $failedAttempts/$maxAttempts")
         false
      }
   }

   // Private — only this class uses this
   private fun encrypt(password: String): String {
      return password.reversed() + "##"   // simplified "encryption"
   }
}

fun main() {
   val pm = PasswordManager()
   pm.setPassword("kotlin123")                  // ✅
   pm.verifyPassword("wrong")          // ❌ Wrong
   pm.verifyPassword("kotlin123")      // ✅ Correct
   pm.verifyPassword("wrong")          // ❌ Wrong
   pm.verifyPassword("wrong")          // ❌ Wrong
   pm.verifyPassword("wrong")          // ❌ Wrong
   pm.verifyPassword("wrong")          // ❌ Wrong
   println("ONE MORE")
   pm.verifyPassword("wrong")          // ❌ Wrong
   pm.verifyPassword("kotlin123")      // ✅ Correct



   // pm.storedPassword                // ❌ COMPILER ERROR
   // pm.encrypt("test")               // ❌ COMPILER ERROR
   // pm.failedAttempts                // ❌ COMPILER ERROR
}