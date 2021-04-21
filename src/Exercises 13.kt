fun main() {
    //create class
    println("Creating Class")
    val myComputer = Computer("Macbook", "Apple")
    println(myComputer.fullIdentity)
    println()

    val theUsers = Users ("Daniel")
    theUsers.salary=100000
    println("${theUsers.name} get salary ${theUsers.salary}/week")
    println()

    val favColour = Colour()
    println("My favorite colours is ${favColour.colour}")
    println()

    val student = Student()
    println("${student.name} semester ${student.semester} and her ipk is ${student.ipk}")
    println()

    //references to each classes
    println("References to each classes")
    val myAnimal = Animal()

    myAnimal.name = "Lion A"
    println(myAnimal.name)
    println()

    //use the identity operator
    println("Use the identity operator")
    if (myAnimal === myAnimal) {
        println("These two references are the same")
    } else {
        println("These two references are not the same")
    }
    println()

    //create data class
    println("Create data class")
    val iphone1 = Mobile1("Iphone")
    println(iphone1)

    val poco = Mobile1("Pocophone")
    println(poco)

    val iphoneCopy = iphone1.copy()
    println(iphoneCopy)
    println(iphone1 == poco)
    println(iphone1 === poco)
    println()

    val person1 = Person("John")
    val person2 = Person("Jack")
    person1.age = 20
    person2.age = 19
    println("${person1.name} - ${person1.age}")
    println("${person2.name} - ${person2.age}")
    println(person1 == person2)
    println(person1 === person2)
    println()

    //use DD to extract data
    println("Use DD to extract data")
    val iphone2 = Mobile2("Iphone", "Apple")
    val redmi = Mobile2("Redmi", "Xiaomi")

    val(name, brand) = iphone2
    println("$name - $brand")

    val(name2,brand2) = redmi
    println("$name2 - $brand2")
}

class Computer(var cName: String, var cBrand: String) {
    val fullIdentity: String
        get() = "$cName - $cBrand"
}

class Animal() {
    var name: String = ""
}

class Users(val name: String){
    var salary = 0
}

class Colour(){
    val colour = listOf("Red","Green","Blue")
}

class Student() {
    var name = "Lucia"
    var semester = "6"
    var ipk = 3.95
}

data class Mobile1 (val name: String)

data class Mobile2(val name: String, val brand: String)

data class Person(val name: String) {
    var age: Int = 0
}