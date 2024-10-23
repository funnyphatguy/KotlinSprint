package org.example.lesson9

fun main() {

    println("Введите пять ингридиентов, через запятую, с пробелом")
    val ingridients = readln().toString()

    val parsing = ingridients.split(", ")
    val sortedList = parsing.sorted()

    if (parsing.size != 5) {
        println("нужно ввести именно пять элементов")
        return
    }

   println("Вы ввели:")

    sortedList.forEach { it -> println(it) }

}
