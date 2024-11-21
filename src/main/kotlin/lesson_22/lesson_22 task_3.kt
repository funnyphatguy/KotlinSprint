package org.example.lesson_22

data class Skuf(val name: String, val weight: Int, val age: Double)

fun main() {

    val skuf = Skuf("Серега", 120, 37.5)

    val (name, weight, age) = skuf
    println("Человек $name весит $weight кг и ему $age лет")

}