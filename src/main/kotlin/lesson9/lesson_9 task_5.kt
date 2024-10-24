package org.example.lesson9

fun main() {

    val recipe = mutableListOf<String>()

    println("Введите пять ингридиентов:")

    for (i in 0..4) {
        var ingridient = readln()
        recipe.add(ingridient)

    }
    val recipeSet = recipe.toSet()

    println(recipeSet.joinToString(", ").capitalize())

}
