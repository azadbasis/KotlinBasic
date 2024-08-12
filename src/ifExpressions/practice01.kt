package ifExpressions

import java.text.DecimalFormat
import kotlin.random.Random

fun main() {
    val marks = Random.nextInt(101)
    println("Marks: $marks")
    val result = if (marks >= 50 && marks <= 59) {
        println("C")
        "C"
    } else if (marks >= 60 && marks <= 69) {
        println("B")
        "B"
    } else if (marks >= 70 && marks <= 79) {
        println("A-")
        "A-"
    } else if (marks >= 80 && marks <= 89) {
        println("A")
        "A"
    } else if (marks >= 90 && marks <= 100) {
        println("A+")
        "A+"
    } else {
        println("F")
        "F"
    }
    println("My result: " + result)

    val randomHeight = Random.nextDouble(0.0, 10.0)
    val decimalFormat = DecimalFormat("#.0")
    val formattedHeight = decimalFormat.format(randomHeight)

    println("Height: $formattedHeight")

// Convert formattedHeight to Double for comparison
    val heightDouble = formattedHeight.toDouble()

    val heightResult = if (heightDouble < 5.0) {
        println("SHORT")
        "SHORT"
    } else if (heightDouble in 5.0..5.5) {
        println("MEDIUM")
        "MEDIUM"
    } else {
        println("TALL")
        "TALL"
    }
    println("My height: $heightResult")
}