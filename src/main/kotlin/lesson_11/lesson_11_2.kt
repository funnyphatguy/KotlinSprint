package org.example.lesson_11_1


class User2(

    val id: Int,
    val login: String,
    var password: Int,
    val email: String,
    var bio: String = "расскажите о себе"

) {

    fun info() {
        println("Идентификационный номер: $id; \nЛогин: $login; \n" +
                "Пароль: $password; \n" +
                "Адрес электронной почты: $email; \n" +
                "Биография:$bio.")
    }

    fun bioChange(): String {
        println("Расскажите немного о себе:")
        bio = readln()
        return bio
    }

    fun passwordChange() {
        println("Введите пароль:")
        val tryPassword = readln().toInt()
        if (password == tryPassword) {
            println("Введите новый пароль:")
        } else {
            println("Пароль введен неверно")
            return
        }
        var newPassword = readln().toInt()
        password = newPassword
        println("Пароль успешно изменен!")

    }
}

fun main() {

    val user3 = User2(
        id = 3,
        login = "Artem",
        password = 67497,
        email = "Artem@yandex.ru",
    )

    println("Информация о пользователе:")

    user3.info()

    user3.bioChange()

    user3.password

    user3.passwordChange()

    user3.info()

}