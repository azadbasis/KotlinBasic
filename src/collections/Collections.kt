package collections

//todo:Immutable collection

val array= arrayOf(1,2,3,"azhar",'e',2.5)
val arrayChar= charArrayOf('4','6','7','5')
val arrayInt= intArrayOf(4,6,78,5)

val list= listOf(12,"Md",3.5,7.6,true,'C')
val map= mapOf(Pair(1,"Anis"), Pair(2,"Anwar"),Pair(3,"Azhar"))
val set= setOf(2,"Azhar",true,4.67,"Azhar")

//todo: Mutable Collection
val listM= mutableListOf(2,"Azhar",'J',3.7,true)
val setM= mutableSetOf(2,"Azhar",true,4.67,"Azhar")
val mapM= mutableMapOf(Pair(1,"Anis"), Pair(2,"Anwar"),Pair(3,"Azhar"))

fun main() {
    println(array.joinToString())
    println(arrayInt.joinToString())
    println(arrayChar.joinToString())
    println(list.joinToString())
    println(map)
    println(set.joinToString())

    println(listM.joinToString())
    println(setM.joinToString())
    println(mapM)
}
