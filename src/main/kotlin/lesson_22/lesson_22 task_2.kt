package org.example.lesson_22

class NewRegularBook(val name: String, val autor: String)

data class NewDataBook(val name: String, val autor: String)

fun main() {

    val regBook = NewRegularBook("Night Springs", "Alan Wake")

    val dataBook = NewDataBook("Departure", "Thomas Zane")

    println(regBook) // получаем строковый вывод объекта по умолчанию(т.к. обычный класс унаследован от суперкласса Any),
    // чтобы получить нормальный вид, нужно переписать метод toString и явно указать что выводить.

    println(dataBook) // в дата классе компилятор автоматически переопределяет метод toString,
    // который возвращает понятное человеку представление свойств объекта.

}