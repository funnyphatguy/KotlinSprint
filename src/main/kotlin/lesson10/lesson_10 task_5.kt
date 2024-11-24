package org.example.lesson10

const val LOGIN = "АЛЕШКА"
const val PASSWORD = 22233004

fun generateToken(): String {

    val chars = 'a'..'z'
    val numbers = '1'..'9'
    val bigChars = 'A'..'Z'

    val token = mutableListOf<Char>()
    val overallChars = chars + numbers + bigChars

    for (i in 0..32) {
        token.add(overallChars.random())
        token.shuffle()
    }
    val stringToken = token.joinToString("")
    return stringToken
}

fun autorization(login: String, password: Int): String? {
    if (login == LOGIN && PASSWORD == password) {
        return generateToken()
    } else {
        return null
    }
}

fun getBasket(value: String?) {
    when (value) {
        is String -> println("В вашей корзине сало и пиво")
        null -> println("Неверная авторизация")
    }
}

fun main() {

    val user = autorization(LOGIN, PASSWORD)

    getBasket(user)
}