package org.example.lesson5
import kotlin.random.Random

const val MIN_NUM = 0
const val MAX_NUM = 42

fun main() {
    println("Введите три числа от 0 до 42")
    val listOfNumber = listOf(readln().toInt(), readln().toInt(), readln().toInt())

    if (listOfNumber[0] > MAX_NUM || listOfNumber[0] < MIN_NUM
        || listOfNumber[1] > MAX_NUM || listOfNumber[1] < MIN_NUM ||
        listOfNumber[2] > MAX_NUM || listOfNumber[2] < MIN_NUM
    ) {
        println("Введите три числа от 0 до 42")
        return
    }

    val randomizer = List(3) { Random.nextInt(MIN_NUM, MAX_NUM) }

    val intersection = listOfNumber.intersect(randomizer)

    when (intersection.size) {
        0 -> println("Вы не угадали ни одного числа")
        1 -> println("Вы угадали одно число, вы выиграли утешительный приз")
        2 -> println("Вы угадали два числа и выиграли крупный приз")
        3 -> println("Вы угадали все числа и выиграли джек-пот")
    }
    println("Числа, которые вы должны были угадать: $randomizer")

}