fun main(){
    //create singletons
    println("Create Singletons")
    val myLion = Animals("Lion","Yellow")
    val myTiger = Animals("Tiger","Orange")
    val myPanther = Animals("Panther","Black")

    AnimalBook.addAnimal(myLion)
    AnimalBook.addAnimal(myTiger)
    AnimalBook.addAnimal(myPanther)

    AnimalBook.printAllAnimal()
    println()

    //companion object
    println("Companion Object")
    val myCurrentComputer = MyComputer.createNewComputer("Inspiron","Dell")
    println("${myCurrentComputer.cName} - ${myCurrentComputer.cBrand}")

    val legionLenovo = MyComputer.createNewComputer("Legion","Lenovo")
    MyComputerBook.addComputer(myCurrentComputer)
    MyComputerBook.addComputer(legionLenovo)
    MyComputerBook.printAllComputer()
    println()

    //anonymous object
    println("Anonymous Object")
    val howMany = object : HowManyComputers{
        override fun numberOfComputers(): Int {
            return MyComputerBook.allComputers.size
        }
    }

}

interface HowManyComputers{
    fun numberOfComputers(): Int
}