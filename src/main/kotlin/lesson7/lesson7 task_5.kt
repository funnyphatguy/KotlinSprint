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
    val smallChars = 'a'..'z'

    val password = mutableListOf<Char>()
    password.add(numbers.random())
    password.add(chars.random())
    password.add(smallChars.random())

    val allChars = numbers + chars + smallChars
    for (i in 3..length)
        password.add(allChars.random())

    password.shuffle()

    println(password.joinToString(""))
}
