package ifeel.shubham.mykotlinjourney.lesson06
import kotlin.math.round
import kotlin.math.abs


// calc step %
fun calcStepPercentage(stepGoal:Int, stepsWalked:Int) {
    // calc percent - rounded to 1 decimal place
    val rounded:Double = round((stepsWalked.toDouble() / stepGoal)* 1000) / 10.0

    val remark: String = when {
        rounded in 0.0..30.0 -> "Just Getting Started 🐢"
        rounded in 30.1..60.0 -> "Keep Going 🚶"
        rounded in 60.1..90.0 -> "Almost There 🏃"
        rounded in 90.1..100.0 -> "Goal Crushed! 🔥"
        else -> "Outdid Yourself!! 🥵"
    }
    // display steps stat
    println("Steps:".padEnd(10) + "$stepsWalked/$stepGoal ($rounded) - $remark")
}

// check water intake & remark
fun checkWaterIntake(waterGoal: Double, drunk: Double) {
    // calc water intake
    val intake: Double = waterGoal - drunk
    val positiveIntake = abs(intake)
    val intakeRemark = when {
        intake > 0.0 -> "remaining"
        intake == 0.0 -> "goal Completed"
        else -> "surplus"
    }

    // display water intake stat
    println("Water:".padEnd(10) + "${drunk}L/${waterGoal}L - ${positiveIntake}L $intakeRemark")
}

// check sleep and remark - ✅
fun checkSleepHours (sleptHours:Double, sleepGoal:Int) {
    val sleepDifference: Double = sleepGoal - sleptHours
    val positiveSleepDifference: Double = abs(sleepDifference)

    val sleepRemark = when {
        sleepDifference > 0.0 -> "short"
        sleepDifference == 0.0 -> "well slept"
        else -> "overslept"
    }
    println("Sleep:".padEnd(10) + "${sleptHours}h/${sleepGoal}h - ${positiveSleepDifference}h $sleepRemark")
}

// heart rate - null safety
fun checkHeartRate(heartRate:Int?) {
    val heartRateRemark: String = heartRate?.toString() ?: "Not measured today"
    println("Heart:".padEnd(10) + "$heartRateRemark")
}

// bmi - null safety
fun calcBmi(weight: Double?) {
    val height = 1.75
    weight?.let {
        val bmi = round((it / (height * height)) * 10) / 10.0
        val bmiRemark = when {
            bmi < 18.5 -> "Underweight 📛"
            bmi <= 24.9 -> "Normal ✅"
            else -> "Overweight ⚠️"
        }
        println("BMI:".padEnd(10) + "$bmi - $bmiRemark")
    } ?: println("BMI:".padEnd(10) + "Weight not recorded")
}

fun main () {
    val userName: String = "Shubham"

    val dailyStepGoal: Int = 10000
    val stepsWalked: Int = 7345

    val waterGoalLitres: Double = 3.0
    val waterDrunkLitres: Double = 1.8

    val sleepGoalHours: Int = 8
    val sleepHours: Double = 6.5

    val heartRate: Int? = null       // not measured yet
    val weight: Double? = 72.5

    println("====== FITNESS REPORT — $userName ======")

    calcStepPercentage(dailyStepGoal, stepsWalked)
    checkWaterIntake(waterGoalLitres, waterDrunkLitres)
    checkSleepHours(sleepHours, sleepGoalHours)
    checkHeartRate(heartRate)
    calcBmi(weight)

    println("=====================================")
}