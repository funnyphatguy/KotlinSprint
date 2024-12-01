package org.example.lesson_18

class Screen() {

    fun drawCircle(x: Int, y: Int): String {
        if ((x == 0) || (y in 1..100)) {
            return "Вы нарисовали круг с центром в координате х=$x и радиусом $y"
        } else return "Вам не удалось нарисовать круг"
    }

    fun drawCircle(x: Float, y: Float): String {
        if ((x == 0.0f) || (y in 0.1f..100.0f)) {
            return "Вы нарисовали круг с центром в координате х=$x и радиусом $y"
        } else return "Вам не удалось нарисовать круг"
    }

    fun drawPoint(x: Int, y: Int): String {
        if ((x == 0) || (y == 0) && (x == y)) {
            return "Вы нарисовали точку в координатах х=$x и y=$y"
        } else return "Вам не удалось поставить точку, проверьте, чтобы координаты совпадали"
    }

    fun drawPoint(x: Float, y: Float): String {
        if ((x == 0.0f) || (y == 0.0f) && (x == y)) {
            return "Вы нарисовали точку в координатах х=$x и y=$y"
        } else return "Вам не удалось поставить точку, проверьте, чтобы координаты совпадали"
    }

    fun drawSquare(x: Float, y: Float): String {
        if ((x in 5.0f..100.0f) || (y in 5f..100.0f) && (x == y)) {
            return "Вы нарисовали квадрат со сторонами х=$x и $y"
        } else return "Вам не удалось нарисовать квадрат, проверьте, чтобы координаты совпадали"
    }

    fun drawSquare(x: Int, y: Int): String {
        if ((x in 5..100) || (y in 5..100) && (x == y)) {
            return "Вы нарисовали квадрат со сторонами х=$x и $y"
        } else return "Вам не удалось нарисовать квадрат, проверьте, чтобы координаты совпадали"
    }
}

fun main() {

    val fugure = Screen()
    fugure.drawCircle(5.0f, 5.0f).also { println(it) }

}