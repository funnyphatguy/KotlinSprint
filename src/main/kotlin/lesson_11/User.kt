package org.example.lesson_11_1

class User(

    val id: Int,
    val login: String,
    val parol: Int,
    val email: String,
)

class User2(

    val id: Int,
    val login: String,
    var password: Int,
    val email: String,
    var bio: String

) {

    fun info() {
        println("$id, $login, $password, $email. \n$bio")
    }

    fun bioChange() {
        println("Расскажите немного о себе:")
        bio = readln()
    }

    fun passwordChange() {
        println("Введите пароль:")
        val tryPassword = readln().toInt()
        if (password == tryPassword) println("Введите новый пароль:")
        var newPassword = readln().toInt()
        password = newPassword
        println("Пароль успешно изменен!")

    }
}
