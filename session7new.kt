import kotlin.math.ceil

fun calculateTip(amount: Double, tipPercent: Double, roundUp: Boolean): Double {
    var tip = amount * tipPercent / 100

    if (roundUp) {
        tip = ceil(tip)
    }

    return tip
}

fun main() {
    print("Enter the bill amount: ")
    val amount = readLine()!!.toDouble()

    print("Enter the tip percentage: ")
    val tipPercent = readLine()!!.toDouble()

    print("Round up tip? (true/false): ")
    val roundUp = readLine()!!.toBoolean()

    val tip = calculateTip(amount, tipPercent, roundUp)

    println("Tip amount: %.2f".format(tip))
}
