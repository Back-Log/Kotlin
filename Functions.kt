

    //write function for sum of two numbers
    fun sum(n1:Int,n2:Int):Int{
        var sum=n1+n2
        return sum
    }
    fun dis(n:Int):Unit{
        println("Enterd number is:$n")
    }
    //If you don't want to return anything
    fun main(){
        print("Enter the first number:")
        var a:Int= readLine()!!.toInt()
        println("Enter the second number")
        var b= readLine()!!.toInt()
        var result=sum(a,b)
        println("The result is:$result")
        println("Enter the number you want to display:")
        var t= readLine()!!.toInt()
        dis(t)
    }

