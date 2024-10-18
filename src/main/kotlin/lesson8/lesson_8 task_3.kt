package org.example.lesson8

fun main() {

    val recipe = arrayOf("булочка", "котлета", "огурцы", "салат", "лук")

    println("Введите ингридиент, который вы хотите найти:")
    val ingridient = readln().lowercase()

    if ((recipe[0] == ingridient) || (recipe[1] == ingridient)
        || (recipe[2] == ingridient) || (recipe[3] == ingridient)
        || (recipe[4] == ingridient)
    )
        println("Ингридиент $ingridient в рецепте есть")
    else println("Такого ингредиента в рецепте нет")

}

