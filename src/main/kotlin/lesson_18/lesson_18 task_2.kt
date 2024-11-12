package org.example.lesson_18

open class Dice() {

    open fun throwDice(): String {
        return ""
    }
}

class fourEdge() : Dice() {

    val numberOfEdge: Int = 4
    override fun throwDice(): String {

        val diceThrow = 1..numberOfEdge
        return "Кость c $numberOfEdge гранями брошена, ее результат ${diceThrow.random()}"

    }
}

class sixEdge() : Dice() {

    val numberOfEdge: Int = 6
    override fun throwDice(): String {

        val diceThrow = 1..numberOfEdge
        return "Кость c $numberOfEdge гранями брошена, ее результат ${diceThrow.random()}"

    }
}

class eightEdge() : Dice() {

    val numberOfEdge: Int = 8
    override fun throwDice(): String {

        val diceThrow = 1..numberOfEdge
        return "Кость c $numberOfEdge гранями брошена, ее результат ${diceThrow.random()}"

    }
}


fun main() {

    val firstDice = fourEdge()
    val secondDice = sixEdge()
    val thirdDice = eightEdge()

    val newList: List<Dice> = listOf(firstDice, secondDice, thirdDice)
    for (i in newList) println("${i.throwDice()}")

}

