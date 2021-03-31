fun main(){
    //integer array
    println("Integer Array")
    val myNumber1 = arrayOf(1,2,3,4)
    val myNumber2 = arrayOf(5,6,7,8)
    val myNumber3 = arrayOf(9,10,11,12)
    val myNumber4 = arrayOf(13,14,15,16)
    val myNumber5 = arrayOf(17,18,19,20)
    println(myNumber1[0])
    println(myNumber2[0])
    println(myNumber3[0])
    println(myNumber4[0])
    println(myNumber5[0])
    println()

    //string array
    println("String Array")
    val myString1 = arrayOf("Ayam","Bebek","Burung")
    val myString2 = arrayOf("Kambing","Kuda","Kucing")
    val myString3 = arrayOf("Kelinci","Hamster","Marmut")
    val myString4 = arrayOf("Ikan","Paus","Hiu")
    val myString5 = arrayOf("Singa","Harimau","Macan")
    println(myString1[1])
    println(myString2[1])
    println(myString3[1])
    println(myString4[1])
    println(myString5[1])
    println()

    //Converting integer array to primitive
    println("Convert Integer Array to Primitive Array")
    val myInteger = arrayOf(1,2,3,4).toIntArray()
    println(myInteger[1])
    println()

    //Double list
    println("Double List")
    val doubleList1 = listOf(1.5, 2.0, 3.0, 4.0)
    val doubleList2 = listOf(5.5, 6.0, 7.0, 8.0)
    val doubleList3 = listOf(9.5, 10.0, 11.0, 12.0)
    val doubleList4 = listOf(13.5, 14.0, 15.0, 16.0)
    val doubleList5 = listOf(17.5, 18.0, 19.0, 20.0)
    println(doubleList1)
    println(doubleList2)
    println(doubleList3)
    println(doubleList4)
    println(doubleList5)
    println()

    //mutable list
    println("Mutable List")
    val mutableList1 = mutableListOf("Ayam","Bebek","Burung")
    val mutableList2 = mutableListOf("Kambing","Kuda","Kucing")
    val mutableList3 = mutableListOf("Kelinci","Hamster","Marmut")
    val mutableList4 = mutableListOf("Ikan","Paus","Hiu")
    val mutableList5 = mutableListOf("Singa","Harimau","Macan")
    println(mutableList1)
    println(mutableList2)
    println(mutableList3)
    println(mutableList4)
    println(mutableList5)
    println()

    //access the element of list
    println("Access the Element of List")
    println(mutableList1[2])

    //use properties and methods
    println("Using Properties and methods")
    if (mutableList1.isEmpty()){
        println("Sorry the list is empty")
    } else {
        println("The list is not empty, you can continue")
    }
    if (mutableList1.size > 2){
        println("Continue")
    } else {
        println("Sorry, you have to stop")
    }
    println(mutableList1.first())
    println(mutableList1.last())
    println()

    //indexing
    println("Using Indexing")
    val items = arrayOf("Table","Chair","Sofa","Bookshelf")
    println(items[2])
    println()

    //use ranges to slice list
    println("Slices by ranges")
    val animals = arrayOf("Ayam","Bebek","Burung","Kambing","Kuda","Kucing","Kelinci","Hamster","Marmut")
    val twoAnimals = animals.slice(0..1)
    println(animals.joinToString())
    println(twoAnimals.joinToString())
    println()

    //check for an element
    println("Checking an Element")
    println(isAnimalRemoved("Bebek", animals))
    println(doesAnimalExist("Ayam", animals))
    if (animals.contains("Kambing")){
        println("Kambing Exist")
    } else {
        println("Kambing does not exist")
    }
    println()

    //append elements
    val nameOfAnimals = mutableListOf("Ayam","Bebek","Burung","Kambing","Kuda","Kucing","Kelinci","Hamster","Marmut")
    nameOfAnimals.add("Elang")
    println(nameOfAnimals.joinToString())
    println()

    //insert an element to list
    println("Inserting element")
    nameOfAnimals.add(3,"Tikus")
    println(nameOfAnimals.joinToString())
    println()

    //remove element from list
    println("Removing Element")
    nameOfAnimals.remove("Ayam")
    println(nameOfAnimals.joinToString())
    println()

    //updating element
    println("Updating Elements")
    nameOfAnimals.set(0,"Rusa")
    nameOfAnimals.sort()
    println(nameOfAnimals.joinToString())

    //Iterating through a list
    println("Iterating Through a List")
    for (animalName in nameOfAnimals){
        println(animalName + "*")
    }
    println()

    for ((index, animalName) in nameOfAnimals.withIndex()){
        println("${index + 1} - $animalName")
    }
    println()

    //nullable and collection
    println("Nullable and Collection")
    var nullableString: List<String?>? = nameOfAnimals
    //nullableString = null
    println(nullableString)
    println(nullableString!![2])
    println()

    var nullableInteger: List<Int?>? = mutableListOf(10,20,30,40)
    //nullableInteger = null
    println(nullableInteger)
    println(nullableInteger!![1])
    println()

    var nullableFloat: List<Float?>? = mutableListOf(1f,2f,3f,4f)
    //nullableFloat = null
    println(nullableFloat)
    println(nullableFloat!![3])



}

fun isAnimalRemoved(animal: String, array: Array<String>): Boolean{
    return (animal !in array)
}

fun doesAnimalExist(animal: String, array: Array<String>): Boolean{
    return (animal in array)
}