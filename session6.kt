// Session 6 Lab - Dice Roller

import kotlin.random.Random

fun main() {

    println("🎲 Welcome to the Dice Roller Game!")
    println("------------------------------------")

    rollDice()
}

// Function to roll two dice
fun rollDice() {

    val dice1 = Random.nextInt(1, 7) // 1 to 6
    val dice2 = Random.nextInt(1, 7)

    println("Dice 1: $dice1")
    println("Dice 2: $dice2")

    val total = dice1 + dice2
    println("Total : $total")

    // Check for doubles
    if (dice1 == dice2) {
        println("🎉 Wow! You rolled doubles! Lucky roll!")
    } else {
        println("👍 Nice roll! Try again!")
    }
}
