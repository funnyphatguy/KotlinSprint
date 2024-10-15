package org.example.lesson4

const val PEOPLE_MIN = 50
const val PEOPLE_MAX = 70
const val PROVISION = 50
const val YES_ANSWER = "Да"
const val NO_ANSWER = "Нет"

fun main() {

    println("Корабль имеет повреждения?(да либо нет)")
    val damage: String = readln().lowercase()

    println("Какое количество людей на борту?")
    val people: Int = readln().toInt()

    println("Какое количество провизии на борту?")
    val provision: Int = readln().toInt()

    println("Благоприятны ли метеоусловия?(да либо нет)")
    val weather: String = readln().lowercase()

    val canFlyOrNot =
        (damage != YES_ANSWER.lowercase()) and (people >= PEOPLE_MIN) and
                (people <= PEOPLE_MAX) and (provision > PROVISION) and (weather != NO_ANSWER.lowercase())

    println("Может ли судно полететь? $canFlyOrNot")
}