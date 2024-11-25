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
        distance = 4.3
    )
    println(
        """
        |Название места или события: ${alphaCentauri.placeName}
        |Описание места или события: ${alphaCentauri.placeDescription}
        |Дата и время события: ${alphaCentauri.dateAndTime}
        |Расстояние места или события от Земли в световых годах: ${alphaCentauri.distance}
    """.trimMargin()
    )

}
