package org.example.lesson_16

import kotlin.math.pow

//Создай класс, описывающий круг. У него должны быть методы, вычисляющие длину окружности и площадь круга, используя радиус.
//
//Число Pi должно быть равным 3.14, быть недоступным в других файлах и защищенным от изменений извне.
// Радиус передается через конструктор и не виден из внешнего по отношению к классу кода.
//
//Создай объект, вызови у него методы для расчета окружности и площади и выведи данные в консоль.

private const val PI = 3.14

class Circle(private val radius: Double) {

    fun circleLength() {
        println("Длина окружности круга с радиусом $radius мм - ${2 * PI * radius} мм.")
    }

    fun cirlceSquare() {

        println("Площадь круга с радиусом $radius мм ${PI * radius * radius} мм.")
    }
}

fun main() {

    val circle = Circle(13.9).also {
        it.circleLength()
        it.cirlceSquare()
    }
}