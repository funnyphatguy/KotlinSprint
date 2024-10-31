package org.example.lesson13
//Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.
//
//Программа должна заполнять контакты в телефонную книгу (отдельный список объектов).
//
//- если пользователь не ввел номер телефона, то нужно уведомить об этом пользователя и такая запись не должна добавляться;
//- для приведения введенного номера к числу используй toLongOrNull();
//- если пользователь не заполнил компанию, то в объект записывать null.
//
//Выведи созданные объекты в консоль методом класса.

class Contacts {
    var name: String? = null
    var number: Long? = null
    var company: String? = null

    init {
        println("Введите имя")
        name = readln()

        println("Введите номер")
        number = readln().toLongOrNull()
        if (number == null) println("Вы не ввели номер, контакт не будет добавлен в телефонную книжку")

        println("Введите компанию")
        company = readln()

    }

    fun getInfo() {

        if (number == null) return
        else println(
            """  
               |- Имя : $name
               |- Номер: $number
               |- Компания: ${company ?: "<не указано>"}""".trimMargin()
        )
    }
}

fun main() {
    val contacts = listOf(
        Contacts(), Contacts(), Contacts(), Contacts(), Contacts()
    )

    val list = contacts.distinctBy { it.company }

    list.forEach { it -> it.getInfo() }
}