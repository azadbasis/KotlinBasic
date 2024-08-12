package whenExpressions

val age = 46
fun main() {
    when (age) {
        0 -> {
            println("There is no age")

        }

        in 10..20 -> {
            println("Teen age")
        }

        else -> {
            println("There is over age!")
        }
    }
    val state = when (age) {
        0 -> {
            println("There is no age")
            "No age"
        }

        in 10..20 -> {
            println("Teen age")
            "Teen"
        }
        //custom operation
        21 + 25 -> {
            println("Slightly over")
            "Slightly Over"
        }

        else -> {
            println("There is over age!")
            "Over"
        }
    }
    println("Your age is: $state")



    when {
        age == 0 -> {
            println("There is no age")

        }

        age <= 20 -> {
            println("Teen age")
        }

        else -> {
            println("There is over age")
        }
    }

    val ageState = when {
        age == 0 -> {
            println("There is no age")
            "NO AGE"
        }

        age <= 20 -> {
            println("Teen age")
            "TEEN AGE"
        }

        else -> {
            println("There is over age")
            "OVER AGE"
        }
    }
    println(ageState)

}