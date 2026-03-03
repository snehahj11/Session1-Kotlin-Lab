// Session 4 Lab - Console Business Card

fun main() {

    printBorder()
    printLogo()
    printHeader("Sneha H J", "Android Developer")
    printContact("📞 +91 9876543210", "✉ sneha@email.com", "🌐 github.com/snehahj11")
    printBorder()
}

// Reusable Border Function
fun printBorder() {
    println("========================================")
}

// Reusable Logo Section
fun printLogo() {
    println("        ★ ★ ★  MY BUSINESS CARD  ★ ★ ★")
    println("             (•‿•)")
    println("----------------------------------------")
}

// Reusable Header Section
fun printHeader(name: String, title: String) {
    println("Name : $name")
    println("Role : $title")
    println("----------------------------------------")
}

// Reusable Contact Section
fun printContact(phone: String, email: String, website: String) {
    println("Contact Information:")
    println(phone)
    println(email)
    println(website)
}
