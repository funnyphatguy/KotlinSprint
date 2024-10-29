package org.example.lesson7

fun main() {

    var rangeNumbers = 0..9
    val rangeChars = 'a'..'z'

    for (i in 3 downTo  1) {
        val numbers = rangeNumbers.random()
        val chars = rangeChars.random()
        println("$numbers$chars")

    }
}