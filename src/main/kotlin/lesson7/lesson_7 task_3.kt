package org.example.lesson7

fun main() {

    println("Введите число больше нуля")

    val number = readln().toInt()

    for (i in 0..number step 2)
        if (i == 0) continue
        else println(i)
}