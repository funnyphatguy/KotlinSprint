package org.example.lesson1

const val SECONDS = 6480
const val MINUTES_AND_SECONDS = 60

fun main() {

    val minutes = SECONDS / MINUTES_AND_SECONDS
    val hours = minutes / MINUTES_AND_SECONDS
    val remainingSeconds = SECONDS % MINUTES_AND_SECONDS
    val remainingMinutes = minutes % MINUTES_AND_SECONDS

    println("%02d:%02d:%02d".format(hours, remainingSeconds, remainingMinutes))

}