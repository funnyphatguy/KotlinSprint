package org.example.lesson_18

abstract class Dice(numberOfEdge: Int) {

    abstract fun throwDice(): String
}

class FourEdge(val numberOfEdge: Int = 4) : Dice(numberOfEdge) {

    override fun throwDice(): String {

        val diceThrow = 1..numberOfEdge
        return "Кость c $numberOfEdge гранями брошена, ее результат ${diceThrow.random()}"

    }
}

class SixEdge(val numberOfEdge: Int = 6) : Dice(numberOfEdge) {


    override fun throwDice(): String {

        val diceThrow = 1..numberOfEdge
        return "Кость c $numberOfEdge гранями брошена, ее результат ${diceThrow.random()}"

    }
}

class EightEdge(val numberOfEdge: Int = 8) : Dice(numberOfEdge) {

    override fun throwDice(): String {

        val diceThrow = 1..numberOfEdge
        return "Кость c $numberOfEdge гранями брошена, ее результат ${diceThrow.random()}"

    }
}


fun main() {

    val firstDice = FourEdge()
    val secondDice = SixEdge()
    val thirdDice = EightEdge()

    val newList: List<Dice> = listOf(firstDice, secondDice, thirdDice)
    for (i in newList) println("${i.throwDice()}")

}

