// Session 9 Lab - Inventory Management

// 1️⃣ Data class for inventory items
data class Item(
    val name: String,
    val category: String,
    val price: Double,
    val stock: Int
)

fun main() {

    // 2️⃣ List of inventory items
    val inventory = listOf(
        Item("Laptop", "Electronics", 55000.0, 5),
        Item("Mouse", "Electronics", 500.0, 20),
        Item("Notebook", "Stationery", 50.0, 100),
        Item("Pen", "Stationery", 20.0, 0),
        Item("Chair", "Furniture", 2500.0, 8)
    )

    println("===== All Inventory Items =====")
    displayItems(inventory)

    // 3️⃣ Filter items with stock available
    println("\n===== Items In Stock =====")
    val inStock = inventory.filter { it.stock > 0 }
    displayItems(inStock)

    // 4️⃣ Filter by category
    println("\n===== Electronics Items =====")
    val electronics = inventory.filter { it.category == "Electronics" }
    displayItems(electronics)

    // 5️⃣ Compute category totals
    println("\n===== Category Totals =====")
    val totals = calculateCategoryTotals(inventory)

    for ((category, total) in totals) {
        println("$category : ₹$total")
    }
}

// Function to display items
fun displayItems(items: List<Item>) {
    for (item in items) {
        println("${item.name} | ${item.category} | ₹${item.price} | Stock: ${item.stock}")
    }
}

// Function using generics and maps to calculate totals
fun <T : Item> calculateCategoryTotals(items: List<T>): Map<String, Double> {

    val totals = mutableMapOf<String, Double>()

    for (item in items) {
        val value = item.price * item.stock
        totals[item.category] = (totals[item.category] ?: 0.0) + value
    }

    return totals
}
