package com.example.bootcampodev2.odev2

class Odev2 {
    //iç açılar toplamı sorusu
    fun soru1(numberOfEdges: Int): String {
        if (numberOfEdges > 2) {
            var totalAngle = (numberOfEdges - 2) * 180
            return totalAngle.toString()
        } else {
            val result = "Kenar sayısı 2'den az olamaz"
            return result
        }
    }

    //gün sayısına göre maaş hesabı
    fun soru2(day: Int): Int {
        var hour = day * 8

        if (hour <= 150) {
            val salary = hour * 40
            return salary

        } else {
            val overtime = hour - 150
            var overtimeWage = overtime * 80
            val normalWage = 150 * 40
            val salary = overtimeWage + normalWage
            return salary
        }
    }

    //otopark süresine göre otopark ücreti
    fun soru3(hour: Double): Double {
        if (hour <= 1) {
            var wage = 50.0
            return wage
        } else {
            var overtime = hour - 1
            var overageFee = overtime * 10
            var total = 50 + overageFee
            return total
        }
    }

    //girilen km yi mile çevirme
    fun soru4(km: Double): Double {
        var mile = km * 0.621
        return mile
    }

    //kenarları bilinen dikdörtgenin alan hesabı
    fun soru5(shortEdge: Int, longSide: Int): Int {
        val area = shortEdge * longSide
        return area
    }

    //faktoriyel hesabı
    fun soru6(n: Int): Int {
        var i = n
        var factorial = 1
        while (i != 0) {
            factorial = factorial * i
            i--
        }
        return factorial
    }

    //kelimenin içinde kaç tane e harfi olduğunu bul
    fun soru7(word: String) : Int {
        val totalUsage = word.count { it == 'e' }

        return totalUsage

    }
}