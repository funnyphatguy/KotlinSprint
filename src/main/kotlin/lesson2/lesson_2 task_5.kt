package org.example.lesson2

import kotlin.math.pow

const val FIRST_PAY = 70000

fun main() {

    val percents = 1.167
    val years = 20

    val fV = FIRST_PAY * (percents).pow(years)
    println("%.3f".format(fV))
}
