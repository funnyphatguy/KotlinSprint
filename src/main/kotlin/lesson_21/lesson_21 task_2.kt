package org.example.lesson_21

fun List<Int>.evenNumbersSum(): Int {

    val newList: MutableList<Int> = mutableListOf()
    for (i in this)
        if (i % 2 == 0)
            newList.add(i)
    return newList.sum()
}

fun main() {

    val simpleList: List<Int> = listOf(4, 6, 2, 7, 9, 10, 18, 4)

    println("Сумма четных чисел в массиве: ${simpleList.evenNumbersSum()}")

}