// Session 10 Lab - Product Analyzer

// 1️⃣ Data class
data class Product(
    val name: String,
    val category: String,
    val price: Double
)

fun main() {

    // 2️⃣ Product list
    val products = listOf(
        Product("Laptop", "Electronics", 60000.0),
        Product("Headphones", "Electronics", 3000.0),
        Product("Chair", "Furniture", 2500.0),
        Product("Notebook", "Stationery", 80.0),
        Product("Pen", "Stationery", 20.0)
    )

    println("===== All Products =====")
    displayProducts(products)

    // 3️⃣ Filter expensive products
    println("\n===== Products Above ₹2000 =====")
    val expensiveProducts = products.filter { it.price > 2000 }
    displayProducts(expensiveProducts)

    // 4️⃣ Apply discount dynamically
    println("\n===== Products with 10% Discount =====")
    val discountedProducts = applyDiscount(products) { price ->
        price * 0.9
    }

    displayProducts(discountedProducts)
}

// 5️⃣ Higher-order function for discount
fun applyDiscount(
    products: List<Product>,
    discountFunction: (Double) -> Double
): List<Product> {

    return products.map {
        Product(it.name, it.category, discountFunction(it.price))
    }
}

// 6️⃣ Function to display products
fun displayProducts(products: List<Product>) {
    for (product in products) {
        println("${product.name} | ${product.category} | ₹${"%.2f".format(product.price)}")
    }
}
