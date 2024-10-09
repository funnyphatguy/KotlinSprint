package org.example.lesson5

const val REGISTRED_USER = "Zaphod"
const val REGISTRED_PASSWORD = "PanGalactic"

fun main() {

    println("Введите логин:")
    val user = readln()
    println("Введите пароль:")
    val password = readln()

    if (user == REGISTRED_USER && password == REGISTRED_PASSWORD) println("Добро пожаловать")
    else println("Вы не зарегестрированы в системе. Хотите зарегестрироваться?")

}