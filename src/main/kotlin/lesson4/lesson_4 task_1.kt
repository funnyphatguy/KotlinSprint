package org.example.lesson4

val OVERALL_TABLES = 13

fun main () {
    val todayBooked = 13
    val tomorrowBooked = 9

    println("Доступность столиков на сегодня: ${OVERALL_TABLES > todayBooked} \nДоступность столиков на завтра: ${OVERALL_TABLES > tomorrowBooked}")

}