package org.example.lesson_20

class Player(val name: String, val key: Boolean) {

}

fun main() {

    val player = Player("Алешка", false)
    val door: (Player) -> String = { if (player.key) "Игрок открыл дверь" else "Дверь заперта" }
    println(door(player))

}