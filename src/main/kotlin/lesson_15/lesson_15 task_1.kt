package org.example.lesson_15

//В мобильной игре есть разные существа. Напиши интерфейсы для летающих и плавающих существ.
//
//- создай интерфейсы с методами передвижения для: карась, чайка, утка;
//- создай для каждого существа классы, реализующие соответствующие интерфейсы;
//- выведи сообщения в консоль, о том как они могут передвигаться.

interface Floating {
    fun floatingMoving()
}

interface Flying {
    fun flyingMoving()
}

class Carp() : Floating {
    override fun floatingMoving() {
        println("Карась плавает")
    }
}

class Seagull() : Flying {
    override fun flyingMoving() {
        println("Чайка летает")
    }
}

class Duck() : Flying, Floating {
    override fun flyingMoving() {
        println("Утка летает")
    }

    override fun floatingMoving() {
        println("Утка плавает")
    }
}


fun main() {

    val duck = Duck().also {
        it.flyingMoving()
        it.floatingMoving()
    }

    val seagull = Seagull().also { it.flyingMoving() }

    val carp = Carp().also { it.floatingMoving() }

}