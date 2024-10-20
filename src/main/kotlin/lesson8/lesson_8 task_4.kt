package org.example.lesson8

fun main() {

    val recipe = arrayOf("булочка", "котлета", "огурцы", "салат", "лук")
    println("Список ингридиентов для блюда \"бургер\":")
    for (i in recipe) println(
        "${recipe.indexOf(i) + 1}) $i"
    )
    println("Какой ингридиент вы хотите заменить?Введите номер")

    var numberForChange = readln().toInt()

    if (numberForChange > recipe.size) {
        println("Такого ингридиента нет в списке")
        return
    } else {
        println("На что вы хотите заменить?")
    }
    val newIngridient = readln().toString()

    recipe[numberForChange - 1] = newIngridient

    println("Готово! Вы сохранили следующий список:")
    for (i in recipe) println(
        "${recipe.indexOf(i) + 1}) $i"
    )
}