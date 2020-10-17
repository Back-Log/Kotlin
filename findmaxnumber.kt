fun main(){
    print("Enter the first number:")
    var n1:Int= readLine()!!.toInt()
    println("Enter the second number:")
    var n2:Int= readLine()!!.toInt()
    var max= if(n1>n2) n1 else n2
    println("maximum element is:$max")

}