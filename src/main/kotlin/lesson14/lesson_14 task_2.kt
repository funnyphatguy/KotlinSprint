package org.example.lesson14

//Скопируй классы из предыдущей задачи и измени их названия для избегания конфликтов.
//
//Каждый тип корабля обладает уникальным способом погрузки:
//
//- лайнер выдвигает горизонтальный трап со шкафута;
//- грузовой корабль активирует погрузочный кран;
//- ледокол открывает ворота со стороны кормы.
//
//Реализуй методы погрузки, специфичные для каждого вида корабля.
//
//Добавь метод вывода информации о свойствах корабля и выведи информацию в консоль.

open class TheLiner(
    val name: String = "Лайнер",
    val speed: Int = 10,
    val capacity: Int = 10,
    val crew: Int = 10,
    val icebreaker: Boolean = false
) {
    open fun loadingMethod() = println("Трап выдвинут")

    open fun info() {
        println("Класс: $name \nСкорость: $speed, вместимость:$capacity, экипаж:$crew, ледокол:$icebreaker")
        loadingMethod()
    }
}

class TheCargoShip() : TheLiner(
    name = "Грузовой",
    speed = 8,
    capacity = 12,
    crew = 9
) {
    override fun loadingMethod() = println("Погрузочный кран активирован")

}

class TheIcebreaker() : TheLiner(
    name = "Ледокол",
    speed = 6,
    capacity = 6,
    crew = 8,
    icebreaker = true
) {
    override fun loadingMethod() = println("Ворота со стороны кормы открыты")
}

fun main() {

    val liner = TheLiner(name = "Лайнер").also { it.info() }

    val cargo = TheCargoShip().also { it.info() }

    val icebreaker = TheIcebreaker().also { it.info() }
}