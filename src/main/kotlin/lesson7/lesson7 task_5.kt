package org.example.lesson7

fun main() {
    println("Введите длину пароля")
    val length = readln().toInt()

    if (length < 6) {
        println("Пароль должен быть не менее 6 символов")
        return
    }

    val numbers = '0'..'9'
    val chars = 'A'..'Z'

    val password = List(length) {
        when ((0..2).random()) {
            0 -> numbers.random()
            1 -> chars.random()
            else -> chars.random().lowercase()
        }
    }

    println(password.joinToString(""))
}
