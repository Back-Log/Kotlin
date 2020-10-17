class bookstore(var name:String,var price:Int,var author:String,var year:Int){
    init {
        println("name:$name")
        fun getsum():Int{
            return this.price+this.year
        }
        //var name = "Science"
        //var price = 100
       // var author = "Pandey"
       // var year = 2019
    }
}
fun main(){
    var x=bookstore("physics",2000,"Pandey",2019)
    println(x.author+" "+x.year)
    x.price=200
    println("New Price:${x.price}")
    println("Sum of called function:"+(x.price+x.year))
}