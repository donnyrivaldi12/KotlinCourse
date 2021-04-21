fun main(){
    //create interface
    println("Create Interfaces, Methods, Properties, and Default Implementation")
    val myWebDev = Web("John")
    println(myWebDev.webProgramming())

    val myIosDev = IOS("Jack")
    println(myIosDev.iosProgramming())

    val myAndroidDev = Android("Rose")
    println(myAndroidDev.androidProgramming())

    val myDesktopDev = Desktop("William")
    println(myDesktopDev.desktopProgramming())

    //Default implementation
    val myFullDev = FullStack("Alex")
    println(myFullDev.fullStackProgramming())
    println()

    //inherit from another interface and implementing multiple interfaces
    println("Inherit from another interface and implementing multiple interfaces")
    val myManager = ManagerDev("Paul",25)
    myManager.developAnApp()
    println()

    //iterator interface
    println("Iterator")
    val myAnimal = listOf("Lion","Tiger","Leopard","Cat")
    val mySmartphone = mapOf(1 to "iPhone",2 to "Samsung", 3 to "Xiaomi")

    for (animal in myAnimal){
        println(animal)
    }
    println()

    for (smartphone in mySmartphone.values){
        println(smartphone)
    }
    println()

    //comparable
    println("Comparable")
    val boxer1 = Boxer(100)
    val boxer2 = Boxer(120)
    println(boxer1.compareTo(boxer2))
}

interface WebDev{
    fun webProgramming(): String
}
class Web(private val name:String) : WebDev{
    override fun webProgramming():String {
        return "$name is Web Programmer"
    }
}

interface IOSDev{
    fun iosProgramming(): String
}
class IOS(private val name: String) : IOSDev{
    override fun iosProgramming(): String {
        return "$name is IOS Programmer"
    }
}

interface AndroidDev{
    fun androidProgramming(): String
}
class Android(private val name:String) : AndroidDev{
    override fun androidProgramming(): String {
        return "$name is Android Programmer"
    }
}

interface DesktopDev{
    fun desktopProgramming(): String
}
class Desktop(private val name: String): DesktopDev{
    override fun desktopProgramming():String {
        return "$name is Desktop Programmer"
    }
}

interface FullDev{
    fun fullStackProgramming(): String{
        return "He is Full Stack Programmer"
    }
}
class FullStack(private val name: String): FullDev{
    override fun fullStackProgramming(): String {
        super.fullStackProgramming()
        return "$name is Full Stack Programmer"
    }
}

interface Manager{
    val name: String
    val age: Int
}
interface ManagerIDEA: Manager{
    val mainLanguage: String
    val mainPlatform: String
    fun developAnApp()
}
class ManagerDev(private val managerName: String, private val managerAge: Int): ManagerIDEA, Manager{
    override val name: String
        get() = managerName

    override val age: Int
        get() = managerAge

    override val mainLanguage: String
        get() = "Kotlin"

    override val mainPlatform: String
        get() = "Android"

    override fun developAnApp() {
        println("$managerName $managerAge is developing an $mainPlatform App with $mainLanguage")
    }
}

class Boxer(private val punchPower:Int): Comparable<Boxer>{
    override fun compareTo(other: Boxer): Int {
        return when{
            punchPower > other.punchPower -> 1
            punchPower == other.punchPower -> 0
            else -> -1
        }
    }
}