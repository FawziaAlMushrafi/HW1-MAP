fun main() {
//create a map with 4 elements
    val TasksMap = mutableMapOf(
        "inst1" to "University", "inst2" to "Resturant",
        "inst3 " to "Cofee", "inst4" to "Home"
    )
    //Add one element
    TasksMap.put("inst5", "Cinema")
    println(TasksMap)
    //update element
    TasksMap.put("inst1","Academy")
    println(TasksMap)
    //Remove elemebt
    TasksMap.remove("inst2")
    println(TasksMap)

    
}