fun fact(n:Int):Double{
    if(n==0 ||n==1)
        return 1.0
    else
        return n*fact(n-1)
}
fun main() {
    print("Enter The number:")
    var x:Int=readLine()!!.toInt()
    var result=fact(x)
    println("Factorial of "+x+" is :"+result)
}