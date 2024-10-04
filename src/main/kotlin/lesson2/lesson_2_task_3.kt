

fun main() {

    val startHours = 9
    val startMinutes = 39
    val trainTravelminutes = 457

    val overallMinutes = trainTravelminutes + startMinutes

    val inWayHours = overallMinutes / 60

    val remainingInWayMinutes = overallMinutes % 60

    val overallHours = startHours+inWayHours

    println("$overallHours:$remainingInWayMinutes")
}