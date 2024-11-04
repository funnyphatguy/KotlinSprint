package org.example.lesson_15

//На сайте музыкального магазина есть товары двух категорий: инструменты и комплектующие к ним.
// Все товары имеют название и количество единиц на складе.
//
//Для инструментов есть возможность поиска соответствующих комплектующих.
//
//Опиши классы для категорий товаров.
// Создай общий класс для хранения общих свойств всех товаров.
// Имитируй процесс поиска текстовым сообщением «Выполняется поиск».
// Для выноса логики поиска используй интерфейс.

abstract class Goods(val name: String, val quantity: Int) {

}

interface Searcher {

    fun searchAccessories()
}

class Instruments(name: String, quantity: Int) : Goods(name, quantity), Searcher {
    override fun searchAccessories() {
        println("Выполняется поиск")
    }
}

class Accessories(name: String, quantity: Int) : Goods(name, quantity) {}

fun main() {

    val guitar = Instruments("Гитара", 2).also { it.searchAccessories() }
    val pickguard = Accessories("Пикгард", 1)

}