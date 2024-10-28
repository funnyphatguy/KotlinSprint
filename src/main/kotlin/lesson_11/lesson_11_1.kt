class User(

    val id: Int,
    val login: String,
    val parol: Int,
    val email: String,
)

fun main() {

    val userOne = User(

        id = 1,
        login = "Aleshka",
        parol = 341254,
        email = "Aleshka@yandex.ru"

    )

    val userTwo = User(

        id = 2,
        login = "Anna",
        parol = 844393,
        email = "Anna@yandex.ru"
    )

    println(userOne.id)
    println(userOne.login)
    println(userOne.parol)
    println(userOne.email)

    println(userTwo.id)
    println(userTwo.login)
    println(userTwo.parol)
    println(userTwo.email)
}