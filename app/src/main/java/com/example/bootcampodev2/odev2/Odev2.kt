package com.example.bootcampodev2.odev2

class Odev2 {
    //iç açılar toplamı sorusu
    fun soru1(kenarSayısı: Int): String {
        if (kenarSayısı > 2) {
            var icAci = (kenarSayısı - 2) * 180
            return icAci.toString()
        } else {
            val sonuc = "Kenar sayısı 2'den az olamaz"
            return sonuc
        }
    }

    //gün sayısına göre maaş hesabı
    fun soru2(gun: Int): Int {
        var kacSaat = gun * 8

        if (kacSaat <= 150) {
            val maas = kacSaat * 40
            return maas

        } else {
            val mesaiSaati = kacSaat - 150
            var mesaiUcreti = mesaiSaati * 80
            val normalUcreti = 150 * 40
            val toplamMaas = mesaiUcreti + normalUcreti
            return toplamMaas
        }
    }

    //otopark süresine göre otopark ücreti
    fun soru3(saat: Double): Double {
        if (saat <= 1) {
            var ucret = 50.0
            return ucret
        } else {
            var asimSuresi = saat - 1
            var asimUcreti = asimSuresi * 10
            var toplamUcret = 50 + asimUcreti
            return toplamUcret
        }
    }

    //girilen km yi mile çevirme
    fun soru4(km: Double): Double {
        var gidilenMil = km * 0.621
        return gidilenMil
    }

    //kenarları bilinen dikdörtgenin alan hesabı
    fun soru5(kısaKenar: Int, uzunnciKenar: Int): Int {
        val alan = kısaKenar * uzunnciKenar
        return alan
    }

    //faktoriyel hesabı
    fun soru6(n: Int): Int {
        var i = n
        var faktoriyel = 1
        while (i != 0) {
            faktoriyel = faktoriyel * i
            i--
        }
        return faktoriyel
    }

    //kelimenin içinde kaç tane e harfi olduğunu bul
    fun soru7(kelime: String) : Int {
        val toplamKullanım = kelime.count { it == 'e' }

        return toplamKullanım

    }
}