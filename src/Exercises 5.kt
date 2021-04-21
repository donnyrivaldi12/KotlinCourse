fun main(){
    val angka1 = 10.toDouble()
    val angka2 = 20.toDouble()
    val angka3 = 30.toDouble()
    val angka4 = 40.toDouble()
    val angka5 = 50.toDouble()
    val angka6 = 60.toDouble()
    val angka7 = 70.toDouble()
    val angka8 = 80.toDouble()
    val angka9 = 90.toDouble()
    val angka10= 100.toDouble()

    println(angka1)
    println(angka2)
    println(angka3)
    println(angka4)
    println(angka5)
    println(angka6)
    println(angka7)
    println(angka8)
    println(angka9)
    println(angka10)
    println()

    val kata1 = "Saya"
    val kata2 = "Sedang"
    val kata3 = "Belajar"
    val kata4 = "Bahasa"
    val kata5 = "Pemrograman"
    val kata6 = "Kotlin"
    val kata7 = "Dengan"
    val kata8 = "Menggunakan"
    val kata9 = "IntelliJ"
    val kata10= "IDEA"

    println(kata1)
    println(kata2)
    println(kata3)
    println(kata4)
    println(kata5)
    println(kata6)
    println(kata7)
    println(kata8)
    println(kata9)
    println(kata10)
    println()
    println("Hasil Penggabungan Concatenation:")
    println("$kata1 $kata2 $kata3 $kata4 $kata5 $kata6 $kata7 $kata8 $kata9 $kata10")
    println()

    val umurKu = 20
    val pesan = "Saya Berumur $umurKu tahun"
    println(pesan)
    println()

    val xAndy : Pair<Int, Int> = Pair(10,20)
    println(xAndy)
    println(xAndy.first)
    println(xAndy.second)

    val xAndy2 : Pair<Int, Int> = Pair(20,30)
    println(xAndy2)

    val xAndy3 : Pair<Int, Int> = Pair(30,40)
    println(xAndy3)

    val xAndy4 : Pair<Int, Int> = Pair(40,50)
    println(xAndy4)

    val mixedPair = 5.8 to 7f
    val (x, y) = mixedPair
    println(x)
    println(y)
    println()

    val abc : Triple<Int, Double, Float> = Triple(10, 20.0, 30f)
    println(abc)

    val abc2 : Triple<Int, Int, Double> = Triple(40,50, 60.0)
    println(abc2)

    val abc3 : Triple<Double,Float, Double> = Triple(70.0,80f, 90.0)
    println(abc3)

    val abc4 : Triple<Float, Double, Int> = Triple(10f, 30.0, 50)
    println(abc4)

    val abc5 = Triple(20f, 40f, 60.0)
    println(abc5)

    val list1 = listOf(Triple(1, 3.0,4f), Triple(2.0,6f, 7),
        Triple(10,11f,12.8), Triple(13f, 14.0,15f),
        Triple(16,17f,18f), Triple(19.5,20f,21.4)
    )
    println(list1)
}