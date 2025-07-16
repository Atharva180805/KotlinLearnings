package `logical programs`

fun main() {
    val a: String = "noon"
    var isPalindrome = true

    for (i in 0 until a.length / 2) {
        val left = a[i]
        val right = a[a.length - 1 - i]
        if (left != right) {
            isPalindrome = false
            break
        }
    }

    if (isPalindrome) {
        println("String is palindrome")
    } else {
        println("String is not palindrome")
    }
}
