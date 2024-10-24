package org.example.lesson9

fun main() {

    val recipe = mutableListOf(2, 50, 15)
    println("Для одной порции нужно: яиц – 2шт., молока – 50 мл, сливочного масла – 15 гр.\nДля какого количества порций вам нужен рецепт?")
    var quantity = readln().toInt()
    var portionWord: String

    val onePortion = "порцию"
    val twoToFourPortion = "порции"
    val fiveAndMore = "порций"

    if (quantity == 1) {
        portionWord = onePortion
    } else if (quantity >= 2 && quantity < 4) {
        portionWord = twoToFourPortion
    } else {
        portionWord = fiveAndMore
    }

    val newRecipe = recipe.map { it * quantity }

    println("На $quantity $portionWord вам понадобится: яиц – ${newRecipe[0]} шт., молока – ${newRecipe[1]} мл, сливочного масла – ${newRecipe[2]} гр")
}