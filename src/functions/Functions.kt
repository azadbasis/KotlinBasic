package functions

fun permitEntrance1(age:Int):Boolean{
    return age>18
}
fun permitEntrance2(age:Int):Boolean=age>18
fun permitEntrance3(age:Int)=age>18
val permitted= ::permitEntrance1

//todo varargs

fun permitEntrance4(vararg ages:Int):Boolean=ages.any{age->age>18}
fun permitEntrance5(vararg ages:Int):Boolean=ages.any{it>18}
fun permitEntrance6(vararg ages:Int)=ages.any{it>18}

fun main() {
   println(permitEntrance1(23))
   println(permitEntrance2(23))
   println(permitEntrance3(2))
   println(permitted(23))
   println(permitEntrance4(23))
   println(permitEntrance5(3))
   println(permitEntrance6(32))
}
