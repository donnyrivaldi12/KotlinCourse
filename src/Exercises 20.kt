fun main(){
    //create list
    val animalList1 = listOf("Ayam","Bebek","Burung")
    val animalList2 = listOf("Kambing","Kuda","Kucing")
    val animalList3 = listOf("Kelinci","Hamster","Marmut")
    val animalList4 = listOf("Ikan","Paus","Hiu")
    val animalList5 = listOf("Singa","Harimau","Macan")
    //access the first element
    println("Create List and Access the first element")
    println(animalList1[0])
    println(animalList2[0])
    println(animalList3[0])
    println(animalList4[0])
    println(animalList5[0])
    println()

    //create maps
    val newMap1 = mapOf(1 to "Laura", 2 to "Daniel", 3 to "Jack")
    val newMap2 = mapOf(4 to 10, 5 to 20, 6 to 30)
    val newMap3 = mapOf(7 to 5f, 8 to 6.0, 9 to 7)
    val newMap4 = mapOf(10 to 8.5, 11 to "Malaysia", 12 to 9f)
    val newMap5 = mapOf(13 to "Jogging", 14 to 'A', 15 to 50)
    println("Create Maps, Same Keys and Different type of values")
    println(newMap1)
    println(newMap2)
    println(newMap3)
    println(newMap4)
    println(newMap5)
    println()

    //extension on types with generic constraint
    println("Extension on types with generic constraint")
    println(animalList1.orderByStars())
    println()

    //generic constraint


}

fun List<String>.orderByStars() : String {
    val separator = "\n **"
    return this.joinToString(separator, separator, "\n") { it }
}

