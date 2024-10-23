package org.example.lesson10

const val MIN_BODY_OF_THE_PASSWORD = 4
fun main() {

    println("Введите логин:")
    val login = readln().toString()

    println("Введите пароль:")
    val password = readln().toString()

    validateCheck(login)
    validateCheck(password)

}

fun validateCheck(word: String) {
    if ((word.count() < MIN_BODY_OF_THE_PASSWORD)) println("Логин или пароль недостаточно длинные")

}