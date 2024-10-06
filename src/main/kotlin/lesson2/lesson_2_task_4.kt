package org.example.lesson2

const val BUFF = 20

fun main() {

    val chrystalOre = 7f
    val metalOre = 11f

    val chrystaOreBuff = chrystalOre / 100 * BUFF
    val metalOreBuff = metalOre / 100 * BUFF

    println("Бонусная кристалическая руда ${chrystaOreBuff.toInt()}")
    println("Бонусная железная руда ${metalOreBuff.toInt()}")
}