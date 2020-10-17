fun main()
{
    val name="Pratyush Pandey"
    println("Enter college name:")
    var college:String= readLine().toString()
    println("Enter age:")
    var x:Int?
    //?=No value in the varible
    x=null
    //store null to x
    println(x)
    var Age= readLine()
    println("Enter the value of pi:")
    var pi:Double= readLine()!!.toDouble()
    println(name)
    println(college)
    println(Age)
    println(pi)
}