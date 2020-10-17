//Polymorphism:- same function name ,same number of argument ,but different data type is accepting
var my_Name="BAck_Log"
//Globle variable define ,can be access from any where
fun Dis(n1:Double):Unit{
    println("Double number is: "+n1)

}
fun Dis(n1:Int):Unit{
    println("Integer number is: "+n1)

}
fun Dis(n1:String):Unit{
    //n1 is local variable
    println("String is: "+n1)

}
fun main(){
    Dis("Pratyush Pandey")
    Dis(80)
    Dis(30.000)
    //automatic call accordingly
}
