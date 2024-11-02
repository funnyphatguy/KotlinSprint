package org.example.lesson13
//Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.
//
//Для того, чтобы взаимодействовать со всеми записями телефонной книги, как с одним целым, их нужно объединить в список.
//
//- создай и инициализируй (одновременно) список с 5 объектами класса-контакта;
//- 2 контакта должны принимать null для поля компании;
//- 1 контакт должен иметь название компании “null”;
//- выведи список всех существующих компаний, которые есть в телефонной книге.

class Contact(val name: String?, val number: Long?, val company: String?) {

    fun getInfo() {

        println(
            """  
               |- Имя : $name
               |- Номер: $number
               |- Компания: $company """.trimMargin()
        )
    }
}

fun main() {


    val contacts = mutableListOf(
        Contact(name = "Артем", number = 5634543, company = "Майкрософт"),
        Contact(name = "Егор", number = 98675467, company = "null"),
        Contact(name = "Петр", number = 46276354, company = null),
        Contact(name = "Елисей", number = 57365435, company = null),
        Contact(name = "Златояр", number = 9747542, company = "Лукоил"),
    )

    val list = contacts.mapNotNull { if (it.company != null) it else null }

    list.forEach { it.getInfo() }

}