package org.example.lesson12

class DayTemperature(
    var dayTemp: Int,
    var nightTemp: Int,
    var precipitation: Boolean
) {

    fun info() =
        println("Дневная температура - $dayTemp градусов\nНочная температура - $nightTemp градусов,\n$precipitation")
}

fun main() {

    val monday = DayTemperature(dayTemp = 6, nightTemp = 4, precipitation = true)
    monday.info()

    val friday = DayTemperature(dayTemp = 5, nightTemp = 3, precipitation = true)
    friday.info()

}