//arrays
//sequential data , set of values.
open class arrays() {
    var number = arrayOf(1, 2, 3, 4, 5, "hello")
    fun arrayconcept() {
        println("value stored in index 0 is ${number[5]}")
    }
}

open class searching : arrays() {
    fun search() {
        var searchvalue = "hell";
        var found = false
        for (i in number.indices) {
            if (number[i] == searchvalue) {
                println("the index of search value is $i")
                found = true
                break
            }
        }
        if (found == false) {
            println("entered value not available in array")
        }
    }
}

fun sorting() {
    var arrayok = arrayOf(30, 20, 100)
    println("array in descending order")
    arrayok.sort()
    arrayok.forEach { println(it) }
    println("array in descending order")
    arrayok.sortDescending()
    arrayok.forEach { println(it) }
}

fun main() {
    var a = arrays()
    var b = searching()
    // b.search()
//a.arrayconcept()
    sorting()
}