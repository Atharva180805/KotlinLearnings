package `conceptual programs`

fun main(){
    var ok = readln().toInt()
    when (ok)
    {
     1-> println("monday")
        2->println("tuesday")
        3->println("wednesday")
        4->println("thursday")
        5->println("friday")
        6->println("saturday")
        7->println("sunday")
        else -> println("invalid input")
    }
}