fun main(){
    //maps
    println("Creating maps")
    val newMap1 = mapOf('A' to "Chicken", 'B' to "Duck", 'C' to "Cat")
    val newMap2 = mapOf(1 to "Laura", 2 to "Daniel", 3 to "Jack")
    val newMap3 = mapOf('D' to "Indonesia", 'E' to "Amerika", 'F' to "Jepang")
    val newMap4 = mapOf(4 to "Red", 5 to "Green", 6 to "Blue")
    val newMap5 = mapOf('G' to "Cycling", 'H' to "Swimming", 'I' to "Running")
    val newMap6 = mapOf(7 to "Goose", 8 to "Fish", 9 to "Bird")
    val newMap7 = mapOf('J' to "John", 'K' to "William", 'L' to "Leona")
    val newMap8 = mapOf(10 to "Australia", 11 to "Malaysia", 12 to "Myanmar")
    val newMap9 = mapOf('M' to "Cyan", 'N' to "Magenta", 'O' to "Yellow")
    val newMap10 = mapOf(13 to "Jogging", 14 to "Video Game", 15 to "Watch Movies")
    println(newMap1)
    println(newMap2)
    println(newMap3)
    println(newMap4)
    println(newMap5)
    println(newMap6)
    println(newMap7)
    println(newMap8)
    println(newMap9)
    println(newMap10)
    println()

    //indexing
    println(newMap1)
    println("Indexing")
    println(newMap1['A'])
    println(newMap2[1])
    println()

    //properties and function
    println("Properties and Function")
    if (newMap1.isEmpty()){
        println("The map is empty")
    } else {
        println("The map is not empty")
    }
    println(newMap1.size)
    println()

    //mutable maps
    println("Mutable Maps")
    val newMutableMap1 = mutableMapOf(1 to "Goose", 2 to "Fish", 3 to "Bird")
    val newMutableMap2 = mutableMapOf('A' to "John", 'B' to "William", 'C' to "Leona")
    val newMutableMap3 = mutableMapOf(4 to "Australia", 5 to "Malaysia", 6 to "Myanmar")
    val newMutableMap4 = mutableMapOf('D' to "Cyan", 'E' to "Magenta", 'F' to "Yellow")
    val newMutableMap5 = mutableMapOf(7 to "Jogging", 8 to "Video Game", 9 to "Watch Movies")
    println(newMutableMap1)
    println(newMutableMap2)
    println(newMutableMap3)
    println(newMutableMap4)
    println(newMutableMap5)
    println()

    //add pairs
    println("Add Pairs")
    println(newMutableMap1)
    newMutableMap1.put(4, "Squirrel")
    newMutableMap1[5] = "Lion"
    println(newMutableMap1)
    println()

    //update pairs
    println("Update Pairs")
    val oldMutableMap = newMutableMap1.put(1, "Horse")
    println(newMutableMap1)
    println(oldMutableMap)
    println()

    //remove pairs
    println("Remove Pairs")
    newMutableMap1.remove(5)
    println(newMutableMap1)
    newMutableMap1.remove(4,"Squirrel")
    println(newMutableMap1)
    println()

    //iterating through maps
    println("Iterating through maps")
    val jobs = mutableMapOf(1 to "Programmer", 2 to "Designer", 3 to "Engineer")
    println(jobs)
    for ((jobsNumber, jobsName) in jobs){
        println("$jobsNumber - $jobsName")
    }
    println()

    for (jobsNumber in jobs.keys){
        println(jobsNumber)
    }

    for (jobsName in jobs.values){
        println(jobsName)
    }
    println()

    //create sets
    println("Creating Sets")
    val newSet1 = setOf("Lion","Tiger","Jaguar")
    val newSet2 = setOf('A','B','C')
    val newSet3 = setOf(1,2,3)
    val newSet4 = setOf(10.0,20.0,30.0)
    val newSet5 = setOf(5f,6f,7f)
    println(newSet1)
    println(newSet2)
    println(newSet3)
    println(newSet4)
    println(newSet5)
    println()

    //create arrays and convert to sets
    println("Create Arrays and Convert to Sets")
    val newArray1 = arrayOf("Whale","Shark","Squid","Whale")
    val newArray2 = arrayOf(1,2,3,4,1,2,3,5)
    println(newArray1.joinToString())
    println(newArray2.joinToString())
    println()

    val arraySet1 = setOf(*newArray1)
    val arraySet2 = setOf(*newArray2)
    println(arraySet1)
    println(arraySet2)
    println()

    //get set elements
    println("Getting set elements")
    println(arraySet2.joinToString())
    if (arraySet2.contains(2)){
        println("2 is exist")
    } else {
        println("2 is not exist")
    }
    if ((6 in arraySet2)){
        println("6 is exist")
    } else {
        println("6 is not exist")
    }
    println(arraySet2.first())
    println(arraySet2.last())
    println(arraySet2.elementAt(3))
    println()

    //add and remove set element
    println("Add and Remove Set Element")
    val setMutable = mutableSetOf("Employee", "Entrepreneur", "Business")

    setMutable.add("Programmer")
    println(setMutable.joinToString())

    setMutable.remove("Employee")
    println(setMutable.joinToString())

    val trueOrFalse = setMutable.remove("Businessman")
    println(trueOrFalse)
}