package org.example.lesson13

class Contactss(
    var name: String? = null,
    var number: String? = null,
    var company: String? = null,
) {
    fun getInfo() {

        val formattedNumber = try {
            number?.toLong()
        } catch (e: NumberFormatException) {
            "NumberFormatException"
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
    val con = Contactss(name = "Коля", number = "Рикон", company = "Газпром")
    con.getInfo()
}