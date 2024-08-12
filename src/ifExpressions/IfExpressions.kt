package ifExpressions

var age = 34
val names: String? = "Azhar"
fun main() {

    val studentState = if (age < 19) {
        println("College student")
        "College student"
    } else if (age in 20..24) {
        println("University student")
        "University student"
    } else {
        println("Not identify")
        age
    }

    println(studentState)

    println(names?.length)
    if (names != null) {
        println(names.length)
    }
}