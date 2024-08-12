package namedArgumentDefaultParameter

fun concat(texts:List<String>,separator:String=", ")=texts.joinToString(separator)


fun main() {
  val concatText=  concat(listOf("Kotlin","Java","Dart"))
  println(concatText)

   //todo: Named argument help to use parameter any order
    val concatText1=  concat(separator = ": ", texts = listOf("Kotlin","Java","Dart"))
    println(concatText1)

    //todo: default parameter helps to avoid to create new function for overLoading
    val concatText2=  concat(listOf("Kotlin","Java","Dart")," - ")
    println(concatText2)

}