package com.example.bootcampodev2.odev2

fun main() {
    var odev2 = Odev2()

    //iç açılar toplamı sorusu
    var sonuc = odev2.soru1(5)
    println("İç açılar toplamı : $sonuc")

    //gün sayısına göre maaş hesabı
    var maas = odev2.soru2(20)
    println("Alınan Maaş : $maas TL")

    //otopark süresine göre otopark ücreti
    var otoparkUcreti = odev2.soru3(5.0)
    println("Otopark ücreti : $otoparkUcreti TL")

    //girilen km yi mile çevirme
    var mil = odev2.soru4(10.0)
    println("Gidilen mil : $mil")

    //kenarları bilinen dikdörtgenin alan hesabı
    val alan = odev2.soru5(10,15)
    println("Dikdörtgenin alanı : $alan")

    //faktoriyel hesabı
    var faktoriyel = odev2.soru6(5)
    println("Sonuç : $faktoriyel")

    //kelimenin içinde kaç tane e harfi olduğunu bul
    var toplamKac = odev2.soru7("erdem")
    println("Kaç adet e var : $toplamKac")
}