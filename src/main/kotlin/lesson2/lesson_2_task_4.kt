package org.example.lesson2

const val BUFF = 20
const val OVERALL = 100

fun main() {

    val chrystalOre = 7f
    val metalOre = 11f

    val chrystaOreBuff = chrystalOre / OVERALL * BUFF
    val metalOreBuff = metalOre / OVERALL * BUFF

    println("Бонусная кристалическая руда ${chrystaOreBuff.toInt()}")
    println("Бонусная железная руда ${metalOreBuff.toInt()}")
}