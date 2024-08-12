package forLoop

fun main() {
    for (i in 1..10)
        print(" $i")

    println()
    for (i in 1..20 step 2)
        print(" $i")

    println()
    for (i in 10 downTo 1)
        print(" $i")

    println()
    for (i in 10 downTo 1 step 2)
        print(" $i")

    println()
    for (i in "Kotlin")
        print(" $i")

    println()
    val languages= listOf("JAVA","KOTLIN","DART","C","C++")
    for (i in languages)
        println("$i is a great language")
}