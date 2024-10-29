package org.example.lesson12

class DayTemperaturee(
    val KelvinTempp: Int
) {
    var dayTemp: Int = KelvinTempp - 273
    val nightTemp: Int = KelvinTempp - 273
    val precipitation: Boolean = false

    init {

        println("Дневная температура: $dayTemp градусов\nНочная температура: $nightTemp градусов,\nНаличие осадок: $precipitation")
    }
}

fun main() {

    val monday = DayTemperaturee(270)
    println(monday)

}