package org.example.lesson_19

enum class Aquarium(name: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок"),
}

fun getFish() {
    println("Вы можете добавить в свой аквариум следующие виды рыб:")
    for (i in Aquarium.values()) println(i)

}

fun main() {

    getFish()

}
