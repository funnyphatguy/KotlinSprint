package org.example.lesson_20

fun main() {

    println("Введите свое имя ниже:")
    val username = readln()

    val message: () -> Unit = { println("С наступающим Новым Годом, $username") }
    message()

}