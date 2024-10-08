package org.example.lesson4

const val SUNNY_WEATHER = true
const val OPENED_TENT = true
const val IDEAL_HUMIDITY = 20
const val WINTER = "winter"

fun main() {

    val sunnyWeatherToday = true
    val openTentToday = true
    val humidityToday = 20
    var weatherToday = "not winter"

    val check =
        (SUNNY_WEATHER == sunnyWeatherToday) and (OPENED_TENT == openTentToday) and (IDEAL_HUMIDITY == humidityToday) and (WINTER == weatherToday)
    println("Благоприятные ли условия сейчас для роста бобовых? $check")

}