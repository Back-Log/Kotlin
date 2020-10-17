fun main(){
    var map=HashMap<Int,String>()
    //define hash map
     map.put(3,"My Name")
     map.put(5,"Is")
    map.put(7,"back_log")
    //to enter the value on required key
    map.put(7,"Back_Log")
    //put can be also used to update the value of any key
    for(k in map.keys) {
        println(map.get(k))
    }
    println(map.get(3))
    //print the value by key value
}
