package org.example.lesson9

fun main() {

    val recipe = mutableListOf("котлета", "булочка", "огурцы")
    println("В рецепте есть базовые ингредиенты:")
    recipe.forEach { it -> println(it) }
    println("Желаете добавить еще?")

    var answer = readln().lowercase()
    if (answer == "да") {
        println("Какой ингредиент вы хотите добавить?")
    } else {
        return
    }
    var ingrdient = readln().lowercase()
    recipe.add(ingrdient)
    println("Теперь в рецепте есть следующие ингредиенты:")
    recipe.forEach { it -> println(it) }
}