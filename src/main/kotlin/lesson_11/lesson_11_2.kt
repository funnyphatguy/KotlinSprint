package org.example.lesson_11

import org.example.lesson_11_1.User2

fun main() {

    val user3 = User2(
        id = 3,
        login = "Artem",
        password = 67497,
        email = "Artem@yandex.ru",
        bio = ""

    )
    user3.info()

    user3.bioChange()

    user3.password

    user3.passwordChange()

    user3.info()
}