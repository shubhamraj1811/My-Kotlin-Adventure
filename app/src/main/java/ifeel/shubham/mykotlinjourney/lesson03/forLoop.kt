package ifeel.shubham.mykotlinjourney.lesson03

fun main() {
    // ----- Standard Range (Inclusive: 1, 2, 3, 4, 5) -----

    // spawning Zombie in Minecraft
    println("Looping over a range:- ")
    for(i in 1..5) {
        println("Spawning Zombie #$i")
    }

    // ----- Until (Exclusive: 1, 2, 3, 4 - stops BEFORE 5) -----
    // Great for arrays where the index starts at 0!
    println("Looping over an until:- ")
    for (i in 0 until 5) {
        println("Loading Screen $i")
    }

    // ----- downTo — Counting Backwards -----
    println("Looping over a downTo:- ")
    for (seconds in 10 downTo 0) {
        println("App launches in $seconds seconds...")
    }
    println("Welcome! 🚀")

    // ----- step — Skip Values -----
    println("Looping over a step:- ")
    // Every 2nd number
    for (i in 1..10 step 2) {
        println(i)
    }

    // Every 5th number
    for (i in 0..100 step 5) {
        print("$i ")
    }
}