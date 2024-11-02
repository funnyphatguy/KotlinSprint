package org.example.lesson14

//В компьютерной игре существуют планеты. У некоторых из них есть спутники.
//
//Планеты и спутники могут иметь атмосферу и могут быть пригодными для высадки.
//
//Создай родительский класс, описывающий небесные тела, и подклассы, описывающие планеты и спутники.
//
//- планета должна хранить список спутников.
//
//Создай планету с двумя спутниками и выведи в консоль название планеты и названия всех ее спутников.

abstract class SpaceBodie(val name: String, val atmosphere: Boolean, val liveability: Boolean) {

    fun message() {
        println("Планета $name, атмосфера $atmosphere, пригодность для жизни $liveability")

    }

    class Planet(
        name: String,
        atmosphere: Boolean,
        liveability: Boolean,
        var satellites: MutableList<Satelite> = mutableListOf()
    ) : SpaceBodie(name, atmosphere, liveability) {

        fun satellitesAdd(satelite: Satelite) {
            satellites.add(satelite)
            println("Первый спутник $name - ${satelite.name}")
        }

    }
}

class Satelite(name: String, atmosphere: Boolean, liveability: Boolean) : SpaceBodie(name, atmosphere, liveability)

fun main() {

    val jupiter = SpaceBodie.Planet(name = "Юпитер", atmosphere = false, liveability = false)

    val callisto = Satelite(name = "Каллисто", atmosphere = true, liveability = true)
    val io = Satelite(name = "Ио", atmosphere = false, liveability = false)

    jupiter.message()
    jupiter.satellitesAdd(callisto)
    jupiter.satellitesAdd(io)

}