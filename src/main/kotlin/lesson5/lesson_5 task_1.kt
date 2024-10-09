fun main() {
    var a = 7
    var b = 3

    println("Докажите, что вы не бот. Сколько будет $a + $b? Ответ введите ниже:")

    val answer = readln().toInt()

    if (answer == a + b) println("Добро пожаловать") else println("Доступ запрещен")
}