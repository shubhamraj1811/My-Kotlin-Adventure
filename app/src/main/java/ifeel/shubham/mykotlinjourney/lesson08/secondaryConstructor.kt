package ifeel.shubham.mykotlinjourney.lesson08

class Notification(
   val title: String,
   val message: String,
   val type: String,
   val priority: Int
) {
   // Secondary constructor — create with just title and message
   // defaults the rest
   constructor(title: String, message: String) : this(
      title = title,
      message = message,
      type = "general",
      priority = 1
   )

   // Secondary constructor — create from a Map (e.g. API response)
   constructor(data: Map<String, String>) : this(
      title = data["title"] ?: "No title",
      message = data["message"] ?: "No message",
      type = data["type"] ?: "general",
      priority = data["priority"]?.toInt() ?: 1
   )

   fun display() {
      println("[$type] $title — $message (Priority: $priority)")
   }
}

fun main() {
   // Using primary constructor
   val n1 = Notification("Update", "New version available", "system", 2)

   // Using secondary constructor 1
   val n2 = Notification("Hey!", "You have a new message")

   // Using secondary constructor 2
   val apiData = mapOf("title" to "Sale!", "message" to "50% off today")
   val n3 = Notification(apiData)

   println("n1 has all values")
   n1.display()   // [system] Update — New version available (Priority: 2)

   println()
   println("n2 has only title and message")
   n2.display()   // [general] Hey! — You have a new message (Priority: 1)

   println()
   println("n3 has a map")
   n3.display()   // [general] Sale! — 50% off today (Priority: 1)
}