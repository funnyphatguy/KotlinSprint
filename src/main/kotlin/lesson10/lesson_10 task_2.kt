package org.example.lesson10

fun main() {

    println("Введите логин:")
    val login = readln().toString()

    println("Введите пароль:")
    val password = readln().toString()

    validation(login, password)
}

fun validation(word: String, password: String) {
    if ((word.count() < 4) || (password.count() < 4)) println("Логин или пароль недостаточно длинные")
}