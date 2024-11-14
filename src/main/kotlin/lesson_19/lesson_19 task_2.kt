package org.example.lesson_19

//В интернет-магазине товары делятся на несколько категорий: одежда, канцелярские товары и разное.
//
// – создай enum класс с категориями;
// – создай метод внутри enum, который вернет текстовое название категории для пользователя;
// – создай класс, описывающий товар (с полями название, id, категория), в классе должен быть метод, который выводит инфо о товаре.
// Вызови его для нескольких созданных товаров;
// – для вывода информации о товаре, для категории используй метод определения категории.

enum class Cathegory() {
    CLOTHES,
    STATIONERY,
    OTHER;

    fun getCathegory(cathegory: Cathegory) {
        when (cathegory) {
            CLOTHES -> println("Одежда")
            STATIONERY -> println("Канцелярские товары")
            OTHER -> println("Разное")
        }
    }
}

class Goods(val name: String, val id: Int, val cathegory: Cathegory) {

    fun review() {
        when (cathegory) {
            Cathegory.CLOTHES -> println("$name: пальто, рубашки, куртки (фирмы 'Бейн')")
            Cathegory.STATIONERY -> println("$name товары: ручки, бумага, карандаши")
            Cathegory.OTHER -> println("$name: стулья, кресла, столы")
        }

    }
}

fun main() {

    val clothes = Goods("Одежда", 3, Cathegory.CLOTHES).also { it.review() }
    val stationery = Goods("Канцелярия", 4, Cathegory.STATIONERY).also { it.review() }

}