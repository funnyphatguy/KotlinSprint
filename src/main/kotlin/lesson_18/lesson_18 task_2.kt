package org.example.lesson_18

//В игре используются типы игральных костей с разным количеством граней: 4, 6 и 8.
//
//Опиши их иерархию, создав по классу на каждый тип. У каждой кости должен быть метод, бросающий кость и печатающий значение в консоль.
//
//Для демонстрации полиморфизма “включения”:
//
//- создай несколько объектов с разными гранями;
//- собери из них список объектов, указав тип списка;
//- выполни итерацию по списку и вызови у каждого объекта метод броска кости.

open class Dice() {

    open fun diceThrow(): String {
        return ""
    }
}

class fourEdge() : Dice() {

    val numberOfEdge: Int = 4
    override fun diceThrow(): String {

        val throwDice = 1..numberOfEdge
        return "Кость c $numberOfEdge гранями брошена, ее результат ${throwDice.random()}"

    }
}

class sixEdge() : Dice() {

    val numberOfEdge: Int = 6
    override fun diceThrow(): String {

        val throwDice = 1..numberOfEdge
        return "Кость c $numberOfEdge гранями брошена, ее результат ${throwDice.random()}"

    }
}

class eightEdge() : Dice() {

    val numberOfEdge: Int = 8
    override fun diceThrow(): String {

        val throwDice = 1..numberOfEdge
        return "Кость c $numberOfEdge гранями брошена, ее результат ${throwDice.random()}"

    }
}


fun main() {

    val firstDice = fourEdge()
    val secondDice = sixEdge()
    val thirdDice = eightEdge()

    val newList: List<Dice> = listOf(firstDice, secondDice, thirdDice)
    for (i in newList) println("${i.diceThrow()}")

}

