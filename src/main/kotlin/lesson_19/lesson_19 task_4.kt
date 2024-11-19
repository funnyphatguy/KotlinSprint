package org.example.lesson_19

enum class Ammo(val damadge: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

class Tank() {
    var _ammo: Ammo? = null

    fun charge(ammo: Ammo) {
        when (ammo) {
            Ammo.BLUE -> println("Вы зарядили танк синими патронами, урон ${Ammo.BLUE.damadge}")
            Ammo.GREEN -> println("Вы зарядили танк зелеными патронами, урон ${Ammo.GREEN.damadge}")
            Ammo.RED -> println("Вы зарядили танк красными патронами, урон ${Ammo.RED.damadge}")
        }
        _ammo = ammo
    }

    fun shoot(ammo: Ammo) {
        if (_ammo == ammo) {
            when (ammo) {
                Ammo.BLUE -> println("Выстрел синими патронами")
                Ammo.GREEN -> println("Выстрел зелеными патронами")
                Ammo.RED -> println("Выстрел танк красными патронами")
            }
        } else if ((_ammo == null)) {
            println("Вы не зарядили пушку")
        } else println("Вы зарядили пушку другим типом снарядов")
    }
}

fun main() {

    val tank = Tank().also { it.shoot(ammo = Ammo.BLUE) }
    tank.charge(ammo = Ammo.BLUE)
    tank.shoot(ammo = Ammo.GREEN)
    tank.shoot(ammo = Ammo.BLUE)

}