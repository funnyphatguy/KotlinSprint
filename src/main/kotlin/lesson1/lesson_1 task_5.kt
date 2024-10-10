package org.example.lesson1
const val SECONDS = 6480
fun main() {

    val minutes = SECONDS / 60
    val hours = minutes / 60
    val remainingSeconds = SECONDS % 60
    val remainingMinutes = minutes % 60

    println("${String.format("%02d", hours)}:${String.format("%02d", remainingMinutes)}:${String.format("%02d", remainingSeconds)}")

}