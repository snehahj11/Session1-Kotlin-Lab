// Session 8 Lab - Art Gallery Navigator

// 1️⃣ Data Class
data class Artwork(
    val title: String,
    val artist: String,
    val year: Int
)

fun main() {

    // 2️⃣ List of artworks
    val gallery = listOf(
        Artwork("Starry Night", "Vincent van Gogh", 1889),
        Artwork("Mona Lisa", "Leonardo da Vinci", 1503),
        Artwork("The Persistence of Memory", "Salvador Dalí", 1931),
        Artwork("The Scream", "Edvard Munch", 1893)
    )

    var currentIndex = 0
    var running = true

    println("🎨 Welcome to the Art Gallery Navigator!")

    while (running) {

        displayArtwork(gallery[currentIndex])

        println("\nOptions:")
        println("1. Next Artwork")
        println("2. Previous Artwork")
        println("3. Exit")

        print("Choose an option: ")
        val choice = readLine()

        when (choice) {
            "1" -> currentIndex = nextArtwork(currentIndex, gallery.size)
            "2" -> currentIndex = previousArtwork(currentIndex, gallery.size)
            "3" -> {
                println("Exiting Gallery. Goodbye!")
                running = false
            }
            else -> println("Invalid option. Try again.")
        }
    }
}

// 3️⃣ Function to display artwork
fun displayArtwork(art: Artwork) {
    println("\n==============================")
    println("Title : ${art.title}")
    println("Artist: ${art.artist}")
    println("Year  : ${art.year}")
    println("==============================")
}

// 4️⃣ Next navigation with wrapping
fun nextArtwork(index: Int, size: Int): Int {
    return (index + 1) % size
}

// 5️⃣ Previous navigation with wrapping
fun previousArtwork(index: Int, size: Int): Int {
    return if (index - 1 < 0) size - 1 else index - 1
}
