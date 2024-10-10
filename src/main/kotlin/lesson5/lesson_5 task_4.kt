package org.example.lesson5

const val REGISTRED_USER = "Zaphod"
const val REGISTRED_PASSWORD = "PanGalactic"

fun main() {

    println("Введите логин:")
    val user = readln()
    if (user != REGISTRED_USER) println("Вы не зарегестрированы в системе. Хотите зарегестрироваться?")
    else if (user == REGISTRED_USER) println("Введите пароль")

    val password = readln()
    when (password) {
        REGISTRED_PASSWORD -> println("Добро пожаловать")
        else -> println("Пароль неверный")
    }
}