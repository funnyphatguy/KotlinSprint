package org.example.lesson_20

class Player(val name: String, var health: Int, var maxHealth: Int) {

    val healthPotion: (Player) -> Unit = { health = maxHealth }

}

fun main() {

    val player = Player("Алешка", 50, 100)
    println(player.health)
    player.healthPotion(player)
    println(player.health)

}