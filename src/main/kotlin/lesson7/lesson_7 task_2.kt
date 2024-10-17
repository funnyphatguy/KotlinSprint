package org.example.lesson7

fun main() {

    var range = 1000..9999

    do {
        var passord = range.random()

        println("Ваш код авторизации: $passord")

        println("Введите код, чтобы авторизироваться")
        val userPassword = readln().toInt()

    } while (userPassword != passord)

    println("Добро пожаловать")

}