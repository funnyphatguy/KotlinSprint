const val STATUS_TALKING = "Разговаривает"
const val STATUS_MUTED = "Пользователь заглушен"
const val STATUS_OFF = "Микрофон выключен"
const val NICKNAME_NEW = "АЛЕШКА"
const val NICKNAME_ANNA = "Анна"
const val NICKNAME_PETER = "Петр"
const val NICKNAME_ALEKSANDER = "Александр"

class Room(

    val cover: String,
    val name: String,
    val users: MutableList<User>

) {
    fun addToChat(user: User): MutableList<User> {
        users.add(user)
        return users
    }

    fun findUserAndChangeStatus(username: String, status: String) {
        val user = users.find { it.nickname == username }
        user?.status = status
    }

}

class User(
    val nickname: String,
    var status: String
) {
    override fun toString(): String {
        return "$nickname, ($status)"
    }
}





fun main() {

    var redrum = Room(
        cover = "Обложка - музыкальная группа",
        name = "Рок-группа",
        users = mutableListOf(
            User(NICKNAME_ANNA, STATUS_TALKING),
            User(NICKNAME_PETER, STATUS_MUTED),
            User(NICKNAME_ALEKSANDER, STATUS_OFF)
        )
    )

    var newUser = User(
        nickname = NICKNAME_NEW,
        status = STATUS_OFF
    )

    println("Экран приложения:")
    println(redrum.name)
    println(redrum.cover)
    println(redrum.users)
    println("Новый пользователь заходит")
    println(newUser.nickname)
    println(newUser.status)


    println("Новый пользователь попал в чат")
    redrum.findUserAndChangeStatus(NICKNAME_NEW, STATUS_TALKING)

    println(redrum.users)
}
