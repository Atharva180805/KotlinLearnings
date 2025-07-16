package `conceptual programs`

fun main () {
val ab = operators ()
val b = loops()
late()
b.loop();
    var inputv = 1
    if (inputv == 1) {
        ab.add(29, 10)
    }
        else if (inputv == 2)
    {
        ab.subtraction(29, 10)
    }
    else
    {
        ab.mul(29, 10)
    }
    }

open class operators {
    fun add (num1: Int  , num2: Int) {
        var a = num1+num2
        println("Addition = $a")
    }
    fun subtraction (num1: Int  , num2: Int) {
        var a = num1-num2
    }
    fun mul (num1: Int  , num2: Int) {
        var a = num1*num2
    }
}

open class loops {
    var a : Int = 1
    var b : Int = 20
    fun loop () {
        for (i in a..b) {
            println(i)
        }
    }
}
fun late ()
{
 lateinit var atharva: String;
 atharva = "naam hai yaar mera"
    println(atharva)
}