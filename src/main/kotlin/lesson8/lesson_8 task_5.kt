package org.example.lesson8

fun main() {

    println("Сколько ингридиентов будет в рецепте?")
    val numberOfIngridients = readln().toInt()

    val recipe = Array(numberOfIngridients) { "" }

    println("Введите ингридиенты:")
    for (i in 0 until numberOfIngridients) {
        recipe[i] = readln()
    }
    println("Ваши ингридиенты:")
    for (ingridients in recipe) {
        println(ingridients)
    }

}