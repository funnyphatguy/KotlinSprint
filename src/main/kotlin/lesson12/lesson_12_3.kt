package org.example.lesson12

class DayTemperaturee(
    val KelvinTemp: Int
) {
    var dayTemp: Int = KelvinTemp - 273
    val nightTemp: Int = KelvinTemp - 273
    val precipitation: Boolean = false


    fun info() =
        println("Дневная температура: $dayTemp градусов\nНочная температура: $nightTemp градусов,\nНаличие осадок: $precipitation")
}

fun main() {

    val monday = DayTemperaturee(270)
    monday.info()
}