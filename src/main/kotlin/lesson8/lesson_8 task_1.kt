package org.example.lesson8

fun main() {
    val monday = 8
    val tuesday = 5
    val wensday = 51
    val thursday = 15
    val friday = 5
    val saturday = 51
    val sunday = 15

    val daysOfWeek = arrayOf(monday, tuesday, wensday, thursday, friday, saturday, sunday)
    println("Всего просмотров: ${daysOfWeek.sum()}")
}
