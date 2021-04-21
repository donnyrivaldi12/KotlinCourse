class MyComputer private constructor(val cID: Int, val cName: String, val cBrand: String){
    companion object {
        var currentComputerID = 0

        fun createNewComputer(cName: String,cBrand: String): MyComputer {
            currentComputerID+=1
            return MyComputer(currentComputerID, cName, cBrand)
        }
    }
}