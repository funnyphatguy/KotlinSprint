package org.example.lesson_21

fun String.vowelCount(): Int {

    var count = 0
    val vowels: List<Char> = listOf('a', 'e', 'i', 'o', 'u', 'y')
    count = this.count() { it in vowels }
    return count
}

fun main() {
    val word = "hello"

    println("Количество гласных в слове $word равно числу ${word.vowelCount()}")

}