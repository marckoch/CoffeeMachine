package stage3

import java.util.*

val scanner = Scanner(System.`in`)

fun main() {
    println("Write how many ml of water the coffee machine has: ")
    val mlOfWater = scanner.nextInt()
    val cupsBasedOnWater = mlOfWater / 200

    println("Write how many ml of milk the coffee machine has: ")
    val mlOfMilk = scanner.nextInt()
    val cupsBasedOnMilk = mlOfMilk / 50

    println("Write how many grams of coffee beans the coffee machine has: ")
    val gramsOfCoffeeBeans = scanner.nextInt()
    val cupsBasedOnCoffee = gramsOfCoffeeBeans / 15

    val availableCupsOfCoffee = minOf(cupsBasedOnWater, cupsBasedOnMilk, cupsBasedOnCoffee)

    println("Write how many cups of coffee you will need: ")
    val neededCupsOfCoffee = scanner.nextInt()

    if (neededCupsOfCoffee == availableCupsOfCoffee) {
        println("Yes, I can make that amount of coffee")
    } else if (neededCupsOfCoffee < availableCupsOfCoffee) {
        val excess = availableCupsOfCoffee - neededCupsOfCoffee
        println("Yes, I can make that amount of coffee (and even $excess more than that)")
    } else {
        println("No, I can make only $availableCupsOfCoffee cups of coffee")
    }
}