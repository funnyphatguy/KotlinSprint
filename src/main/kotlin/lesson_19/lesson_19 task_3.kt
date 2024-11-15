package org.example.lesson_19

class Spaceship() {

    open fun takingOff() {

    }

    open fun landing() {
        TODO()
    }

    open fun shooting() {

        TODO("NotImplementedError")

    }

}

fun main() {

    val ship = Spaceship().also {
//        it.takingOff()
//        it.landing()
        it.shooting()
    }

}