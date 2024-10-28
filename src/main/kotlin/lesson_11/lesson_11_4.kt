package org.example.lesson_11

class Сategory(

    val name: String,
    val items: List<String>,
)

class Recipe(

    val name: String,
    val category: Сategory,
    val portionQuantity: Int,
    val items: Map<Ingridient, String>,
    val infavourites: Boolean = false,
    val cookingMethod: String,

    )

class Ingridient(
    val name: String,
    val quantity: Int,
    val infavourites: Boolean = false,
)