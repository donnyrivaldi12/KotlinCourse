object AnimalBook {
    var allAnimals = mutableListOf<Animals>()

    fun addAnimal(animal: Animals){
        allAnimals.add(animal)
    }
    fun removeAnimal(animal: Animals){
        allAnimals.remove(animal)
    }
    fun printAllAnimal(){
        allAnimals.forEach {
            println(it.definition)
        }
    }
}