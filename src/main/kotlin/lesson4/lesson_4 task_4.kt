fun main() {

    var arms = 5
    var press = 5
    val legs = arms++
    val back = press++

    val day_of_the_train = 5

    println(
        """
        Упражнения для рук:    ${day_of_the_train == arms}
        Упражнения для ног:    ${day_of_the_train == legs}
        Упражнения для спины:  ${day_of_the_train == back}
        Упражнения для пресса: ${day_of_the_train == press}

    """.trimIndent()
    )
}