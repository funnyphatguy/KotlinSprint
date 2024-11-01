package org.example.lesson14

//В компьютерной игре есть три типа кораблей: лайнер, грузовой и ледокол.
// Все корабли основаны на базовом классе лайнера, но каждый из них имеет свой функционал и дополнительные свойства.
//
//- У грузовых кораблей скорость меньше, но грузоподъемность больше.
//- У ледоколов ниже и скорость, и вместительность, но они могут колоть лёд.
//- Лайнеры могут вмещать наибольшее количество пассажиров.
//
//Спроектируй иерархию классов, задав значения по умолчанию в конструкторе базового класса.
// Отнаследованные классы должны переопределять необходимые свойства. Создай по одному экземпляру каждого типа корабля.

open class Liner(
    val speed: Int = 10,
    val capacity: Int = 10,
    val crew: Int = 10,

    )

class CargoShip() : Liner(
    speed = 8,
    capacity = 12,
    crew = 9
)

class Icebreaker(val icebreaker: Boolean = true) : Liner(
    speed = 6,
    capacity = 6,
    crew = 8,

    )