package org.example.lesson_16

//На игральном кубике может выпасть одно число от 1 до 6.
//
//Создай класс кубика, в котором будет проинициализировано одно поле со случайным числом.
// Единственный способ узнать это число – вызвать специальный метод, который напечатает информацию в консоль.

class Cube() {
    private val number = (1..6).random()

    fun result() = println("Результат броска кубика $number")
}

fun main() {

    val numberResult = Cube().result()

}


