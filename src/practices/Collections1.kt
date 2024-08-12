package practices

val array = arrayOf("Array", true, 8.9)
val arrayInt = intArrayOf(1, 34, 44)
val arrayDouble = doubleArrayOf(2.3, 44.3)
val arrayBoolean = booleanArrayOf(true, false)

val list = listOf("Azhar", "anwar", 0, true)
val listInt = listOf<Int>(2, 44, 2)
val listString = listOf<String>("2", "44", "12")
val listBoolean = listOf<Boolean>(true, false)
val set= setOf("as",true,true,"as")
val setString= setOf<String>("as","as")
val setBoolean= setOf<Boolean>(true,false,true)
val map= mapOf(Pair("name","Azhar"), Pair(1,"Index"),Pair("Boolean",true))

var listM: MutableList<Any> = mutableListOf(1, 2, "2", true)
var listMInt = mutableListOf<Int>(1, 2)
var setM: MutableSet<Any> = mutableSetOf(1, "any", true, 1)
var setMInt = mutableSetOf<Int>(1, 2, 4, 1)
var mapM:Map<Any,Any> = mutableMapOf(Pair(1,"Index"),Pair("boolean",true))
var mapMInt= mutableMapOf<String,Int>(Pair("1",1),Pair("boolean",0))
var mapMBoolean= mutableMapOf<String,Boolean>(Pair("1",true),Pair("boolean",false))

fun main() {

    listM.add("orange")
    listMInt.add(4)
    setM.add("s")
    setMInt.add(3)
    mapM.plus(Pair("Boolean",true))
    mapMInt.plus(Pair("Boolean",2))
    mapMBoolean.plus(Pair("present",true))
    println(listM)
    println(listMInt)
    println(setM)
    println(setMInt)
    println(mapM)
    println(mapMInt)
    println(mapMBoolean)

}





