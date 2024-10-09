package org.example.lesson5

fun main() {

    println(
        "Введите два числа в диапазоне от 0 до 42, если вы угадаете два числа, получите главный приз, " +
                "если одно число, то получите утешительный приз"
    )
    val numberOne = readln().toInt()
    val numberTwo = readln().toInt()

    val winNumOne = 4
    val winNumTwo = 35

    if (numberOne < 0 || numberOne > 42 || numberTwo < 0 || numberTwo > 42)
        println("Введите числа из диапазона от 0 до 42!")
    else if (numberOne == winNumOne || numberOne == winNumTwo && numberTwo == winNumOne || numberTwo == winNumTwo)
        println("Поздравляем! Вы выиграли главный приз!")
    else if (numberOne == winNumOne || numberOne == winNumTwo || numberTwo == winNumOne || numberTwo == winNumTwo)
        println("Вы выиграли утешительный приз!")
}
