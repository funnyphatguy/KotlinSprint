package org.example.lesson_22

class RegularBook(val name: String, val autor: String)

data class DataBook(val name: String, val autor: String)

fun main() {

    val regBookOne = RegularBook("Night Springs", "Alan Wake")
    val regBookTwo = RegularBook("Night Springs", "Alan Wake")

    val dataBookOne = DataBook("Departure", "Thomas Zane")
    val dataBookTwo = DataBook("Departure", "Thomas Zane")

    println(regBookOne == regBookTwo) // тут false, т.к. при сравнении (==) обычных КЛАССОВ,
    // сравниваются ссылки на каждый экземпляр класса.
    // Т.к. объекты фактически разные, то и ссылки они будут иметь разные.

    println(dataBookOne == dataBookOne) // тут true, т.к. Data class сравнивает именно проинициализированные данные,
    // потому что под капотом data class создает методы equals() и hashCode(), а эти методы сравнивают конкретно значение полей data class.

}