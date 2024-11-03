package org.example.lesson_15

//На форуме есть два типа пользователей – обычные пользователи и администраторы.
//
//Пользователи могут читать форум и писать сообщения.
// Администраторы дополнительно могут удалять сообщения и пользователей.
//
//Опиши классы для сущностей пользователей и администраторов, используя абстрактный класс.
// У абстрактного класса должны быть соответствующие общие поля и методы.
// Действия на форуме отобрази сообщениями в консоль.

abstract class People(val nickname: String, val level: String, val admin: Boolean) {

    abstract fun userWrite()

    abstract fun userRead()

    fun adminDelete() {
        when (admin) {
            true -> println("$level  $nickname удаляет сообщение")
            false -> println("У $nickname нет права администратора")
        }
    }

    fun adminUserDelete() {
        when (admin) {
            true -> println("$level  $nickname удаляет пользователя")
            false -> println("У $nickname нет права администратора")
        }
    }
}

class User(nickname: String, level: String, admin: Boolean = false) : People(nickname, level, admin) {

    override fun userWrite() {
        println("$level  $nickname пишет сообщение")
    }

    override fun userRead() {
        println("$level  $nickname читает сообщение")
    }
}

class Admin(nickname: String, level: String, admin: Boolean = true) : People(nickname, level, admin) {
    override fun userWrite() {
        println("$level  $nickname пишет сообщение")
    }

    override fun userRead() {
        println("$level  $nickname читает сообщение")
    }
}


fun main() {

    val userOne = User("Артем", "Пользователь").also { it.userRead() }
    val userTwo = User("Николай", "Пользователь").also { it.userWrite() }
    val adminOne = Admin("Гоген", "Админ").also { it.adminDelete() }
    val adminTwo = Admin("Мартин", "Админ").also { it.adminUserDelete() }
}