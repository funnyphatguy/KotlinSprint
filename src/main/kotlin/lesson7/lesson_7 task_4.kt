package org.example.lesson7

fun main() {

    println("Таймер. Введите количество секунд, которые нужно засечь")
    val quantity = readln().toInt()

    for (i in quantity downTo 1) {
        Thread.sleep(1000)
        println("$i")
    }

    Thread.sleep(1000) //чтобы сообщение "время вышло" приходило не одновременно с единицей
    println("Время вышло")
}