//Overloading:-Same function name for different type of input
//Ex:
fun sum1(m:Int,n:Int):Int{
    return m+n
}
fun sum1(m:Int,n:Int,k:Int):Int{
    return m+n+k
}
fun main(){
    var result:Int
    println("The sum of two numbers:"+sum1(10,10))
    //call happen accordingly
    println("The sum of three numbers:"+sum1(10,10,10))

}