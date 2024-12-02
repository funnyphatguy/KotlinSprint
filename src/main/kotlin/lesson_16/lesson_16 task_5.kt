package org.example.lesson_16

class Player(val name: String, var health: Int, var power: Int) {

     var isDead = false

    fun toFight(damage: Int): Int {
        health = health - damage
        if (health <= 0) {
            toDie()
        }
        return health
    }

    private fun toDie() {
        isDead = true
        health = 0
        power = 0
        println("Игрок $name пал..")
    }

    fun toHeal(heal: Int): Int {
        if (isDead) {
            println("Вы пытаетесь вылечить персонажа, но персонаж погиб и его невозможно вылечить")
            return 0
        } else {
            health = health + heal
            println("Вы вылечили персонажа, его текущие характеристики:")
            return health
        }
    }

    override fun toString(): String {
        return "Здоровье игрока $name = $health, сила удара $power"
    }
}

fun main() {

    val player = Player("Владимир", 100, 70)

    player.toFight(60)
    println(player)
    println("")
    player.toHeal(20)
    println(player)
    println("")
    player.toFight(60)
    println(player)
    println("")
    player.toFight(30)
    println("")
    player.toHeal(10)

}