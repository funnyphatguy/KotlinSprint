package org.example.lesson4

const val MINIMUM_WEIGHT = 35
const val MAXIMUM_VOLUME = 100

fun main() {

    val weight = readln().toInt()
    val volume = readln().toInt()

    println(
        "Груз с весом $weight кг и объемом $volume л соответствует категории 'Average':" +
                " ${MINIMUM_WEIGHT < weight && weight <= MAXIMUM_VOLUME || MAXIMUM_VOLUME >= volume}"
    )
}
