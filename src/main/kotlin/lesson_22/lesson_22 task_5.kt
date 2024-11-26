package org.example.lesson_22

data class GalacticGuide(
    val placeName: String,
    val placeDescription: String,
    val dateAndTime: String,
    val distance: Double
)

fun main() {

    val alphaCentauri = GalacticGuide(
        placeName = "Альфа центавра",
        placeDescription = "Скопление звезд",
        dateAndTime = "20.04.2789 года в 14:32 по Москве",
        distance = 4.3,
    )

    val name = alphaCentauri.component1()
    val description = alphaCentauri.component2()
    val date = alphaCentauri.component3()
    val distance = alphaCentauri.component4()

    println(
        """
        |Название места или события: $name
        |Описание места или события: $description
        |Дата и время события: $date
        |Расстояние места или события от Земли в световых годах: $distance
    """.trimMargin()
    )

}
