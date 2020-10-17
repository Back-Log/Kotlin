/*
operation | priorty
1-()
2-^
3-* || /
4-+ || -
 */

fun main(){
    println("Enter the first element:")
    var n1:Float?
    n1= readLine()!!.toFloat()
    println("Enter the second element:")
    val n2:Float= readLine()!!.toFloat()
    val result:Float
    result=n1+n2
    println("result is:$result")
    //$- sign is used to distiguse between string and variable
}