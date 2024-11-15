package org.example.lesson_20

class Player(val name: String, key: Boolean) {

    val door: (Player) -> String = { if (key) "Игрок открыл дверь" else "Дверь заперта" }

}

fun main() {

    val player = Player("Алешка", false)
    println(player.door(player))

}