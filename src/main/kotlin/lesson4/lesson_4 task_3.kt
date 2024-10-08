package org.example.lesson4

fun main() {

    val sunnyWeather = true
    val openTent = true
    val humidity = 20
    var winter = "not winter"

    val check = sunnyWeather and openTent and (humidity == 20) and (winter == "winter")
    println("Благоприятные ли условия сейчас для роста бобовых? $check")

}