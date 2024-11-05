package org.example.lesson_15

//На форуме есть два типа пользователей – обычные пользователи и администраторы.
//
//Пользователи могут читать форум и писать сообщения.
// Администраторы дополнительно могут удалять сообщения и пользователей.
//
//Опиши классы для сущностей пользователей и администраторов, используя абстрактный класс.
// У абстрактного класса должны быть соответствующие общие поля и методы.
// Действия на форуме отобрази сообщениями в консоль.

abstract class People(val nickname: String, val level: String) {

    abstract fun peopleWrite()

    abstract fun peopleRead()

}

class User(nickname: String, level: String) : People(nickname, level) {

    override fun peopleWrite() {
        println("$level $nickname пишет сообщение")
    }

    override fun peopleRead() {
        println("$level $nickname читает сообщение")
    }
}

class Admin(nickname: String, level: String) : People(nickname, level) {
    override fun peopleWrite() {
        println("$level $nickname пишет сообщение")
    }

    override fun peopleRead() {
        println("$level $nickname читает сообщение")
    }

    fun adminDelete() {

        println("$level $nickname удаляет сообщение")

    }

    fun adminUserDelete() {
        println("$level $nickname удаляет пользователя")
    }
}

fun main() {

    val userOne = User("Артем", "Пользователь").also { it.peopleRead() }
    val userTwo = User("Николай", "Пользователь").also { it.peopleWrite() }
    val adminOne = Admin("Гоген", "Админ").also { it.adminDelete() }
    val adminTwo = Admin("Мартин", "Админ").also { it.adminUserDelete() }
}