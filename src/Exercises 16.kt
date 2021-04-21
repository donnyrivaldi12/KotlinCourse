fun main(){
    //create classes
    println("Create Classes")
    val newEmployee = Employee("John")
    newEmployee.salary= 1000
    println("${newEmployee.name} have salary ${newEmployee.salary}/month")
    println()

    //create methods
    println("Create 2 Methods")
    val myCar = Car()
    myCar.everyCar.add(0,"Tesla")
    myCar.everyCar.remove("Ford")
    println(myCar.everyCar.joinToString())
    println()

    //using this keyword
    println("Using 'This' Keyword")
    val mySmartphone = Smartphone("iPhone 8")
    val myApp = Application("Instagram")
    mySmartphone.installApp(myApp)
    println()

    //create object method
    println("Create object method")
    println(MyMath.giveMeTheNumber(20))
    println()

    //extension method
    println("Extension Methods")
    val theNumber = MyMath(10)
    println(theNumber.isItODD())
    println()

    //companion object extension
    println("Companion Object Extension")
    println(MyMath.giveMeTheMaxValue(5,10))
}
class Employee(val name: String){
    var salary = 0
}

class Car(){
    val everyCar = mutableListOf("Ford","Ferrari","Lamborghini")
}

//class CollegeStudent() {
//    var name = "Donny"
//    var semester = "6"
//    var ipk = 3.95
//}

class Smartphone(val type: String){
    fun installApp(app: Application){
        println("${app.name} is Installed on ${this.type}")
    }
}

class Application(val name: String){

}
fun MyMath.Companion.giveMeTheMaxValue(firstNum: Int, secondNum: Int): Int{
    return Math.max(firstNum,secondNum)
}
class MyMath(val number: Int) {
    companion object {
        fun giveMeTheNumber(number: Int): Int {
        return Math.sqrt(number.toDouble()).toInt()
        }
    }
}

fun MyMath.isItODD() : Boolean {
    return number % 2 == 0
}