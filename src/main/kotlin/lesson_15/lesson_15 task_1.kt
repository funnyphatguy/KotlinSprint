package org.example.lesson_15

//В мобильной игре есть разные существа. Напиши интерфейсы для летающих и плавающих существ.
//
//- создай интерфейсы с методами передвижения для: карась, чайка, утка;
//- создай для каждого существа классы, реализующие соответствующие интерфейсы;
//- выведи сообщения в консоль, о том как они могут передвигаться.

interface Fish {

    fun fishMoving()
}

interface Bird {
    fun birdMoving()
}

class Carp() : Fish {
    override fun fishMoving() {
        println("Рыба плавает")
    }
}

class Seagull() : Bird {
    override fun birdMoving() {
        println("Чайка летает")
    }
}

class Duck() : Bird {
    override fun birdMoving() {
        println("Утка летает")
    }
}


fun main() {

    val duck = Duck().also { it.birdMoving() }

    val seagull = Seagull().also { it.birdMoving() }

    val carp = Carp().also { it.fishMoving() }

}