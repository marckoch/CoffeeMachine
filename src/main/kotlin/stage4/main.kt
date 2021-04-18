package stage4

import java.util.*

val scanner = Scanner(System.`in`)

enum class Coffee(val water: Int, val milk: Int, val gramOfCoffeeBeans: Int, val price: Int) {
    ESPRESSO(250, 0, 16, 4),
    LATTE(350, 75, 20, 7),
    CAPPUCCINO(200, 100, 12, 6)
}

class CoffeeMachine {
    private var water = 400
    private var milk = 540
    private var gramOfCoffeeBeans = 120
    private var dollar = 550
    private var noOfDisposableCups = 9

    fun take() {
        println("I gave you $${dollar}")
        dollar = 0
    }

    fun buy() {
        when (getIntInput("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ")) {
            1 -> make(Coffee.ESPRESSO)
            2 -> make(Coffee.LATTE)
            3 -> make(Coffee.CAPPUCCINO)
        }
    }

    fun fill() {
        val newWater = getIntInput("Write how many ml of water do you want to add: ")
        water += newWater

        val newMilk = getIntInput("Write how many ml of milk do you want to add: ")
        milk += newMilk

        val newCoffeeBeans = getIntInput("Write how many grams of coffee beans do you want to add: ")
        gramOfCoffeeBeans += newCoffeeBeans

        val newDisposableCups = getIntInput("Write how many disposable cups of coffee do you want to add: ")
        noOfDisposableCups += newDisposableCups
    }

    private fun make(coffee: Coffee) {
        water -= coffee.water
        milk -= coffee.milk
        gramOfCoffeeBeans -= coffee.gramOfCoffeeBeans
        dollar += coffee.price
        noOfDisposableCups--
    }

    fun printState() {
        println("The coffee machine has:")
        println("$water of water")
        println("$milk of milk")
        println("$gramOfCoffeeBeans of coffee beans")
        println("$noOfDisposableCups of disposable cups")
        println("$dollar of money")
        println()
    }
}

fun main() {
    val coffeeMachine = CoffeeMachine()

    coffeeMachine.printState()

    print("Write action (buy, fill, take): ")
    when (readLine()!!) {
        "buy" -> coffeeMachine.buy()
        "fill" -> coffeeMachine.fill()
        "take" -> coffeeMachine.take()
    }

    coffeeMachine.printState()
}

fun getIntInput(message: String): Int {
    print(message)
    return scanner.nextInt()
}