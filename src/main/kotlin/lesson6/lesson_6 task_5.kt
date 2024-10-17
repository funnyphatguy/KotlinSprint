package org.example.lesson6

import kotlin.random.Random

fun main() {
    do {
        println("Придумайте логин:")
        var login = readln().lowercase()
        println("Придумайте пароль:")
        var password = readln().lowercase()

        println("Введите логин:")
        val loginEntered = readln().lowercase()
        println("Придумайте пароль:")
        val passwordEntered = readln().lowercase()

        if (login == loginEntered && password == passwordEntered) println("Авторизация прошла успешно")


    } while (((login != loginEntered) || password != passwordEntered))

    var attempt = 3
    var counter = attempt

    while (attempt <= 3 && attempt > 0) {
        --attempt
        var numbers = List(2) { Random.nextInt(1, 9) }

        var sum = numbers[0] + numbers[1]
        println("Докажите, что вы не бот. Сколько будет ${numbers[0]} + ${numbers[1]}? Количество попыток: ${counter--}")
        val userSum = readln().toInt()

        if (userSum == sum) {
            println("Добро пожаловать!")
            break
        } else {
            println("Неверно, попробуйте снова")
        }
    }
}



