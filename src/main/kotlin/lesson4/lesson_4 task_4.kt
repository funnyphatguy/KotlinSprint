fun main() {

    val dayOfTheTrain = 5

    val split_two = dayOfTheTrain % 2 == 0
    val split_one = !split_two

    println(
        """
        Упражнения для рук:    $split_one
        Упражнения для ног:    $split_two
        Упражнения для спины:  $split_two
        Упражнения для пресса: $split_one

    """.trimIndent()
    )
}