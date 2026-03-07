// Superhero Catalog Program

// 1️⃣ Data class for Superhero
data class Superhero(
    val name: String,
    val power: String,
    val mission: String
)

// 2️⃣ Function to display heroes
fun displayHeroes(heroes: List<Superhero>) {

    println("===== Superhero Catalog =====\n")

    for (hero in heroes) {
        println("Hero Name : ${hero.name}")
        println("Power     : ${hero.power}")
        println("Mission   : ${hero.mission}")
        println("------------------------------")
    }
}

fun main() {

    // 3️⃣ List of superheroes
    val heroes = listOf(
        Superhero(
            "Captain Code",
            "Super Programming Skills",
            "Protect the digital world from bugs."
        ),
        Superhero(
            "Debug Girl",
            "Finding and fixing errors instantly",
            "Keep software running smoothly."
        ),
        Superhero(
            "UI Master",
            "Designing beautiful interfaces",
            "Create accessible and user-friendly apps."
        ),
        Superhero(
            "Data Guardian",
            "Managing and securing data",
            "Ensure safe and reliable information systems."
        )
    )

    // 4️⃣ Display catalog
    displayHeroes(heroes)
}
