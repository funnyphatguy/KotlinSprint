package org.example.lesson10

fun main() {
    val human = rollTheDice()
    val computer = rollTheDice()

    println("Бросает человек, у него выпало $human")
    println("Бросает компьютер, у него выпало ${computer}")
    if (human > computer) println("Победило человечество") else println("Победила машина")
}

fun rollTheDice(): Int {
    return (1..6).random()
}