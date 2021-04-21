fun main(){
    //create enum class
    println("Create enum class")
    for (mySport in Sport.values()){
        println("Sport #${mySport.ordinal} - ${mySport.name}")
    }
    println()

    for (myHobbies in Hobbies.values()){
        println("Hobbies No.${myHobbies.ordinal} is ${myHobbies.name}")
    }
    println()

    for (myBrand in Brand.values()){
        println(myBrand.name)
    }
    println()

    for (myLanguage in ProgrammingLanguage.values()){
        println("The Programming Language is ${myLanguage.name}")
    }
    println()

    //use properties and function
    println("Use Properties and Function")
    for (myTransportation in Transportation.values()){
        println("Transportation you can use is ${myTransportation.name} can it be personal? " +
                "${myTransportation.canPersonal}")
    }

    val randomTransportationFamous = Transportation.randomFamous()
    println("The Famous Transportation is ${randomTransportationFamous.name}")
    println()

    //use when with enum
    println("Use When with Enum")
    when(Brand.Samsung){
        Brand.Samsung -> println("Your Computer is Samsung")
        Brand.Asus -> println("Your Computer is Asus")
        Brand.Lenovo -> println("Your Computer is Lenovo")
        Brand.Macbook -> println("Your Computer is Apple")
    }

    val myProgrammer = Programmer.DeveloperWeb()
    println("Here it is my Programmer ${myProgrammer.developerName}")

}

enum class Sport{
    Boxing,
    Karate,
    TaiChi,
    Judo
}

enum class Hobbies{
    Cycling,
    Running,
    Badminton
}

enum class Brand{
    Macbook,
    Asus,
    Lenovo,
    Samsung
}

enum class ProgrammingLanguage{
    Java,
    Kotlin,
    Ruby
}

enum class Transportation(val canPersonal: Boolean){
    Car(true),
    Motorcycle(true),
    Bicycle(true),
    Bus(false);

    companion object {
        fun randomFamous(): Transportation{
            return Transportation.values()[(0..values().size).random()]
        }
    }
}

sealed class Programmer{
    class DeveloperAndroid : Programmer()
    class DeveloperWeb : Programmer()
    class DeveloperIOS : Programmer()
    class DeveloperDesktop : Programmer()
    class DeveloperGame : Programmer()

    val developerName: String
    get() = when(this){
        is DeveloperAndroid -> "Android Developer"
        is DeveloperWeb -> "Web Developer"
        is DeveloperIOS -> "IOS Developer"
        is DeveloperDesktop -> "Desktop Developer"
        is DeveloperGame -> "Game Developer"
    }
}
