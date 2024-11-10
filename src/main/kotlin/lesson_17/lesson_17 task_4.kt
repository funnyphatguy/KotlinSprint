package org.example.lesson_17

//Каждый раз, когда посылка прибывает в промежуточный пункт обработки, в программе меняется её местоположение.
// Опиши класс посылки с такими вводными:
//
//- свойства класса хранят: поле с номером посылки и поле с текущим местоположением;
//- поле класса хранит счетчик перемещений, обновляющийся при перезаписи местоположения.
//
//Сымитировать прибытие посылки в новый пункт обработки, протестировать изменение счетчика. При реализации использовать сеттер.

class Parcel(parcelNumber: Int) {


    var parcelPlace = "Начальное местоположение"
        set(value) {
            field = value
            if (value != "Начальное местоположение") counter++
        }
    var counter = 0
}

fun main() {

    val parcel = Parcel(3)
    println("${parcel.parcelPlace}")
    println("${parcel.counter}")
    parcel.parcelPlace = "Новое местоположение"
    println("${parcel.parcelPlace}")
    println("${parcel.counter}")

}