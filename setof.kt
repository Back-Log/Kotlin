fun main(){
    var set1= setOf(1,2,3,4,3,8,2)
    //In set type of data structure repeted element can be added in set only one time
    for(item in set1){
        println(item)
    }
    var set2= mutableSetOf(8,7,5,4,6)
    set2.add(1)
    //mutable set yu can add element any time
    for(item in set2){
        println(item)
    }
}