package practices

import java.io.IOException

//val name1="Azhar"
val name1: String? = "Azhar"

//var age=0
var age: Int = 0

//elvas operator with safe call
fun checkNameLength() = name1?.length ?: -1
fun checkNameLength1(): Int? {
    val length = name1?.length
    return length
}

//unsafe call
fun checkNameLength2(): Int {
    val length = name1!!.length
    return length
}

//todo if
fun checkIf(age: Int) {
    if (age < 10) {
        println("Child")
    } else if (age > 10 && age < 16) {
        println("Teen age")
    } else {
        println("Old")
    }
}

fun checkIf1(age: Int): String {
    val ageGroup = if (age < 10) {
        "CHILD"
    } else if (age > 10 && age < 16) {
        "TEEN AGE"
    } else {
        "OLD"
    }
    return ageGroup
}

val checkIfL = { age: Int ->
    val ageGroup = if (age < 10) {
        "CHILD"
    } else if (age > 10 && age < 16) {
        "TEEN AGE"
    } else {
        "OLD"
    }
    ageGroup
}

fun checkWhen(age: Int) {
    when (age) {
        10 -> println("CHILD")
        in 10..16 -> println("TEEN AGE")
        else -> println("OLD")
    }
}

fun checkWhen1(age: Int): String {
    val ageGroup = when (age) {
        10 -> "CHILD"
        in 10..16 -> "Teen age"
        else -> "OLD"
    }
    return ageGroup
}

val checkWhenL = { age: Int ->
    val ageGroup = when (age) {
        10 -> "CHILD"
        in 10..16 -> "Teen age"
        else -> "OLD"
    }
    ageGroup
}

//TODO COLLECTION
fun checkCollection() {

    //immutable
    val arrayMix = arrayOf("Azhar", 12, true)
    val arrayInt = intArrayOf(12, 33, 44)
    val arrayBoolean = booleanArrayOf(true, false, true)
    println(arrayMix.joinToString())
    println(arrayInt.joinToString())
    println(arrayBoolean.joinToString())

    val listMix = listOf(1, "azhar", true)
    val setMix = setOf(1, 1, "azhar", true, true)
    val mapMix = mapOf(Pair(1, "azhar"), Pair("id", 9), Pair(true, "yes"))

    println(listMix.joinToString())
    println(setMix.joinToString())
    println(mapMix)

    val listInt = listOf<Int>(1, 3, 4)
    val setBoolean = setOf<Boolean>(true, false, true, true)
    val map = mapOf<String, Int>(Pair("1", 1), Pair("id", 9), Pair("true", 2))

    println(listInt.joinToString())
    println(setBoolean.joinToString())
    println(map)

    //mutable
    val listMixMutable = mutableListOf(1, "azhar", true)
    val setMixMutable = mutableSetOf(1, 1, "azhar", true, true)
    val mapMixMutable = mutableMapOf(Pair(1, "azhar"), Pair("id", 9), Pair(true, "yes"))

    println(listMixMutable.joinToString())
    println(setMixMutable.joinToString())
    println(mapMixMutable)

    val listIntMutable = mutableListOf<Int>(1, 3, 4)
    val setBooleanMutable = mutableSetOf<Boolean>(true, false, true, true)
    val mapMutable = mutableMapOf<String, Int>(Pair("1", 1), Pair("id", 9), Pair("true", 2))

    println(listIntMutable.joinToString())
    println(setBooleanMutable.joinToString())
    println(mapMutable)

}

fun checkForLoops() {
    for (i in 1..10)
        print(" $i")

    println()
    for (i in 10 downTo 1)
        print(" $i")

    println()
    for (i in "Languages")
        print(" $i")

    println()
    for (i in listOf("az", 22, true))
        print(" $i")

    println()
    for (i in mapOf(Pair(1, "azhar"), Pair("id", 9), Pair(true, "yes")))
        print(" ${i.value}")
}

fun checkWhileLoops() {
    println()
    var i = 0
    while (i < 10) {
        print(" $i")
        i++
    }
    println()
    do {
        print("Azhar")
        i++
    } while (i < 0)
}

fun checkFunctions() {
    println()
    name("Azhar", "Islam")
    name(last = "Islam", first = "Azhar")
    fullName(middle = "Azharul", last = "Islam", first = "Muhammad")
    fullName(middle = "Azharul", last = "Islam")
}

fun name(first: String, last: String) {
    println(first.plus(" ").plus(last))
}

fun fullName(first: String = "", middle: String, last: String) {
    println(first.plus(" ").plus(middle).plus(" ").plus(last))
}

fun checkExceptions() {
    val input =
        try {
            getExternalInputs()

        } catch (e: IOException) {
            e.printStackTrace()
            "Catch"
        } finally {
            println("You have completed the process")
        }
    println(input)
}

fun getExternalInputs(): String {
    throw IOException("Could not read external input")
}