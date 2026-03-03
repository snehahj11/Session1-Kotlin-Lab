// Session 1 Lab Practice
fun main() {

    // 1️⃣ Variables
    val studentName: String = "Sneha"
    var age: Int = 20
    val course: String = "Android Development"

    println("Student Name: $studentName")
    println("Age: $age")
    println("Course: $course")
    println("--------------------------------")

    // 2️⃣ String Template with Function
    val message = welcomeMessage(studentName, course)
    println(message)
    println("--------------------------------")

    // 3️⃣ List Example
    val subjects = listOf("Kotlin Basics", "Layouts", "Activities", "Intents")

    println("Subjects in this course:")
    for (subject in subjects) {
        println("- $subject")
    }
    println("--------------------------------")

    // 4️⃣ Function Call with List
    printSubjectsCount(subjects)
}

// Function with parameters and return type
fun welcomeMessage(name: String, course: String): String {
    return "Hello $name! Welcome to the $course course."
}

// Function using List parameter
fun printSubjectsCount(subjects: List<String>) {
    println("Total number of subjects: ${subjects.size}")
}
