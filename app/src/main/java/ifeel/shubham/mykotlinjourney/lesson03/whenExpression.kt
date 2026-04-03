package ifeel.shubham.mykotlinjourney.lesson03

fun main() {
    // ----- grading system using when -----

    print("Enter Marks: ")
    val marksObtained = readln().toInt()
    val grade = when(marksObtained) {
        in 90..100 -> "A Grade"
        in 80..90 -> "B Grade"
        in 70..80 -> "C Grade"
        in 60..70 -> "D Grade"
        in 50..60 -> "E Grade"
        else -> "Fail"
    }
    println("Your Grade is $grade")

    // ----- Weapon Equip System -----

    print("Enter Your Player Class (Mage, Tank, Assassin, Warrior): ")
    val playerClass:String = readln()
    print("Enter Your Level (1-100): ")
    val playerLevel:Int = readln().toInt()

    val equippedWeapon = when(playerClass) {
        "Mage" -> {
            if(playerLevel >= 90)
                "Dragon Staff"
            else if(playerLevel >= 70)
                "Phoenix Staff"
            else if(playerLevel >= 50)
                "Unicorn Staff"
            else
                "Wood Staff"
        }
        "Tank" -> {
            if(playerLevel >= 90)
                "Dragon Scale Armour & Hammer"
            else if(playerLevel >= 70)
                "Golem Armour & Hammer"
            else
                "Iron Armour & Shield"
        }
        "Assassin" -> {
            if(playerLevel >= 90)
                "Dragon Tooth Dagger"
            else if(playerLevel >= 70)
                "Serpent Fang Dagger"
            else if(playerLevel >= 50)
                "Wolf Fang Dagger"
            else
                "Iron Dagger"
        }
        "Warrior" -> {
            if(playerLevel >= 90)
                "Dragon Scale Axe"
            else if(playerLevel >= 70)
                "T-Rex Bone Axe"
            else if(playerLevel >= 50)
                "Emerald Enchanted Axe"
            else
                "Silver Valley Axe"
        }
        else -> "No Weapon Equipped"
    }
    println("Your Equipped Weapon: $equippedWeapon")
}