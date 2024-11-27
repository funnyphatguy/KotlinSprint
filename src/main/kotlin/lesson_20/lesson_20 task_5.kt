package org.example.lesson_20

class Robo(val name: String) {

    var phrase: String? = null
    var phraseReverse: String? = null

    fun say(): String {

        if (phrase == null) {

            val phrases: List<String> = listOf(
                "Мне нужна твоя одежда и мотоцикл",
                "Мне нужен отпуск",
                "Нет проблем",
                "Идём со мной, если хочешь жить",
                "Аста Ла Виста, Бэби"
            )
            phrase = phrases.random()
            return phrase!!
        } else return phraseReverse!!
    }

    fun setModifier(): String {
        phraseReverse = phrase!!.reversed()
        return phraseReverse!!
    }
}

fun main() {

    val robot = Robo(name = "Терминатор")
    println(robot.say())
    robot.setModifier()
    println(robot.say())
}