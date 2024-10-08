
fun main() {
    println("Докажите, что вы не бот. Сколько будет 7+3? Ответ введите ниже:")

        val answer = readln().toInt()

        if (answer == 10) println("Добро пожаловать") else println("Доступ запрещен")
}