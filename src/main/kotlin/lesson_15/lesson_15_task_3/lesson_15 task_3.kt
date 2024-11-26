package org.example.lesson_15.lesson_15_task_3

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