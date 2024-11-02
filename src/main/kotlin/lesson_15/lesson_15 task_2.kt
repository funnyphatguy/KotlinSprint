package org.example.lesson_15

//Необходимо разработать простую систему мониторинга погодных условий, которая будет собирать данные о температуре и количестве осадков.
//
//Создай абстрактный класс WeatherStationStats. Он будет служить родителем для классов-объектов погодных данных: Temperature и PrecipitationAmount.
//
//Реализуй логику имитации отправки сообщения на сервер в классе WeatherServer. Метод отправки сообщения должен принимать объект типа WeatherStationStats и,
// в зависимости от типа переданного объекта, выводить соответствующие данные.
//
//Создай по одному объекту для разных типов погодных данных и протестируй работу программы.

abstract class WeatherStationStats(val data: Double) {

    override fun toString(): String {
        return "$data"
    }
}

class Temperature(data: Double) : WeatherStationStats(data) {}

class PrecipitationAmount(data: Double) : WeatherStationStats(data) {}

interface Rec {
    fun tempReciever(temperature: Temperature) {
        println("Значение температуры: ${temperature.data}")
    }

    fun PrecipitationReciever(precipitationAmount: PrecipitationAmount) {
        println("Значение осадков: ${precipitationAmount.data}")
    }

}

class WeatherServer() : Rec {
    override fun tempReciever(temperature: Temperature) {
        super.tempReciever(temperature)

    }

    override fun PrecipitationReciever(precipitationAmount: PrecipitationAmount) {
        super.PrecipitationReciever(precipitationAmount)
    }
}

fun main() {

    val temperature = Temperature(data = 14.6)

    val server = WeatherServer().tempReciever(temperature)

}