package `logical programs`

fun main  ()
{
    var year = 2025

    if(year%4==0&&year%100!=0||year%400==0){
        println("$year is a leap year")
    }
    else
    {
        println("$year is not a leap year")
    }
}