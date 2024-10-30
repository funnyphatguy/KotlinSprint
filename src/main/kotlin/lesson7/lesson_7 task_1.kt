package org.example.lesson7

fun main() {

    val rangeNumbers = 0..9
    val rangeChars = 'a'..'z'

    var result = ""
    for (i in 3 downTo 1) {
        val numbers = rangeNumbers.random()
        val chars = rangeChars.random()
        result += "$numbers$chars"
    }

    println(result)
}