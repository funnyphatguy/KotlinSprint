package org.example.lesson12

import kotlin.random.Random

class DayTemp(
    var dayTemp: Int, val nightTemp: Int, val precipitation: Boolean
) {
    override fun toString(): String {
        return "$dayTemp, $nightTemp, $precipitation"
    }
}

fun main() {

    val listOfDayTemp: MutableList<DayTemp> = mutableListOf()

    repeat(30) {
        var monthDayTemp = DayTemp(
            dayTemp = (20..30).random(),
            nightTemp = (10..20).random(),
            precipitation = Random.nextBoolean()
        )
        listOfDayTemp.add(monthDayTemp)
    }

    val averageDayTemp = listOfDayTemp.map { it.dayTemp }.average()
    val averageNightTemp = listOfDayTemp.map { it.nightTemp }.average()
    val averagePrecipitation = listOfDayTemp.filter { it.precipitation }.size

    println(String.format("Средняя температура днем: %.1f", averageDayTemp))
    println(String.format("Средняя температура ночью: %.1f", averageNightTemp))
    println("Количество дней с осадками:$averagePrecipitation")

}


