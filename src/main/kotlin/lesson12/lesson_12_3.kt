package org.example.lesson12

import kotlin.math.roundToInt

const val KELVIN = 273.15

class DayTemperaturee(
    val KelvinTemp: Int
) {
    var dayTemp: Int = (KelvinTemp - KELVIN).roundToInt()
    val nightTemp: Int = (KelvinTemp - KELVIN).roundToInt()
    val precipitation: Boolean = false


    fun info() =
        println("Дневная температура: $dayTemp градусов\nНочная температура: $nightTemp градусов,\nНаличие осадок: $precipitation")
}

fun main() {

    val monday = DayTemperaturee(270)
    monday.info()
}