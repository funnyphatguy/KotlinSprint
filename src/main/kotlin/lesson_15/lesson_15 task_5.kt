package org.example.lesson_15

interface Moving {
    fun toMove(from: String, to: String)
}

interface Passengers {
    fun toLoadPassengers()
    fun toReloadPassengers()
}

interface Weight {
    fun toLoadCargo()
    fun toReloadCargo()
}

class Car(val passengers: Int) : Moving, Passengers {

    override fun toLoadPassengers() {

        if (passengers in 1..3) {
            println("Вы успешно загрузили $passengers пассажиров")
        } else if (passengers > 3) {
            println("У вас перегруз, уменьшите количество пассажиров")
            return
        }
    }

    override fun toReloadPassengers() {
        if (passengers in 1..3) {
            println("Вы успешно выгрузили $passengers пассажиров в месте назначения")
        }
    }

    override fun toMove(from: String, to: String) {

        toLoadPassengers()
        if (passengers > 3) {
            println("Вы никуда не едете,уменьшите количество пассажиров!")
        } else println("Вы едете из  $from в $to")
        toReloadPassengers()
    }
}

class Truck(val passengers: Int, val cargo: Int) : Moving, Passengers, Weight {

    override fun toLoadPassengers() {
        if (passengers == 1) {
            println("Вы успешно загрузили пассажира")
        } else if (passengers > 1) {
            println("У вас перегруз, уменьшите количество пассажиров")
            return
        }
    }

    override fun toReloadPassengers() {
        if (passengers == 1) {
            println("Вы успешно выгрузили пассажира в месте назначения")
        }
    }

    override fun toMove(from: String, to: String) {
        toLoadPassengers()
        toLoadCargo()
        if (passengers > 1 || cargo > 2) {
            println("Вы никуда не едете,уменьшите количество пассажиров или груза!")
        } else println("Вы едете из $from в $to")
        toReloadPassengers()
        toReloadCargo()
    }

    override fun toLoadCargo() {
        if (cargo in 1..2) {
            println("Вы успешно загрузили $cargo тонн груза")
        } else if (passengers > 2) {
            println("У вас перегруз, уменьшите количество груза")
            return
        }
    }

    override fun toReloadCargo() {
        if (cargo in 1..2) {
            println("Вы успешно выгрузили груз в месте назначения")
        }
    }
}

fun main() {

    val car = Car(3)
    car.toMove("Санкт-Петербург", "Москва")
    println()
    val truck = Truck(1, 2)
    truck.toMove("Санкт-Петербург", "Москва")
    println()
    car.toMove("Москва", "Санкт-Петербург")
    println()
    truck.toMove("Москва", "Санкт-Петербург")

}


