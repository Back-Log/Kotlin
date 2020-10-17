fun main(){
    var arraylist=ArrayList<String>()
    arraylist.add("My")
    arraylist.set(0,"My real ")
    arraylist.add("Name is")
    //dynemic size array
    //use to add the element
    arraylist.add("Back_Log")
   for (item in arraylist) {
       println(item)
   }
    println(arraylist.get(2))
    //to get the element by index
    arraylist.set(0,"My real ")
    //change the element
    if(arraylist.contains("Back_Log"))
        //to check weather the string present or not
        println("present")
    else
        println("not present")
    // arraylist.size use to know the size of arraylist
}