package org.example.lesson_18

//В тамагочи есть лиса, собака и кошка. Они могут только есть и спать.
//
//Лиса ест ягоды, собака – кости, а кошка – рыбу.
// У каждого животного есть имя.
// Эти действия отображаются в консоли по такому шаблону: “[имя] -> [действие]”.
//
//– опиши эти классы, используя полиморфизм;
//– создай по одному объекту животного, сохрани их в список с принудительным указанием типа списка;
//– в цикле вызывай метод приема пищи для каждого экземпляра.

abstract class Animal(val name: String) {

    open fun toEat() {
        println("$name -> ест")
    }

    fun toSleep() {
        println("$name -> спит")
    }
}

class Dog(name: String) : Animal(name) {

    override fun toEat() {

        println("Собака по имени $name ест кости")
    }

}

class Fox(name: String) : Animal(name) {

    override fun toEat() {

        println("Лиса по имени $name ест ягоды")
    }

}

class Cat(name: String) : Animal(name) {

    override fun toEat() {

        println("Кошка по имени $name ест рыбу")
    }

}

fun main() {

    val dog = Dog("Тимошка")
    val fox = Fox("Огненная")
    val cat = Cat("Киссенькер")

    val animals: List<Animal> = listOf(dog, fox, cat)
    for (animal in animals) animal.toEat()
}