fun main() {

    // Student details
    val studentName = "Sneha"

    // List of marks
    val marks = listOf(85, 78, 92, 88, 74)

    // Generate report
    generateReport(studentName, marks)
}

// Function to generate student performance report
fun generateReport(name: String, marks: List<Int>) {

    var total = 0

    println("----- Student Performance Report -----")
    println("Student Name: $name")
    println("Marks:")

    // Loop through marks
    for ((index, mark) in marks.withIndex()) {
        println("Subject ${index + 1}: $mark")
        total += mark
    }

    // Calculate average
    val average = total / marks.size

    println("--------------------------------------")
    println("Total Marks: $total")
    println("Average Marks: $average")

    // Condition to check grade
    val grade = when {
        average >= 90 -> "A+ (Excellent)"
        average >= 80 -> "A (Very Good)"
        average >= 70 -> "B (Good)"
        average >= 60 -> "C (Average)"
        else -> "Fail (Needs Improvement)"
    }

    println("Grade: $grade")
    println("--------------------------------------")
}
