package org.example.lesson6

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

}