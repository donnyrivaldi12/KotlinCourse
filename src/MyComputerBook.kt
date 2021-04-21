object MyComputerBook {
    var allComputers = mutableListOf<MyComputer>()

    fun addComputer(myComputer: MyComputer){
        allComputers.add(myComputer)
    }
    fun removeComputer(myComputer: MyComputer){
        allComputers.remove(myComputer)
    }

    fun printAllComputer(){
        allComputers.forEach {
            println("${it.cName} - ${it.cBrand}")
        }
    }
}