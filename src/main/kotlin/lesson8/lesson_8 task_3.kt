package org.example.lesson8

fun main() {

    val recipe = arrayOf("булочка", "котлета", "огурцы", "салат", "лук")

    println("Введите ингридиент, который вы хотите найти:")
    val ingridient = readln().lowercase()

    for (a in recipe)
        if (ingridient == a) {println("Ингридиент $ingridient в рецепте есть")
            return
        }
    println("Такого ингредиента в рецепте нет")

}

