package org.example.lesson12

import kotlin.math.roundToInt

const val KELVIN = 273.15

class DayTemperaturee(
    kelvinDayTemp: Int,
    kelvinNightTemp: Int,
) {
    var dayTemp: Int = (kelvinDayTemp - KELVIN).roundToInt()
    val nightTemp: Int = (kelvinNightTemp - KELVIN).roundToInt()
    val precipitation: Boolean = false


    fun info() =
        println("Дневная температура: $dayTemp градусов\nНочная температура: $nightTemp градусов,\nНаличие осадок: $precipitation")
}

fun main() {

    val monday = DayTemperaturee(275, kelvinNightTemp = 270)
    monday.info()
}