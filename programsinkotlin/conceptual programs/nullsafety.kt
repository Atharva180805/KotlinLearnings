package `conceptual programs`

//?. safe call operator

fun main()
{
 var name : String? = null
    name ="atharva"
    println(name?.length)

    //?: Elvis operator
    var namma: String? = null
    var length = namma?.length?:"null hai yaar"
    println(length)

    //!!. non null operator
    var namo: String? = null
    println(namo!!.length)
}