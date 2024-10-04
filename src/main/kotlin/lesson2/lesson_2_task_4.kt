package org.example.lesson2


fun main() {

    var chrystalOre = 7f
    var metalOre = 11f


    var chrystaOreBuff = chrystalOre / 100 * 20
    var metalOreBuff = metalOre / 100 * 20


    println("Бонусная кристалическая руда ${chrystaOreBuff.toInt()}")
    println("Бонусная железная руда ${metalOreBuff.toInt()}")
}