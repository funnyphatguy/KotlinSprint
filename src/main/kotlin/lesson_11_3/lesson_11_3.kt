package org.example.lesson_11_3

fun main() {

    var redrum = Room(
        cover = "Музыкальная группа",
        name = "Рок",
        users = mutableListOf("Аня", "Артем", "Марк")
    )

    var newUser = User(
        nickname = "Алешка",
        status = STATUS_OFF
    )

    println(redrum.name)
    println(redrum.cover)
    println(redrum.users)

    println(newUser.nickname)
    println(newUser.status)

    redrum.addToChat(nickname = NICKNAME)

    println(redrum.name)
    println(redrum.cover)
    println(redrum.users)

    newUser.addedUserStatus(nickname = NICKNAME, status = STATUS_TALKING)

    println(newUser.nickname)
    println(newUser.status)
}