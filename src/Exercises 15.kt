import kotlin.properties.Delegates

fun main() {
    //create class
    println("Create Classes and Properties")
    println()

    //create property of each class
    val theAnimal = WildAnimal("Jungle")
    WildAnimal.name = "Lion"
    println("${WildAnimal.name} is live in the ${theAnimal.habitat}")
    theAnimal.newAnimal = "Tiger"
    println()

    //custom accessor
    println("Custom Accessor")
    val myComputer = NewComputer("Inspiron", "Dell")
    NewComputer.fullIdentity = "Laptop"
    println("${myComputer.cName} ${myComputer.cBrand} - ${NewComputer.fullIdentity}")
    println()

    //observe property of each class
    println("Observable Property")
    val firstJob = Job("Java Programming")
    firstJob.name = "Kotlin Programming"
    Job.salary = 1000
    println(firstJob.name)
    firstJob.newJob = true
    println(Job.salary)
    println()

    //Limitation Variable
    println("Limitation Variable")
    val theUsers = NewUsers("Daniel")
    NewUsers.salary = 10000
    println("${theUsers.name} get salary ${NewUsers.salary}/week")
    theUsers.orderedSalary = 20000
    println()

    //lazy property
    println("Create Lazy Property")
    val favColour = RgbColour("Printer Colour")
    println("My favorite colours ${RgbColour.colour} is ${favColour.type}")
    println("New Colour is ${favColour.newColour}")
    println()

    //lateinit
    println("Create Lateinit")
    myComputer.cpu ="Core i7 10th Gen"
    println(myComputer.cpu)
}

class Job(var name: String){
    companion object{
        var salary = 0
    }
    var newJob : Boolean by
            Delegates.observable(false){
                _, oldValue, newValue ->
                if (newValue){
                    salary += 1000
                }
            }
}

class NewComputer(var cName: String, var cBrand: String) {
    companion object {
        var fullIdentity: String = ""
            get() {
                print("The Computer is ")
                return field
            }
    }
//    val ram: Int = 16
//    val graphicCard: String = "RTX 3080"
//    val powerSupply: String = "1000"

    lateinit var cpu: String
}

class WildAnimal(val habitat: String) {
    companion object {
        var name: String = ""
    }
    var newAnimal: String by Delegates.observable(""){
        _, oldValue, newValue ->
        println("$name -> $newValue")
    }
}

class NewUsers(val name: String){
    companion object {
        var salary = 0
    }
    var orderedSalary by Delegates.vetoable(15000){
        _,_, newValue ->
        if(newValue > salary){
            println("You can't get salary more than this")
            false
        } else {
            true
        }
    }
}

class RgbColour(val type: String){
    companion object {
        val colour = listOf("Red", "Green", "Blue")
    }
    val newColour: String by lazy {
        "Cyan, Magenta, Yellow, Black"
    }
}