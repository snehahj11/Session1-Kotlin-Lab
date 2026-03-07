// Session 12 Lab - Theme Switcher and Progress Animation

// 1️⃣ Data class for Theme
data class Theme(
    val name: String,
    val backgroundColor: String,
    val textColor: String
)

fun main() {

    val lightTheme = Theme("Light Theme", "White", "Black")
    val darkTheme = Theme("Dark Theme", "Black", "White")

    println("===== Theme Switcher App =====")
    println("1. Light Theme")
    println("2. Dark Theme")

    print("Select Theme: ")
    val choice = readLine()

    when (choice) {
        "1" -> applyTheme(lightTheme)
        "2" -> applyTheme(darkTheme)
        else -> println("Invalid choice!")
    }

    println("\nLoading application...")
    animateProgressBar()
}

// 2️⃣ Function to apply theme
fun applyTheme(theme: Theme) {
    println("\nApplying ${theme.name}")
    println("Background Color: ${theme.backgroundColor}")
    println("Text Color: ${theme.textColor}")
}

// 3️⃣ Progress bar animation
fun animateProgressBar() {
    for (i in 0..100 step 10) {
        val progressBar = "#".repeat(i / 10)
        println("Loading: [$progressBar] $i%")
        Thread.sleep(200)
    }
    println("Application Loaded Successfully!")
}
