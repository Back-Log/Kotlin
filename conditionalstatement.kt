fun main()
{
    print("enter the value:")
    var grade:Int= readLine()!!.toInt()
    if(grade>=90){
        println("Your Grade is A")
    }
    else if(grade<90){
        println("Grade is B")
    }
    else
        println("Grade is C")
    println(5<5 || 4>3)
    // || -> Or opretor
    println(10<9 && 5>0)
    // && ->and opretor
    //Let's learn how to use switch case statement in Kotlin
    println("Enter the week's number:")
    var week:Int= readLine()!!.toInt()
    when(week){
        1->print("Mondey")
        2->print("Tuesday")
        3->print("Wednesday")
        in 4..7->{
            print("day is between 4 to 7")
        }
        !in 0..7->{
            println("Invalid Syntax")
        }
        else->
            print("I don't know")

    }

}