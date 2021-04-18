package stage2

import java.util.*

fun main() {
    println("Write how many cups of coffee you will need: ")
    val scanner = Scanner(System.`in`)
    val cups = scanner.nextInt()

    println("For $cups cups of coffee you will need:")
    println("${cups * 200} ml of water")
    println("${cups * 50} ml of milk")
    println("${cups * 15} g of coffee beans")
}