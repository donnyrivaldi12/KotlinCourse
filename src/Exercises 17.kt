fun main(){
    //create class
    println("Create Class")
    var myPeople = People("John", 20, "People")
    println(myPeople.theFullIdentity())
    println()
    //create subclass
    println("Create Subclass")
    val myEmployee = NewEmployee("William", 25,"Employee")
    println(myEmployee.theFullIdentity())
    myEmployee.id = 10
    println(myEmployee.id)
    println()

    //use "is" & "as"
    println("Use 'is' & 'as'")
    val myWebDeveloper = WebDeveloper("Jack",24,"Web Developer")
    myPeople = myWebDeveloper
    println(myPeople !is People)
    println(myPeople is AndroidDeveloper)
    println(myPeople as? AndroidDeveloper)
    println()

    //override the methods of superclass
    println("Override the Methods of Superclass")
    val myAndroidDeveloper = AndroidDeveloper("Paul", 30,"Android Developer")
    myAndroidDeveloper.developAnApp()
    println()

    //set the base class "abstract"
    println("Set the Base Class Abstract")
    val myDesktopDeveloper = DesktopDeveloper("Emma", 30)
    myDesktopDeveloper.sleepAt10PM()
    println()

    //create a sealed class with subtypes
    println("Create a Sealed Class with subtypes")
    val addition = Operation.Add(10)
    println(addition.execute(5, addition))
    println()

    //create secondary constructor
    println("Secondary Constructor")
    val theAndroidDeveloper = AndroidDeveloper("Female",25,"Android Developer")
    println(theAndroidDeveloper.theFullIdentity())
    println()

    //create inner class
    println("Create Inner Class")
    val newAndroidDeveloper = WebDeveloper.Skills("Javascript")
    println(newAndroidDeveloper.programmingLanguage)

}

open class People(private val name: String, private val age: Int, private val job: String){
    fun theFullIdentity()="$name $age $job"
}
open class NewEmployee(name: String, age: Int, job: String): People(name, age, job){
    var id = 0

}
open class Developer(name: String, age: Int, job: String): NewEmployee(name, age, job){
    open fun developAnApp(){
        println("An App is Created")
    }
}
class AndroidDeveloper(name: String, age: Int, job: String): Developer(name, age, job){
    val androidLanguage = arrayOf("Java", "Kotlin")
    override fun developAnApp() {
        super.developAnApp()
        println("Android is Developed")
    }
    constructor(gender: String, name: String, age: Int, job: String): this(name, age, job){
        if (gender.contains("Male")){
            println("The gender is male")
        } else if (gender.contains("Female")) {
            println("The gender is female")
        }
    }
}
class WebDeveloper(name: String, age: Int, job: String): Developer(name, age, job){
    class Skills(private val skill: String) {
        val programmingLanguage = skill
    }
}
abstract class IOSDeveloper(name: String, age: Int){
    abstract fun sleepAt10PM()
}
class DesktopDeveloper(name: String, age: Int): IOSDeveloper(name, age){
    override fun sleepAt10PM() {
        println("Desktop Developer sleep at 10 pm")
    }
}

sealed class Operation {
    class Add(val value: Int) : Operation()
    class Subtract(val value: Int) : Operation()
    class Multiply(val value: Int) : Operation()
    class Divide(val value: Int) : Operation()

    fun execute(x: Int, op: Operation) = when (op) {
        is Add -> x + op.value
        is Subtract -> x - op.value
        is Multiply -> x * op.value
        is Divide -> x / op.value
    }
}