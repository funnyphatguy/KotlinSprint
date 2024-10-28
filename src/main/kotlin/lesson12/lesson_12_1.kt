package org.example.lesson12

//class person(val name: String, val weght: Int, val count: Int) {
//
//    var isNeedToPrepare: Boolean = false
//
//    constructor(
//        name: String,
//        weght: Int,
//        count: Int,
//        isNeedToPrepare: Boolean,
//    ) : this(name, weght, count) {
//        this.isNeedToPrepare = isNeedToPrepare
//    }
//}
//
//fun main() {
//
//    val alesha = person(name = "Алешка", 8, count = 5)
//    val petya = person(name = "Петя", weght = 6, count = 3, isNeedToPrepare = true)
//}

//Программа отслеживает погоду по дням. Создай класс для хранения данных о температуре и осадках для одного дня.
//
//Объекты класса будут хранить:
//
//- дневная температура;
//- ночная температура;
//- наличие осадков в течение суток.
//
//Создай два объекта, присвой им произвольные данные и выведи в консоль одним методом созданного класса.
//
//- в классе создай переменные и проинициализируй их какими-нибудь значениями;
//- затем в созданных объектах подставь другие значения этим переменным.
//
//В этой задаче используй пустой конструктор.

class Temperature() {

    var dayTemp: Int = 0
    var nightTemp: Int = 0
    var precipitation: Boolean = false

    fun info() =
        println("Дневная температура - $dayTemp градусов\nНочная температура - $nightTemp градусов,\nНаличие осадок - $precipitation")
}

fun main() {

    val monday = Temperature()
    monday.dayTemp = 7
    monday.nightTemp = 2
    monday.precipitation = false
    monday.info()

    val friday = Temperature()
    friday.dayTemp = 4
    friday.nightTemp = 1
    friday.precipitation = false
    friday.info()

}