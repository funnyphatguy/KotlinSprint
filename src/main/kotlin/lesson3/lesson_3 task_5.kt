package org.example.lesson3

fun main() {

    var turn = "D2-D4;0"

    var parsing = turn.split("-", ";")

    val one = parsing[0]
    val two = parsing[1]
    val three = parsing[2]

    println("Откуда ходит игрок: $one")
    println("Куда ходит игрок: $two")
    println("Номер хода: $three")

}