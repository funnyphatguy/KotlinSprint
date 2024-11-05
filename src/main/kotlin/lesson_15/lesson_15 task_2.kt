package org.example.lesson_15

//Необходимо разработать простую систему мониторинга погодных условий, которая будет собирать данные о температуре и количестве осадков.
//
//Создай абстрактный класс WeatherStationStats. Он будет служить родителем для классов-объектов погодных данных: Temperature и PrecipitationAmount.
//
//Реализуй логику имитации отправки сообщения на сервер в классе WeatherServer.
// Метод отправки сообщения должен принимать объект типа WeatherStationStats и,
// в зависимости от типа переданного объекта, выводить соответствующие данные.
//
//Создай по одному объекту для разных типов погодных данных и протестируй работу программы.

abstract class WeatherStationStats() {
    abstract val data: Double
}
class Temperature(override val data: Double) : WeatherStationStats() {}

class PrecipitationAmount(override val data: Double) : WeatherStationStats() {}

class WeatherServer() {
    fun sendMessage(weather: WeatherStationStats) {
        when (weather) {
            is Temperature -> println("Температура ${weather.data} градуса")
            is PrecipitationAmount -> println("Количество осадков ${weather.data} мм")
        }
    }
}

fun main() {

    val temperature = Temperature(data = 14.6)
    val precipitation = PrecipitationAmount(data = 22.0)

    val server = WeatherServer()
    server.sendMessage(temperature)
    server.sendMessage(precipitation)
}