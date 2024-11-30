package org.example.lesson_16

class Player(val name: String, var health: Int, var power: Int) {
    init {
        if (health > 100)
            println("Здоровье персонажа не может быть больше 100, назначено значение 100")
        health = 100
    }

    fun fight(damage: Int): Int {
        health = health - damage
        if (health <= 0) youDied()
        return health
    }

    private fun youDied() {
        health = 0
        power = 0
        println("Игрок $name умер")
    }

    fun heal(heal: Int): Int {
        if (health <= 0) {
            println("Вы пытаетесь вылечить персонажа, но персонаж погиб и его невозможно вылечить")
            return 0
        } else if (health >= 100) {
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

    player.fight(60)
    println(player)

    player.heal(20)
    println(player)

    player.fight(60)
    println(player)

    player.heal(10)

}