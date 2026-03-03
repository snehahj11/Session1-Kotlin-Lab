// Session 3 Lab - User Profile Console App

// 1️⃣ Data Class
data class User(
    val name: String,
    val age: Int,
    val email: String,
    val showAvatar: Boolean
)

fun main() {

    // 2️⃣ Create list of users
    val users = listOf(
        User("Sneha", 20, "sneha@email.com", true),
        User("Rahul", 22, "rahul@email.com", false),
        User("Ananya", 19, "ananya@email.com", true)
    )

    // 3️⃣ Display profiles using loop
    for (user in users) {
        displayProfile(user)
    }
}

// 4️⃣ Function to display user profile
fun displayProfile(user: User) {

    println("===================================")

    // Optional Avatar Box
    if (user.showAvatar) {
        println("  +-------------+")
        println("  |   (•‿•)     |")
        println("  |   Avatar    |")
        println("  +-------------+")
    }

    // Formatted Profile Info
    println("Name : ${user.name}")
    println("Age  : ${user.age}")
    println("Email: ${user.email}")

    println("===================================\n")
}
