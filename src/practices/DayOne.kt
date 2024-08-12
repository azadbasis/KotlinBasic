package practices

import java.io.IOException

//variable,null,if,when,collection,for,while,function,parameter,exception
fun main() {
    name = "Azhar"
    println("Your name is ${name ?: "No name"} and your position is $position")
    //todo null safety
//    val length= name!!.length //unsafe call
    val length = name?.length ?: -1 //safe call
    println("your name length is $length")

    //TODO IF
    checkPosition(2)
    checkPosition1(1)
//    val positions = getPosition(3)
    val positions = getPosition1(3)
    println(positions)

}

//todo: variable
//val position=2
//val position:Int=3
val position: Int? = 3

//var name="Azhar"
//var name: String = "Azhar"
var name: String? = null

//todo IF
fun checkPosition(position: Int): Unit {
    if (position == 1) {
        println("Senior")
    } else if (position == 2) {
        println("Middle")
    } else {
        println("Junior")
    }
}

fun checkPosition1(position: Int) =
    if (position == 1) {
        println("Senior")
    } else if (position == 2) {
        println("Middle")
    } else {
        println("Junior")
    }

fun getPosition(position: Int): String {
    if (position == 1) {
        return "Senior"
    } else if (position == 2) {
        return "Middle"
    } else {
        return "Junior"
    }
}

fun getPosition1(number: Int): String {
    val pos = if (number == 1) {
        "Senior"
    } else if (number == 2) {
        "Middle"
    } else {
        "Junior"
    }
    return pos
}

fun checkGrade(number: Int): Unit {
    when (number) {
        in 1..33 -> {
            println("FAIL")
        }

        in 34..45 -> {
            println("C")
        }

        in 46..55 -> {
            println("B")
        }

        in 56..65 -> {
            println("B+")
        }

        else -> {
            println("No result")
        }
    }
}

fun checkGrade1(number: Int): Unit = when (number) {
    in 1..33 -> {
        println("FAIL")
    }

    in 34..45 -> {
        println("C")
    }

    in 46..55 -> {
        println("B")
    }

    in 56..65 -> {
        println("B+")
    }

    else -> {
        println("No result")
    }
}

fun checkGrade2(number: Int): Unit = when {
    number <= 33 -> {
        println("FAIL")
    }

    number <= 45 -> {
        println("C")
    }

    number <= 55 -> {
        println("B")
    }

    number <= 65 -> {
        println("B+")
    }

    else -> {
        println("No result")
    }
}

fun getGrade1(number: Int): String {
    return when (number) {
        in 1..33 -> {
            println("FAIL")
            "FAIL"
        }

        in 34..45 -> {
            println("C")
            "C"
        }

        in 46..55 -> {
            println("B")
            "B"
        }

        in 56..65 -> {
            println("B+")
            "B+"
        }

        else -> {
            println("No result")
            "No result"
        }
    }

}

fun getGrade2(number: Int): String {
    return when (number) {
        in 1..33 -> {

            "FAIL"
        }

        in 34..45 -> {

            "C"
        }

        in 46..55 -> {

            "B"
        }

        in 56..65 -> {

            "B+"
        }

        else -> {
            "No result"
        }
    }

}

fun getGrade3(number: Int): String =
    when (number) {
        in 1..33 -> {

            "FAIL"
        }

        in 34..45 -> {

            "C"
        }

        in 46..55 -> {

            "B"
        }

        in 56..65 -> {

            "B+"
        }

        else -> {
            "No result"
        }
    }

fun getGrade4(number: Int): String {
    val grade = when (number) {
        in 1..33 -> {
            "FAIL"
        }

        in 34..45 -> {
            "C"
        }

        in 46..55 -> {
            "B"
        }

        in 56..65 -> {
            "B+"
        }

        else -> {
            "No result"
        }
    }
    return grade
}

fun immutableCollection() {
    println("=============immutableCollection==============")
    val arrayMix = arrayOf("Name", 32, true, 4.56)
    println(arrayMix.joinToString())
    val arrayInt = intArrayOf(2, 54, 6)
    println(arrayInt.joinToString())

    val listMix = listOf(2, "Azhar", 3.54, false, 'D')
    println(listMix.joinToString())
    val listInt = listOf<Int>(4, 5, 7)
    println(listInt.joinToString())
    val listString = listOf<String>("Azhar", "Anwar", "Anis")
    println(listString.joinToString())

    val setMix = setOf("AZHAR", 23, 23, true, 8.97)
    println(setMix.joinToString())
    val setInt = setOf<Int>(2, 4, 554, 44, 33, 33)
    println(setInt.joinToString())

    val mapMix = mapOf(Pair("1", "Anis"), Pair("Anwar", 45.7), Pair("Me", true))
    println(mapMix)
    val mapString = mapOf<Int, String>(Pair(1, "Anis"), Pair(2, "Anwar"), Pair(3, "Azhar"))
    println(mapString)

}

fun mutableCollection() {

    println("=============mutableCollection==============")
    val listMix = mutableListOf(2, "Azhar", 3.54, false, 'D')
    println(listMix.joinToString())
    val listInt = mutableListOf<Int>(4, 5, 7)
    println(listInt.joinToString())
    val listString = mutableListOf<String>("Azhar", "Anwar", "Anis")
    println(listString.joinToString())

    val setMix = mutableSetOf("AZHAR", 23, 23, true, 8.97)
    println(setMix.joinToString())
    val setInt = mutableSetOf<Int>(2, 4, 554, 44, 33, 33)
    println(setInt.joinToString())

    val mapMix = mutableMapOf(Pair("1", "Anis"), Pair("Anwar", 45.7), Pair("Me", true))
    println(mapMix)
    val mapString = mutableMapOf<Int, String>(Pair(1, "Anis"), Pair(2, "Anwar"), Pair(3, "Azhar"))
    println(mapString)

}

fun checkForLoop() {
    for (i in 1..10) {
        print(" $i")
    }
    println("\ndownTo")
    for (i in 10 downTo 1) {
        print(" $i")
    }
    println("\nstep")
    for (i in 10 downTo 1 step 2) {
        print(" $i")
    }

    println("\nString char")
    for (i in "Azhar") {
        print(" $i")
    }

    println("\nList string")
    for (i in listOf("Azhar", "Anwar", "Azhar")) {
        print(" $i")
    }
    println("\nSet string")
    for (i in setOf("Azhar", "Anwar", "Azhar")) {
        print(" $i")
    }
    println("\nMap string")
    for (i in mapOf(Pair(1, "Anis"), Pair(2, "Anwar"), Pair(3, "Azhar"))) {
        print(" ${i.value}")
    }
}

fun checkWhileLoop() {
    var j = 0
    while (j < 10) {
        print(" $j")
        j++
    }
    println()
    var i = 1;
    do {
        println("We are practicing do while loop ")
        i++
    } while (i < 0)
}
fun checkFunction(){
//    val name= fullName("Azharul")
   // val name= fullName("Azharul",null)
    val name= fullName(lastName = null, first = "Azharul")
    println(name)
}

fun fullName(first:String,lastName:String?="Islam")=
first.plus(" ").plus(lastName?:"")

fun checkException(){
    val input=
        try {
            getExternalInput()

        }catch (e:IOException){
            e.printStackTrace()
            "Catch"
        }finally {
            println("You have completed the process")
        }
    println(input)
}

fun getExternalInput(): String {
    throw IOException("Could not read external input")
}