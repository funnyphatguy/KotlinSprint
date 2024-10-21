package org.example.lesson9

fun main() {

    println("Введите пять ингридиентов, через запятую, с пробелом")
    val ingridients = readln().toString()

    val parsing = ingridients.split(", ")

    if (parsing.size != 5) {
        println("нужно ввести именно пять элементов")
        return
    }

   println("Вы ввели:")
   val sortedList = parsing.sorted()
    sortedList.forEach { it -> println(it) }

}
