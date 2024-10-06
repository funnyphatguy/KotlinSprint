package org.example.lesson2

const val BUFF = 0.2

fun main() {

    val chrystalOre = 7f
    val metalOre = 11f


    val chrystaOreBuff = chrystalOre * BUFF
    val metalOreBuff = metalOre * BUFF


    println("Бонусная кристалическая руда ${chrystaOreBuff.toInt()}")
    println("Бонусная железная руда ${metalOreBuff.toInt()}")
}