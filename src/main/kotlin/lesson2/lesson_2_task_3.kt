
 const val HOUR = 60
 
fun main() {

    val startHours = 9
    val startMinutes = 39
    val trainTravelminutes = 457

    val overallMinutes = trainTravelminutes + startMinutes

    val inWayHours = overallMinutes / HOUR

    val remainingInWayMinutes = overallMinutes % HOUR

    val overallHours = startHours+inWayHours

    println("$overallHours:$remainingInWayMinutes")
}