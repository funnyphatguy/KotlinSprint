package org.example.lesson7

fun main() {

    var rangeNumbers = 0..9
    val rangeChars = 'a'..'z'

    val password =
        "${rangeChars.random()}${rangeNumbers.random()}" +
                "${rangeChars.random()}${rangeNumbers.random()}" +
                "${rangeChars.random()}${rangeNumbers.random()}"

    println("Ваш пароль $password")

}