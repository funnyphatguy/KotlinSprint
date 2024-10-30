package org.example.lesson_11

class Сategory(

    val name: String,
    val items: List<Recipe>,
)

class Recipe(

    val name: String,
    val category: Сategory,
    val portionQuantity: Int,
    val items: List<Ingridient>,
    val infavourites: Boolean = false,
    val cookingMethod: String,

    )

class Ingridient(
    val name: String,
    val quantity: Int,
    val infavourites: Boolean = false,
)