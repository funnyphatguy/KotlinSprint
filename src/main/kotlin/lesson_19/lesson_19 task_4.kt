package org.example.lesson_19

import java.security.KeyStore.TrustedCertificateEntry
import kotlin.math.tan

//В компьютерной игре танк может подбирать разные виды патронов. Патроны различаются силой удара.
// Синие – 5 единиц, зеленые – 10, красные – 20.
//
//– создай enum класс для патронов и класс танка.
// У танка должны быть методы вооружения новым типом патронов и выстрела.
// При выстреле в консоль должен выводиться нанесенный урон;
//– создай экземпляр танка и “произведи” несколько выстрелов разными патронами;
//– экземпляр танка при создании ничем не заряжен;
//– в решении должен использоваться enum.

enum class Ammo(val damadge: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

class Tank() {
    var chargeOrNot: Boolean = false

    fun charge(ammo: Ammo) {
        when (ammo) {
            Ammo.BLUE -> println("Вы зарядили танк синими патронами, урон ${Ammo.BLUE.damadge}")
            Ammo.GREEN -> println("Вы зарядили танк зелеными патронами, урон ${Ammo.GREEN.damadge}")
            Ammo.RED -> println("Вы зарядили танк красными патронами, урон ${Ammo.RED.damadge}")
        }
        chargeOrNot = true
    }

    fun shoot(ammo: Ammo) {
        if (chargeOrNot == true) {
            when (ammo) {
                Ammo.BLUE -> println("Выстрел синими патронами")
                Ammo.GREEN -> println("Выстрел зелеными патронами")
                Ammo.RED -> println("Выстрел танк красными патронами")
            }

        } else println("Вы не зарядили пушку!!!")
    }
}

fun main() {

    val tank = Tank().also { it.shoot(ammo = Ammo.BLUE) }
    tank.charge(ammo = Ammo.BLUE)
    tank.shoot(ammo = Ammo.BLUE)
}