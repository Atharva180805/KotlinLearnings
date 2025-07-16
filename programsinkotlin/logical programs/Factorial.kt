package `logical programs`

fun main(){
   var num = 5;
    var factorial = 1;
    println("the factorial of $num is")
    for (i in num downTo 1) {
 factorial *= i
     println(factorial)
    }

}