fun calc(n1:Double,n2:Double):Double{
    println("Enter the 1 for +,2 for -,3 for * and 4 for divide:" )
    var op:Int= readLine()!!.toInt()
    when(op){
        1->return n1+n2
        2->return n1-n2
        3->return n1*n2
        4->return n1/n2
    }
    return 0.0
}
fun main(){
    print("Enter the first number:")
    var a= readLine()!!.toDouble()
    println("Enter the second number")
    var b= readLine()!!.toDouble()
    var result=calc(a,b)
    println("The result is:$result")
}