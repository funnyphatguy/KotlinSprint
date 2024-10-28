package org.example.lesson12

class Temperature() {

    var dayTemp: Int = 0
    var nightTemp: Int = 0
    var precipitation: Boolean = false

    fun info() =
        println("Дневная температура - $dayTemp градусов\nНочная температура - $nightTemp градусов,\nНаличие осадок - $precipitation")
}

fun main() {

    val monday = Temperature()
    monday.dayTemp = 7
    monday.nightTemp = 2
    monday.precipitation = false
    monday.info()

    val friday = Temperature()
    friday.dayTemp = 4
    friday.nightTemp = 1
    friday.precipitation = false
    friday.info()

}