package org.example.lesson6

fun main() {

    println("Введите количество секунд, которые нужно засечь")
    var counter = readln().toInt()

    while (counter > 0) {
        println("Осталось секунд: ${counter--}")
        Thread.sleep(1000)
    }
    println("Время вышло")
}