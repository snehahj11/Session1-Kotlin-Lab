// Session 11 Lab - Zoo Animal Tracker

// 1️⃣ Abstract class
abstract class Animal(val name: String) {
    abstract fun makeSound()
}

// 2️⃣ Interface
interface Action {
    fun performAction()
}

// 3️⃣ Lion class
class Lion(name: String) : Animal(name), Action {
    override fun makeSound() {
        println("$name roars loudly! 🦁")
    }

    override fun performAction() {
        println("$name is roaming in the zoo enclosure.")
    }
}

// 4️⃣ Elephant class
class Elephant(name: String) : Animal(name), Action {
    override fun makeSound() {
        println("$name trumpets loudly! 🐘")
    }

    override fun performAction() {
        println("$name sprays water with its trunk! 💦")
    }
}

// 5️⃣ Parrot class
class Parrot(name: String) : Animal(name), Action {
    override fun makeSound() {
        println("$name mimics words! 🦜")
    }

    override fun performAction() {
        println("$name is flying around the cage.")
    }
}

fun main() {

    // 6️⃣ Zoo animal list (Polymorphism)
    val zooAnimals: List<Animal> = listOf(
        Lion("Simba"),
        Elephant("Dumbo"),
        Parrot("Coco")
    )

    println("🐾 Welcome to the Zoo Animal Tracker\n")

    for (animal in zooAnimals) {
        println("Animal: ${animal.name}")
        animal.makeSound()

        if (animal is Action) {
            animal.performAction()
        }

        println("------------------------")
    }
}
