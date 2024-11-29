package org.example.lesson_19

class Human(val name: String, val gender: Gender) {
    override fun toString(): String {
        return "Имя $name, пол ${gender.toString().lowercase()}"
    }
}

enum class Gender() {
    МУЖСКОЙ,
    ЖЕНСКИЙ,
    НЕОПРЕДЕЛЕННЫЙ,

}

fun main() {

    println("Введите имя и пол, пол либо женский, либо мужской,в одну строку, через пробел")

    val listOfHumans: MutableList<Human> = mutableListOf()

    for (i in 1..5) {
        val input = readln().split(" ")
        if (input.size > 2) {
            println("Два слова!!!")
            break
        }

        val name = input[0]
        val sex = input[1].lowercase()

        val gender = when (sex) {
            "мужской" -> Gender.МУЖСКОЙ
            "женский" -> Gender.ЖЕНСКИЙ
            else -> Gender.НЕОПРЕДЕЛЕННЫЙ

        }
        listOfHumans.add(Human(name, gender))
    }
    println("\nВаша картотека:")
    listOfHumans.forEach { println(it) }
}

