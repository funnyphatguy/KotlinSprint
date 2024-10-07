package org.example.lesson4

fun main() {

    val weight = readln().toInt()
    val value = readln().toInt()

    println(
        "Груз с весом $weight кг и объемом $value л соответствует категории 'Average':" +
                " ${35 < weight && weight <= 100 || 100 >= value}"
    )
}
