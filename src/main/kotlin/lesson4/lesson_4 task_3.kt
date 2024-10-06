
fun main() {

    val sunny = true
    val openedTent = true
    val airHumidity = 20
    var currentSeason = "not winter"

    val positiveOrNot: Boolean = sunny && openedTent && airHumidity == 20 && currentSeason == "winter"
    println("Благоприятные ли условия сейчас для роста бобовых? $positiveOrNot")
}