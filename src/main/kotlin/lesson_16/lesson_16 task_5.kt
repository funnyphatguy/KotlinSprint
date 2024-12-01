package org.example.lesson_16

class Player(val name: String, var health: Int, var power: Int) {

    fun toFight(damage: Int): Int {
        health = health - damage
        if (health <= 0) {
            toDie()
        }
        return health
    }

    private fun toDie() {
        health = 0
        power = 0
        println("Игрок $name умер")
    }

    fun toHeal(heal: Int): Int {
        if (health <= 0) {
            println("Вы пытаетесь вылечить персонажа, но персонаж погиб и его невозможно вылечить")
            return 0
        } else if (health > 100) {
            println("У вашего персонажа максимальное количество здоровья")
            health = 100
            return health
        }
        health = health + heal
        println("Вы вылечили персонажа, его текущие характеристики:")
        return health
    }

    override fun toString(): String {
        return "Здоровье игрока $name = $health, сила удара $power"
    }
}

fun main() {

    val player = Player("Владимир", 100, 70)

    player.toFight(60)
    println(player)

    player.toHeal(20)
    println(player)

    player.toFight(60)
    println(player)

    player.toHeal(10)

}