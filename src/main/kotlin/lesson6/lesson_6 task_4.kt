package org.example.lesson6

import kotlin.random.Random

const val MIN = 1
const val MAX = 9

fun main() {

    println("Вам нужно угадать число от 1 до 9, у вас 5 попыток")

    var attempt = 5
    var counter = attempt
    val randomizer = Random.nextInt(MIN, MAX)

    while (attempt <= 5 && attempt > 0) {
        --attempt
        var number = readln().toInt()
        if (number == randomizer)
            println("Это была великолепная игра!")
        else println("Неверно, количество попыток: ${--counter}")
    }

    println("Было загадано число $randomizer")

}