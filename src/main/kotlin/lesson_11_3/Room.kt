package org.example.lesson_11_3

const val STATUS_TALKING = "Разговаривает"
const val STATUS_MUTED = "Пользователь заглушен"
const val STATUS_OFF = "Микрофон выключен"
const val NICKNAME = "АЛЕШКА"

class Room(

    val cover: String,
    val name: String,
    val users: MutableList<String>

) {
    fun addToChat(nickname: String): MutableList<String> {
        users.add(nickname)
        return users
    }

}

class User(
    val nickname: String,
    var status: String
) {
    fun addedUserStatus(nickname: String, status: String): String {
        this.status = status
        return this.status
        return nickname
    }

}

