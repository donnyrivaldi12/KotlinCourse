fun main(){
    //closed range
    val newCloseRange1 = 0..10
    val newCloseRange2 = 11..20
    val newCloseRange3 = 21..30
    val newCloseRange4 = 31..40
    val newCloseRange5 = 41..50
    println("ClosedRange")
    println(newCloseRange1)
    println(newCloseRange2)
    println(newCloseRange3)
    println(newCloseRange4)
    println(newCloseRange5)
    println()

    //half open range
    val newHalfOpenRange1 = 0 until 10
    val newHalfOpenRange2 = 11 until 20
    val newHalfOpenRange3 = 21 until 30
    val newHalfOpenRange4 = 31 until 40
    val newHalfOpenRange5 = 41 until 50
    println("Half-Open Range")
    println(newHalfOpenRange1)
    println(newHalfOpenRange2)
    println(newHalfOpenRange3)
    println(newHalfOpenRange4)
    println(newHalfOpenRange5)
    println()

    //for loops
    println("For Loops")
    var additionLoops = 1
    for (i in 1..5){
        additionLoops += 2
    }
    println(additionLoops)
    println()

    var substractLoops = 10
    for (i in 1 until 5){
        substractLoops -= 1
    }
    println(substractLoops)
    println()

    var mixedLoops = 5
    for (i in 1..5){
        mixedLoops += 1 * 2
    }
    println(mixedLoops)
    println()

    var multiplyLoops = 2
    for (i in 1..5){
        multiplyLoops *= 5
    }
    println(multiplyLoops)
    println()

    var divisionLoops = 10
    for (i in 1..3){
        divisionLoops /= 2
    }
    println(divisionLoops)
    println()

    var myNumber = 2
    for (i in 0..10 step 2){
        myNumber *= 2
    }
    println(myNumber)
    println()

    for (c in 'a'..'k') {
        print("$c ")
    }
    println()

    for (c in 'k' downTo 'a') {
        print("$c ")
    }
    println()
    println()

    for (i in 1..10 step 2){
        println(i)
    }
    println()

    for (i in 10 downTo 0 step 2){
        println(i)
    }
    println()

    //repeat
    println("Repeat")
    repeat(5){
        println("Hello World")
    }
    println()

    repeat(3){ index ->
        println("Repeat index - $index")
    }
    println()

    repeat(5) { i ->
        println("This line will be printed 5 times")
        println("We are on the ${i + 1}. loop iteration")
    }
    println()

    repeat(5){i ->
        println("Repeat ${i + 1} Times")
    }
    println()

    var evenNumber = 0
    repeat(5){
        evenNumber += 2
        println("Even Number - $evenNumber")
    }
    println()

    //labeled statement
    println("Labeled Statement")
    for (i in 0..10){
        if (i % 2 == 0){
            continue
        }
        println(i)
    }
    println()

    //when expression
    val age = 20
    when(age){
      20 -> println("You can register")
        else -> println("You can't register")
    }
    println()

    val myNumber1 = 1
    when (myNumber1) {
        1 -> println("x = 1")
        2 -> println("x = 2")
        else -> println("x is neither 1 nor 2")
    }
    println()

    when (myNumber1) {
        0, 1 -> println("x = 0 or x = 1")
        else -> println("otherwise")
    }
    println()

    val positive = 1
    when (positive) {
        1, 2, 3 -> println("n is a positive integer less than 4.")
        0 -> println("n is zero")
        -1, -2 -> println("n is a negative integer greater than 3.")
    }
    println()

    val rangeNumber = 100
    when (rangeNumber) {
        in 1..10 -> println("A positive number less than 11.")
        in 10..100 -> println("A positive number between 10 and 100")
    }
    println()

    val dayOfWeek = 3
    when (dayOfWeek) {
        1 -> println("monday")
        2 -> println("tuesday")
        3 -> println("wednesday")
        4 -> println("thursday")
        5 -> println("friday")
        6 -> println("saturday")
        7 -> println("sunday")
        else -> println("invalid day")
    }
    println()

    val dayInWeek = 5
    when (dayInWeek){
        1,2,3,4,5 -> println("weekday")
        6,7 -> println("weekend")
        else -> println("wrong value")
    }
    println()

    val agePerson = 40
    when (agePerson) {
        in 0..14 -> println("children")
        in 15..24 -> println("youth")
        in 25..64 -> println("adults")
        in 65..120 -> println("seniors")
        in 120..130 -> println("unlikely age")
        else -> println("wrong age value")
    }
    println()

    val variable: Any = 23
    when (variable) {
        is Int -> println("It is an integer")
        is String -> println("It is a string")
        is Double -> println("It is a Double")
        is Float -> println("It is a Float")
        else -> println("Unknown Value")
    }
    println()

    val character = 'A'
    when(character){
        'A' -> println("A is a Vowel")
        'E' -> println("E is a Vowel")
        'I' -> println("I is a Vowel")
        'O' -> println("O is a Vowel")
        'U' -> println("U is a Vowel")
        else -> println("$character is a Consonant")
    }
    println()

    //returning value
    println("Returning Value")
    val grade = 'A'
    val description: String = when(grade){
        'A' -> "A is Perfect"
        'B' -> "B is Great"
        'C' -> "C is Good"
        'D' -> "D is Bad"
        'E' -> "E is Very Bad"
        else -> "Unknown Grade"
    }
    println(description)
    println()

    val variableType: Any = 23
    val desc: String = when (variableType) {
        is Int -> "It is an integer"
        is String -> "It is a string"
        is Double -> "It is a Double"
        is Float -> "It is a Float"
        else -> "Unknown Value"
    }
    println(desc)
    println()

    val ageSomeone = 40
    val theyAge: String = when (ageSomeone) {
        in 0..14 -> "children"
        in 15..24 -> "youth"
        in 25..64 -> "adults"
        in 65..120 -> "seniors"
        in 120..130 -> "unlikely age"
        else -> "wrong age value"
    }
    println(theyAge)
    println()

    val positiveValue = 1
    val numberType: String = when (positiveValue) {
        1, 2, 3 -> "n is a positive integer less than 4."
        0 -> "n is zero"
        -1, -2 -> "n is a negative integer greater than 3."
        else -> "Value Unknown"
    }
    println(numberType)
    println()

    val numberOfDay = 3
    val nameOfDay: String = when (numberOfDay) {
        1 -> "monday"
        2 -> "tuesday"
        3 -> "wednesday"
        4 -> "thursday"
        5 -> "friday"
        6 -> "saturday"
        7 -> "sunday"
        else -> "invalid day"
    }
    println(nameOfDay)
    println()

    //advanced when expression
    val score = 80
    val descScore: String = when(score){
        in 0..30 -> "Bad Score"
        in 31..50 -> "Not Bad"
        in 51..70 -> "Good"
        in 71..90 -> "Very Good"
        in 91..100 -> "Great"
        else -> "Unknown Score"
    }
    println(descScore)
    println()

    val number = 78
    val descNumber: String = when(number) {
        in 1..9 -> "$number is a single digit number"
        in 10..99 -> "$number is a two digit number"
        in 100..999 -> "$number is a three digit number"
        else -> "$number has more than three digits"
    }
    println(descNumber)
    println()

    val age1 = 20
    when(age1) {
        in 1..17 -> {
            val num = 18 - age1
            println("You will be eligible for voting in $num years")
        }
        else -> println("You are eligible for voting")
    }
    println()
}