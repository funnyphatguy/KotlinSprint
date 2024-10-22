package org.example.lesson9

fun main() {

    val recipe = mutableListOf<String>()

    println("Введите пять ингридиентов:")

    for (i in 0..4) {
        var ingridient = readln()
        recipe.add(ingridient)

        if (recipe.size != recipe.distinct().size) {
            println("Имеется повтор")
            break
        }
    }
    recipe.sort()
    val firstWordCapitalizeChar = recipe[0].replaceFirstChar { it.uppercase() }
    val result = listOf(firstWordCapitalizeChar) + recipe.drop(1)
    println(result.joinToString(", "))

}
