package org.example.lesson7

fun main() {

    println("Введите число больше нуля")

    var number = readln().toInt()

    var range = 0 until number

    for (i in range step 2)
        if (i == 0) continue
        else println(i)
}