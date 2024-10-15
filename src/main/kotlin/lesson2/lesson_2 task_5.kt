package org.example.lesson2

import kotlin.math.pow

const val FIRST_PAY = 70000

fun main() {

    val percents = 16.7
    val years = 20

    val fV = FIRST_PAY * ((percents / 100) + 1).pow(years)
    println("%.3f".format(fV))
}
