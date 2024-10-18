package org.example.lesson8

fun main() {

    val recipe = arrayOf("булочка", "котлета", "огурцы", "салат", "лук")

    println("Введите ингридиент, который вы хотите найти:")
    val ingridient = readln().lowercase()

    when { ingridient in recipe -> println("Ингридиент $ingridient в рецепте есть")
        else -> println("Такого ингредиента в рецепте нет")
    }
}

