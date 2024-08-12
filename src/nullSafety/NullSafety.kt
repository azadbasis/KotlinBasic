package nullSafety

val name="Azhar";
val name1:String?=null
fun main(){
    println( name.length)

    //todo: safe call operator
    println( name1?.length)

    //todo:unsafe call operator-use JAVA way(blindly I say that it's not null)
 //   println( name1!!.length)

    //todo:Elvas operator

    var length= name1?.length
    println("String length="+length)
    // elvas operator(?:) use to set default value  null
    length= name1?.length ?: -1
    println("String length="+length)
}