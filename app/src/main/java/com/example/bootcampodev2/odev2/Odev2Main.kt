package com.example.bootcampodev2.odev2

fun main() {
    var odev2 = Odev2()

    //iç açılar toplamı sorusu
    var result = odev2.soru1(5)
    println("İç açılar toplamı : $result")

    //gün sayısına göre maaş hesabı
    var salary = odev2.soru2(20)
    println("Alınan Maaş : $salary TL")

    //otopark süresine göre otopark ücreti
    var parkingFee = odev2.soru3(5.0)
    println("Otopark ücreti : $parkingFee TL")

    //girilen km yi mile çevirme
    var mile = odev2.soru4(10.0)
    println("Gidilen mil : $mile")

    //kenarları bilinen dikdörtgenin alan hesabı
    val area = odev2.soru5(10,15)
    println("Dikdörtgenin alanı : $area")

    //faktoriyel hesabı
    var factorial = odev2.soru6(5)
    println("Sonuç : $factorial")

    //kelimenin içinde kaç tane e harfi olduğunu bul
    var total = odev2.soru7("erdem")
    println("Kaç adet e var : $total")
}