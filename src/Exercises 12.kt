fun main(){
    //lambda expression
    println("Lambda Expression")

    val additionLambda: (Int,Int) -> Int = { firstNumber: Int, secondNumber: Int ->Int
        firstNumber+secondNumber
    }
    val addResult = additionLambda(4,5)
    println(addResult)

    val mixedLambda: (Int, Int) -> Int = { firstNumber, secondNumber->
        firstNumber+secondNumber*2-10/2
    }
    println(mixedLambda(10,20))

    val stringLambda: (String, String) -> String = { firstString, secondString->
        "$firstString $secondString"
    }
    println(stringLambda("Saya sedang", "belajar Kotlin"))
    println()

    //shorthand syntax
    println("Shorthand Syntax")
    val substractLambda: (Int, Int)->Int = { firstNumber, secondNumber ->
        firstNumber-secondNumber
    }
    println(substractLambda(10,3))
    println()

    //lambda with one parameter
    println("Lambda with one parameter")
    val multiplyLambda = { myNumber: Int ->
        myNumber*5
    }
    println(multiplyLambda(5))

    val multiLambda: (Int) -> Int = {it * 10}
    println(multiLambda(5))

    val calculateGrade = { grade : Int ->
        when(grade) {
            in 0..40 -> "Fail"
            in 41..70 -> "Pass"
            in 71..100 -> "Great Job"
            else -> false
        }
    }
    println(calculateGrade(100))

    val textLambda = { myString: String->
        myString
    }
    println(textLambda("This is a String with Lambda one parameter"))

    val dividerLambda: (Float) -> Float = { firstNumber, ->
        firstNumber/2
    }
    println(dividerLambda(50f))
    println()

    //use 2 lambda as arguments
    println("Lambda as an arguments")
    val multiplyByLambda = { firstNumber: Int, secondNumber: Int ->
        firstNumber*secondNumber
    }
    println(multiply(10,20,multiplyFunction = multiplyByLambda))
    println(multiply(20,5,::multiplyFunction))
    println()

    //create lambda expression with meaningless return value
    println("Creating lambda expression with meaningless return value")
    val playFootball: () -> Unit = { //Unit indicates we are going to return meaningless value
        println("Play Football")
    }
    playFootball()

    val playBasketball: () -> Unit = {
        println("Play Basketball")
    }
    playBasketball()

    val wentOutside: () -> Unit = {
        println("Went Outside")
    }
    wentOutside()
    println()

    //sort arrays using lambda
    println("Sort array using lambda")
    val newArray1 = arrayOf("Whale","Shark","Squid","Jellyfish")
    val newArray2 = arrayOf(1,5,9,4,8,2,3,7,6)
    println(newArray1.sortedWith(compareBy({it.length})))
    println(newArray2.sortedWith(compareBy({it})))
    println()

    //create collection and iterate over them using lambdas
    println("Create collection and iterate over them using lambdas")
    val ages = arrayOf(2,15,19,20,18,27,25,35)
    println(ages.filter{
        it >= 18
    })

    val oddNumber = arrayOf(1,3,5,7,9,11,13,15)
    val evenNumber= oddNumber.map { it * 2 }
    println(evenNumber.joinToString())

    val oddNumberString = oddNumber.map { it.toString() }
    println(oddNumberString.joinToString())

    val randomValue = arrayOf("Chicken","20","Table")
    val integerRandomValue = randomValue.map {
        it.toIntOrNull()
    }
    println(integerRandomValue.joinToString())

    val oddNumberSum = oddNumber.fold(0, { firstNumber, secondNumber ->
        firstNumber+secondNumber
    })
    println(oddNumberSum)
}

fun multiply(fn: Int, sn: Int, multiplyFunction: (Int, Int) -> Int) : Int {
    val multiplyResult = multiplyFunction(fn, sn)
    return multiplyResult
}

fun multiplyFunction(fn: Int, sn: Int) = fn * sn

