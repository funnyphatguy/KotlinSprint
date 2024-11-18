package org.example.lesson_21

fun List<Int>.evenNumbersSum(): Int {

    val newList: MutableList<Int> = mutableListOf()

    return this.filter { it % 2 == 0 }.sum()

}

fun main() {

    val simpleList: List<Int> = listOf(4, 6, 2, 7, 9, 10, 18, 4)

    println("Сумма четных чисел в массиве: ${simpleList.evenNumbersSum()}")

}