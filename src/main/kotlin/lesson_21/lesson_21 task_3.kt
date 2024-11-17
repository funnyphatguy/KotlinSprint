package org.example.lesson_21

class Player(val name: String, var health: Int, var maxHealth: Int) {

}

fun Player.isHealthy(): Boolean {

    when (health) {
        maxHealth -> return true
        else -> return false
    }

}

fun main() {

    val player = Player("Алешка", 100, 100)
    println(player.isHealthy())

}