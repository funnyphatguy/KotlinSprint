
 const val FOR_MINUTES_TO_HOUR = 60

fun main() {

    val startHours = 9
    val startMinutes = 39
    val trainTravelminutes = 457

    val overallMinutes = trainTravelminutes + startMinutes

    val inWayHours = overallMinutes / FOR_MINUTES_TO_HOUR

    val remainingInWayMinutes = overallMinutes % FOR_MINUTES_TO_HOUR

    val overallHours = startHours+inWayHours

    println("$overallHours:$remainingInWayMinutes")
}