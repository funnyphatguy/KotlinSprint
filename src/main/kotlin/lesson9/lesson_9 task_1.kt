package org.example.lesson9

fun main() {

    val recipe = listOf("котлета", "булочка", "огурцы", "салат", "лук")

    println("В рецепте есть следующие ингридиенты:")

    recipe.forEach { it -> println(it) }

}