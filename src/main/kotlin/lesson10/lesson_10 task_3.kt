package org.example.lesson10

fun main() {

    println("Введите длину пароля")
    val passwordLength = readln().toInt()

    println("Ваш пароль ${toGeneratePassword(passwordLength).joinToString("")}")

}

fun toGeneratePassword(length: Int): MutableList<Char> {

    val password = mutableListOf<Char>()

    val numeral = ('0'..'9')
    val chars = ('!'..'/')
    val backspace = (' ')
    password.add(numeral.random())
    password.add(chars.random())
    password.add(backspace)
    val firstChars = numeral + chars + backspace

    for (i in 3..length)
        password.add(firstChars.random())
    password.shuffle()

    return password
}