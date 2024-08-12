package exceptions

import java.io.IOException

fun main() {

    //todo:AVOID TO USE CHECK EXCEPTION WITH METHOD SIGNATURE
    val input = try {
        getExternalInput()
    } catch (e: IOException) {
        e.printStackTrace()
        "Catch ${e.message}"
    } finally {
        println("Finish trying to external input")
    }
    println(input)

}

fun getExternalInput(): String {
    throw IOException("Could not read external input")
}