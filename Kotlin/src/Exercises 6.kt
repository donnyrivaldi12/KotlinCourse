fun main() {
    var comparison1 = (10 < 20)
    var comparison2 = ("ATM" == "atm")
    var comparison3 = (30 == 20)
    var comparison4 = (20 != 30)
    var comparison5 = !("Tabungan" == "Rekening")
    var comparison6 = ("Atas" == "Bawah")
    var comparison7 = !(100 > 200)
    var comparison8 = !(100 < 200)
    var comparison9 = (10 >= 9)
    var comparison10 = !(10 <= 20)
    println("Boolean Comparison")
    println(comparison1)
    println(comparison2)
    println(comparison3)
    println(comparison4)
    println(comparison5)
    println(comparison6)
    println(comparison7)
    println(comparison8)
    println(comparison9)
    println(comparison10)
    println()

    var umur = 20
    var memilikiIdentitas = true
    var register1 = (umur > 17) && (memilikiIdentitas == true)
    var register2 = (umur < 17) || (memilikiIdentitas == true)
    var register3 = (umur < 17) && (memilikiIdentitas == true)
    var register4 = (umur > 17 && umur < 50) || (memilikiIdentitas == false)
    var register5 = (umur > 17) && (memilikiIdentitas == false)
    var register6 = (umur > 17) || (memilikiIdentitas == false)
    var register7 = (umur > 20) && (memilikiIdentitas == true)
    var register8 = (umur > 20) || (memilikiIdentitas == false)
    var register9 = (umur >= 20) && (memilikiIdentitas == false)
    var register10 = (umur <= 25) && (memilikiIdentitas == true)
    println("Boolean Logic")
    println(register1)
    println(register2)
    println(register3)
    println(register4)
    println(register5)
    println(register6)
    println(register7)
    println(register8)
    println(register9)
    println(register10)
    println()

    var brand1 = "Xiaomi"
    var brand2 = "Samsung"
    var string1 = (brand1 == brand2)
    var string2 = (brand1 > brand2)
    var string3 = (brand1 < brand2)
    var string4 = (brand1 >= brand2)
    var string5 = (brand1 <= brand2)
    println("String Equality")
    println(string1)
    println(string2)
    println(string3)
    println(string4)
    println(string5)
    println()

    var usia = 20
    println("If Else Expression")
    if (usia >= 20) {
        println("Anda bisa mendaftar")
    } else {
        println("Mohon maaf tunggu sampai usia anda cukup")
    }

    var jeniskelamin = "Laki-Laki"
    if (jeniskelamin == "Perempuan") {
        println("Silahkan Berbaris di sebelah kiri")
    } else {
        println("Silahkan berbaris di sebelah kanan")
    }

    var kendaraan = "sepeda"
    if (kendaraan == "sepeda") {
        println("Gunakan jalur sepeda")
    } else {
        println("Gunakan jalan raya")
    }

    var kesehatan = "Sehat"
    if (kesehatan == "Sehat") {
        println("Silahkan tetap bekerja seperti biasa")
    } else {
        println("Dimohon untuk tetap dirumah sampai seha kembali")
    }

    var kelulusan = "Lulus"
    if (kelulusan == "Lulus") {
        println("Selamat Anda Lulus")
    } else {
        println("Mohon maaf anda belum lulus")
    }
    println()

    println("If Else If Expression")
    var nilai = 75
    if (nilai > 80) {
        println("Nilai anda B")
    } else if (nilai > 70) {
        println("Nilai anda C")
    } else {
        println("Dimohon untuk Remidial")
    }

    var sepatu = "Adidas"
    if (sepatu == "Adidas") {
        println("Harganya sedang promo 50%")
    } else if (sepatu == "Nike") {
        println("Harganya sedang promo 30%")
    } else {
        println("Tidak ada diskon")
    }

    var ukuranJaket = "XL"
    if (ukuranJaket == "XL") {
        println("Stok tinggal sedikit")
    } else if (ukuranJaket == "L") {
        println("Stok cukup banyak")
    } else {
        print("stok masih banyak")
    }

    var ukuranSepatu = 44
    if (ukuranSepatu > 30) {
        println("Harganya Rp. 125.000")
    } else if (ukuranSepatu > 35) {
        println("Harganya Rp. 150.000")
    } else {
        println("Harganya Rp. 170.000")
    }

    var jumlahBeli = 10
    if (jumlahBeli > 5 && jumlahBeli <= 10) {
        println("Dapat Promo Gratis 2")
    } else if (jumlahBeli < 5) {
        println("Dapat Promo Gratis 1")
    } else {
        print("Tidak dapat promo")
    }
    println()

    println("The Meaning of Short Circuiting")
    println(
        "Jika ada dua kondisi atau lebih, maka program akan mencocokan variabel dengan kondisi pertama" +
                "jika kondisi pertama salah, maka program tidak perlu melanjutkan untuk mencocokan kondisi selanjutnya"
    )
    println()

    println("The Meaning of Scope")
    println("Library yang berisikan beberapa function yang bisa digunakan untuk mengeksekusi object dengan mudah")
    println()

    println("While Loops")
    var menghitung = 1
    while (menghitung <= 10) {
        println("Hitungan Ke- $menghitung")
        menghitung++
    }
    println()

    var hitungan = 1
    while (hitungan <= 10) {
        println("Data ke- $hitungan")
        hitungan = hitungan + 2

    }
    println()

    var genap = 0
    while (genap <= 10) {
        println("Angka Genap $genap")
        genap += 2
    }
    println()

    var nomor = 10
    while (nomor >= 0) {
        println("Nomor $nomor")
        nomor--
    }
    println()

    var nomorGanjil = 10
    while (nomorGanjil > 0){
        println("Nomor Ganjil $nomorGanjil")
        nomorGanjil -= 2
    }
    println()

    println("Do While")
    var menghitung2 = 0
    do {
        println("Perhitungan ke- $menghitung2")
        menghitung2++
    }while (menghitung2 <= 10)
    println()

    var ganjil = 1
    do {
        println("Angka Ganjil $ganjil")
        ganjil += 2
    }while (ganjil <= 10)
    println()

    var genap2 = 0
    do {
        println("Angka Genap lagi $genap2")
        genap2 += 2
    }while (genap2 <= 10)
    println()

    var nomor2 = 10
    do {
        println("Countdown $nomor2")
        nomor2--
    }while (nomor2 >= 1)
    println()

    var nomorGanjil2 = 10
    do {
        println("Countdown Ganjil $nomorGanjil2")
        nomorGanjil2 -= 2
    }while (nomorGanjil2 >= 0)
    println()

    println("Breaking out of the loops")
    var counter = 10
    while (true){
        println("Break in $counter")
        counter--
        if (counter == 0){
            break
        }
    }
}