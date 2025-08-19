package `conceptual programs`
fun main()
{
  var cricketers = mutableListOf("suryakumar","rohit","virat","hardik","bumrah")
    println(cricketers.size) // 5
    println(cricketers[1]) //rohit
    cricketers.remove("virat")
    cricketers.add("kohli")
    println(cricketers)//whole list

    val ex = mutableMapOf("Name" to "Atharva", "rollno." to 7,"cgpa" to 8.29)
    ex.remove("Name")
    println(ex)

}