package org.example.lesson6

fun main() {

    println("Введите количество секунд, которые нужно засечь")
    var counter = readln().toInt()
    val strike = counter

    while (counter > 0) {
        println("${counter--}")
        Thread.sleep(1000)
    }
    println("Прошло секунд: $strike")
    Thread.sleep(90000000)   //Это она якобы встает на паузу. Абсолютный костыль, но как сделать по другому не понимаю.
}