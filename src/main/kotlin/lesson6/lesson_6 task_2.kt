package org.example.lesson6

fun main() {

    println("Введите количество секунд, которые нужно засечь")
    val counter = readln().toInt()

    Thread.sleep(1000L*counter)

    println("Прошло секунд: $counter")
}