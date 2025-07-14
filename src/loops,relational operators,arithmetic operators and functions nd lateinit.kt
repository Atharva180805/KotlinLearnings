fun main() {
   // println("the function allah isactive")
 //   allah();
    //loop();
    //compare();
    loop()
}
fun allah() {

    // 1 fo add , 2 for mul
    var input = 1;
    var a = 1;
    var b = 10;

   if(input == 1) {

       var c = a+b;

       println("the addition of a and b is $c")
   }
    else if (input == 2)
   {
       var c = a*b;

       println("the multiplication of a and b is $c")

   }
    else
   {
     println("invalid input")
   }
}

fun loop()
{
    var a = 1;
    var b = 10;
    for (i in a..b)
    {
        println(i)
    }
}

fun compare ()
{
    var a = 3;
    var b = 10;
    val d = "ropig";
    val c = "ropig";
    println(a>b)
    println(a<b)
    println(a>=b)
    println(a<=b)
    print(c == d)

}

fun lateinit ()
{
    var a = 5
    var b = 20

    lateinit var allah : String
    allah = "god"
    println(allah)
    for( i in a..b)
    {
        println(i)
    }
}

