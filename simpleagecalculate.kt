import java.util.*

fun main()
{
    print("Enter your date of birth's year:")
    var dob:Int= readLine()!!.toInt()
    //if you want read current date or year from your device
    var year:Int= Calendar.getInstance().get(Calendar.YEAR)
    //you can use Month ,day and other things
    println("Your current age is: "+(year-dob)+" ***That sit****")
}