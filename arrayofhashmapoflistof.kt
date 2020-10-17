fun main(){
    var list= listOf(1,4,6)
    var map= hashMapOf(1 to "BAck",2 to "log")
    var arr= arrayListOf("Back_","Log")
    map.put(3,"Welcome")
    map.get(3)
    for(i in list){
        println(list)
    }
    for(i in map){
        println(map)
    }
    var list1= mutableListOf(1,2,3)
    //use to define the mutable list
    list1[0]=5
    for(i in 0..2)
    {
        println(list1[i])
    }
}