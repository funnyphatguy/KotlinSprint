package org.example.lesson4

const val PEOPLE_MIN = 50
const val PEOPLE_MAX = 70
const val PROVISION = 50

fun main() {

    println("Корабль имеет повреждения?(да либо нет)")
    val damage: String = readln()

    println("Какое количество людей на борту?")
    val people: Int = readln().toInt()

    println("Какое количество провизии на борту?")
    val provision: Int = readln().toInt()

    println("Благоприятны ли метеоусловия?(да либо нет)")
    val weather: String = readln()

    val canFlyOrNot = (damage == "да") || (damage != "нет") and (people >= PEOPLE_MIN) and
            (people <= PEOPLE_MAX) and (provision > PROVISION) and
            (weather == "да") || (weather != "нет")

    println("Может ли судно полететь? $canFlyOrNot")
}