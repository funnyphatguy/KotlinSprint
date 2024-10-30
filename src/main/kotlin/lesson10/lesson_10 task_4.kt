package org.example.lesson10

const val YES = "Да"
fun main() {

    var count = 0
    if (round() == true) {
        count++
        println("Победило человечество")
    } else {
        println("Победила машина")
    }

    println("Хотите сыграть еще раз?")
    var answer = readln().lowercase()
    while (answer == YES.lowercase()) {
        if (round() == true) {
            count++
            println("Победило человечество")
        } else {
            println("Победила машина")
        }
        println("Хотите сыграть еще раз?")
        answer = readln().lowercase()
    }
    println("Человечество выиграло $count раз")
}

fun round(): Boolean {
    val human = rollTheDice()
    val computer = rollTheDice()

    println("Бросает человек, у него выпало $human")
    println("Бросает компьютер, у него выпало ${computer}")
    if (human > computer) {
        return true
    } else {
        return false
    }
}

fun rollTheDice(): Int {
    return (1..6).random()
}


