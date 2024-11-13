package org.example.lesson_18

import kotlin.math.pow

abstract class Box() {

    abstract fun square(): Double

}

class Cube(val lenght: Double) : Box() {

    override fun square(): Double {

        val cubeSquare = (6 * lenght).pow(2)
        println("Площадь куба $cubeSquare")
        return cubeSquare
    }

}

class Rectangle(val length: Double, val width: Double, val height: Double) : Box() {

    override fun square(): Double {
        val rectangleSquare = 2 * (length * width + width * height + length * height)
        println("Площадь прямоугольника $rectangleSquare")
        return rectangleSquare
    }

}

fun main() {

    val cube = Cube(34.0)
    cube.square()

    val rectangle = Rectangle(45.0, 17.3, 33.8)
    rectangle.square()
}