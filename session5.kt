// Session 5 Lab - Console Contact Manager

// 1️⃣ Data Class
data class Contact(
    val name: String,
    val phone: String?,
    val email: String?,
    val isFavorite: Boolean
)

fun main() {

    // 2️⃣ List of Contacts
    val contacts = listOf(
        Contact("Sneha", "9876543210", "sneha@email.com", true),
        Contact("Rahul", null, "rahul@email.com", false),
        Contact("Ananya", "9123456780", null, true),
        Contact("Kiran", null, null, false)
    )

    println("===== All Contacts =====")
    displayContacts(contacts)

    println("\n===== Favorite Contacts =====")
    filterAndDisplay(contacts) { it.isFavorite }

    println("\n===== Contacts with Email =====")
    filterAndDisplay(contacts) { it.email != null }
}

// 3️⃣ Reusable Function to Display Contacts
fun displayContacts(contactList: List<Contact>) {
    for (contact in contactList) {
        println("---------------------------")
        println("Name : ${contact.name}")
        println("Phone: ${contact.phone ?: "Not Available"}")
        println("Email: ${contact.email ?: "Not Available"}")
        println("Favorite: ${if (contact.isFavorite) "Yes" else "No"}")
    }
}

// 4️⃣ Higher-Order Function for Filtering
fun filterAndDisplay(
    contacts: List<Contact>,
    filterCondition: (Contact) -> Boolean
) {
    val filteredList = contacts.filter(filterCondition)
    displayContacts(filteredList)
}
