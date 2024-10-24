package org.example.lesson10

const val MIN_BODY_OF_THE_PASSWORD = 4
fun main() {

    println("Введите логин:")
    val login = readln().toString()

    println("Введите пароль:")
    val password = readln().toString()

    if ((validateCheck(login) == false) || (validateCheck(password) == false))
        println("Логин или пароль недостаточно длинные")
    else println("Добро пожаловать в систему!")
}

fun validateCheck(word: String): Boolean {
    return ((word.count() > MIN_BODY_OF_THE_PASSWORD))

}