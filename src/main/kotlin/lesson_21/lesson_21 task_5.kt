package org.example.lesson_21

class PlayerTwo(val name: String, val experience: Map<String, Int>)

fun Map<String, Int>.maxCategory(): Map.Entry<String, Int> {

    return this.maxBy { it.value }

}

fun main() {

    val Batman = PlayerTwo(
        name = "Бэтмен",
        experience = mapOf("Смелость" to 90, "Ловкость" to 95, "Сила" to 90)
    )

    println(Batman.experience.maxCategory())

}

