
const val FIRST = 1
const val SECOND = 0

fun main() {

    var arms = FIRST
    var press = FIRST
    val legs = SECOND
    val back = SECOND

    val dayOfTheTrain = 2
    val isEvenDay = dayOfTheTrain % 2

    println(
        """
        Упражнения для рук:    ${isEvenDay == arms}
        Упражнения для ног:    ${isEvenDay == legs}
        Упражнения для спины:  ${isEvenDay == back}
        Упражнения для пресса: ${isEvenDay == press}

    """.trimIndent()
    )
}