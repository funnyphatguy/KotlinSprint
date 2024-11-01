package org.example.lesson14

//Напиши программу для работы с геометрическими фигурами:
// кругом и прямоугольником. Каждая фигура имеет свой цвет и уникальные параметры:

//- для круга — радиус;
//- для прямоугольника — ширину и высоту.

//Создай абстрактный класс Figure с полем color. Внутри определи два абстрактных метода:

//- для вычисления площади;
//- для вычисления периметра.

//Добавь классы-наследники для вышеупомянутых типов фигур.
// Реализуй методы для вычисления площади и периметра в каждом из классов-наследников (формулы можно найти в интернете).

//Создай несколько объектов разных цветов (черные и белые) и сохрани в единый список. Выведи в консоль:

//- сумму периметров всех черных фигур;
//- сумму площадей всех белых фигур.

abstract class Figure(val color: String) {

    abstract fun area(): Double

    abstract fun perimeter(): Double
}

class Circle(val radius: Double, color: String) : Figure(color) {

    override fun area(): Double {
        return (radius * radius * Math.PI)
    }

    override fun perimeter(): Double {
        return (2 * Math.PI * radius)
    }

}

class Rectangle(val width: Double, val height: Double, color: String) : Figure(color) {


    override fun area(): Double {
        return (width * height)
    }

    override fun perimeter(): Double {
        return 2 * (width * height)
    }
}

fun main() {

    val redCircle = Circle(12.0, "red").also {
        it.area()
        it.perimeter()
    }

    val blackCircle = Circle(10.0, "black").also {
        it.area()
        it.perimeter()
    }

    val redRectangle = Rectangle(18.1, 12.2, "red").also {
        it.area()
        it.perimeter()
    }

    val blackRectangle = Rectangle(12.8, 12.7, "black").also {
        it.area()
        it.perimeter()
    }

    val redFigures = listOf(redCircle, redRectangle)

    val blackFigures = listOf(blackCircle, blackRectangle)

    redFigures.apply {
        val sumAreaRed = sumOf { it.area() }
        val sumPerimeterRed = sumOf { it.perimeter() }

        println(
            """Площадь красных фигур: $sumAreaRed
                |Периметр красных фигур: $sumPerimeterRed
            """.trimMargin()
        )
    }
    blackFigures.apply {
        val sumAreaBlack = sumOf { it.area() }
        val sumPerimeterBlack = sumOf { it.perimeter() }
        println(
            """Площадь черных фигур: $sumAreaBlack
                |Периметр черных фигур: $sumPerimeterBlack
            """.trimMargin()
        )
    }
}