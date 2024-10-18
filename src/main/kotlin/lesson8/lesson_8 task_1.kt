package org.example.lesson8

fun main() {
    val mo = 8
    val tu = 5
    val we = 51
    val th = 15
    val fr = 5
    val sa = 51
    val su = 15

    val array = arrayOf(mo, tu, we, th, fr, sa, su)
    println("Всего просмотров: ${array[0] + array[1] + array[2] + array[3] + array[4] + array[5] + array[6]}")
}
