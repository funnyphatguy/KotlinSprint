const val LEGAL_AGE = 18

fun main() {

    val dateOfBirth = readln().toInt()
    val userAge = 2024 - dateOfBirth

    if (userAge >= LEGAL_AGE) {
        println("Вернуться на главный экран")
    } else {
        println("Вернуться на главный экран")
    }
}