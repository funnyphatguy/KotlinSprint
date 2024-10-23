package org.example.lesson10

const val YES = "Да"
fun main() {

    var count = 0
    if (round() == "Победило человечество")
        count++

    println("Хотите сыграть еще раз?")
    var answer = readln().lowercase()
    while (answer == YES.lowercase()) {
        if (round() == "Победило человечество")
            count++
        println("Хотите сыграть еще раз?")
        answer = readln()
    }
    println("Человечество выиграло $count раз")
}

fun round(): String {
    val human = rollTheDice()
    val computer = rollTheDice()

    println("Бросает человек, у него выпало $human")
    println("Бросает компьютер, у него выпало ${computer}")
    return if (human > computer) {
        println("Победило человечество")
        "Победило человечество"
    } else {
        println("Победила машина")
        "Победила машина"
    }
}

fun rollTheDice(): Int {
    return (1..6).random()
}


