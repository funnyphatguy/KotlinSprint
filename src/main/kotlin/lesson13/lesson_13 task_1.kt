package org.example.lesson13

//Для программы телефонного справочника создай класс,
// который будет хранить имя, номер телефона и компанию. Номер телефона – целочисленное значение (Long).
//
//При создании объекта компания может оставаться незаполненной.
// Вместо пустой строки поле может принимать null.
//
//Все свойства класса не должны иметь инициализации по умолчанию.

class Guide(val name: String, val number: Long, val company: String?) {
}


fun main() {

    val data = Guide(name = "Aleksei", number = 44542624, company = null )

    println("${data.name} ${data.number} ${data.company}")
}