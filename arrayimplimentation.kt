fun main(){
    var array=Array<Int>(5){0}
    for(element in array){
        println("Enter the $element:")
        array[element]=readLine()!!.toInt()
    }
    for(element in array) {
        println("The element of array is:" + array[element])
    }
}