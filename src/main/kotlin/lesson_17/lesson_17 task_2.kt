package org.example.lesson_17

//Опиши класс для корабля в мобильной игре. Поля хранят имя, среднюю скорость и порт приписки.
//
//Имя корабля менять нельзя, при попытке перезаписать имя в консоль должно выводиться предупреждение.
//
//Создай экземпляр класса и протестируй работу.

class Ship() {
    var name: String = "Крейсер"
        set(value) {
            if (value != "Крейсер") println("Поле менять нельзя!")
        }

    val mediumSpeed: Int = 14
    val port: String = "Порт приписки"

}

fun main() {

    val ship = Ship()

    println("${ship.name}")
    ship.name = "Корабль"

}