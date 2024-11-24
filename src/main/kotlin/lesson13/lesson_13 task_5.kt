package org.example.lesson13

class TheContacts(
    var name: String? = null,
    var number: String? = null,
    var company: String? = null,
) {
    fun getInfo() {

        val formattedNumber = try {
            number?.toLong()
        } catch (e: Exception) {
            e::class.simpleName
        }

        println(
            """  
               |- Имя : $name
               |- Номер: $formattedNumber
               |- Компания: ${company ?: "<не указано>"}""".trimMargin()
        )
    }
}

fun main() {
    val con = TheContacts(name = "Коля", number = "Рикон", company = "Газпром")
    con.getInfo()
}