package org.example.lesson_17

import java.awt.List

//Класс описывает пользователя и хранит свойства логин и пароль (без инициализации по умолчанию).
//
//- при попытке изменить пароль, в консоль должно выводиться «Вы не можете изменить пароль».
//- при попытке прочитать пароль – вместо символов должны отображаться звездочки (по количеству символов пароля).
//- при изменении логина в консоли должно печататься сообщение об успешной смене логина.
//
//Создай пользователя с произвольными данными и протестируй изменение логина и пароля. Вся реализация должна быть на сеттерах и геттерах.

class User(login: String, password: String) {

    var login = login
        set(value) {
            field = value
            println("Логин успешно изменен")

        }

    var password = password
        set(value) {
            if (value != field) println("Вы не можете изменить пароль")
        }
        get() {
            val qual: Int = field.length
            val starPassword = List(qual) { "*" }
            return starPassword.joinToString("")
        }
}

fun main() {

    val user = User("Алешка", "dt4t")
    println(user.login)
    user.login = "Петька"
    println(user.login)
    println(user.password)
    user.password = "321!"
}