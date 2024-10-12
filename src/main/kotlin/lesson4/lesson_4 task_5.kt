package org.example.lesson4

fun main() {

    println("Корабль имеет повреждения?(да либо нет)")
    val damage: String = readln()

    println("Какое количество людей на борту?")
    val people: Int = readln().toInt()

    println("Какое количество провизии на борту?")
    val provision: Int = readln().toInt()

    println("Благоприятны ли метеоусловия?(да либо нет)")
    val weather: String = readln()

    val canFlyOrNot = (damage == "да") || (damage != "нет") and (people >= 50) and
            (people <= 70) and (provision > 50) and
            (weather == "да") || (weather != "нет")

    println("Может ли судно полететь? $canFlyOrNot")
}