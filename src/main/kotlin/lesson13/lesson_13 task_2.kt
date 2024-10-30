package org.example.lesson13


class Guidee(val name: String, val number: Long, val company: String?) {

    fun getInfo() {

        println(
            """- Имя : $name
               |- Номер: $number
               |- Компания: ${company ?: "<не указано>"}""".trimMargin()
        )
    }
}

fun main() {

    val data = Guidee(name = "Aleksei", number = 44542624, company = null)

    data.getInfo()
}