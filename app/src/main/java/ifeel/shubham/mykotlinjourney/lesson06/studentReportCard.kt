package ifeel.shubham.mykotlinjourney.lesson06

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

fun getGrade(percentage: Int): String {
    return when (percentage) {
        in 90..100 -> "A+"
        in 80..89 -> "A"
        in 70..79 -> "B"
        in 60..69 -> "C"
        in 50..59 -> "D"
        else -> "F"
    }
}

fun main() {

    val highestSubject = subjects.maxByOrNull { it.marksObtained }
    val lowestSubject = subjects.minByOrNull { it.marksObtained }

    val totalObtained = subjects.sumOf { it.marksObtained }
    val totalMaximum = subjects.sumOf { it.maxMarks }

    val overallPercentage = (totalObtained * 100) / totalMaximum
    val overallGrade = getGrade(overallPercentage)

    val result = if (subjects.all { it.marksObtained >= 40 }) {
        "PASS"
    } else {
        "FAIL"
    }

    println("╔══════════════════════════════════════════╗")
    println("║           ANNUAL REPORT CARD            ║")
    println("║ Student : $studentName")
    println("║ Roll No : $rollNumber")
    println("║ Class   : $className")
    println("╠══════════════════════════════════════════╣")

    for (subject in subjects) {

        val percentage =
            (subject.marksObtained * 100) / subject.maxMarks

        val grade = getGrade(percentage)

        val remark = subject.teacherRemark ?: "No remarks"

        println(
            "║ ${subject.name.padEnd(16)} " +
                    "${subject.marksObtained}/${subject.maxMarks} " +
                    "${percentage.toString().padEnd(3)}% " +
                    grade
        )

        println("║ Remark: $remark")
        println("║")
    }

    println("╠══════════════════════════════════════════╣")

    println(
        "║ Overall : $overallPercentage%    " +
                "Grade : $overallGrade    " +
                "Result : $result"
    )

    println(
        "║ Best    : ${highestSubject?.name} " +
                "(${highestSubject?.marksObtained}%)"
    )

    println(
        "║ Improve : ${lowestSubject?.name} " +
                "(${lowestSubject?.marksObtained}%)"
    )

    println("╚══════════════════════════════════════════╝")
}