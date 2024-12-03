package org.example.lesson_11

//Реализовать класс работы форума (Forum).
// Для реализации создай дополнительные классы для сущностей “Член форума” (с полями userId и userName)
// и “Сообщение форума” (с полями authorId и message).
//
//Примени паттерн “Строитель” для создания пользователей и сообщений форума.
// Напрямую объекты не создаются, логика должна быть инкапсулирована внутри методов класса.
//
//- createNewUser() создает новых пользователей, принимая имя пользователя.
// Метод сохраняет нового пользователя в общий список и одновременно возвращает новый объект.
// Генерация id-шников новых пользователей происходит внутри;
//- createNewMessage() создает сообщения, принимая id пользователя.
// Сообщения создаются только если такой пользователь есть на форуме;
//-  печатает в консоль все сообщения добавленные на форум в формате:
//
//    автор: сообщение
//    автор: сообщение
//
//Создай экземпляр Forum и продемонстрируй его работу, добавив двух пользователей и по два сообщения от каждого пользователя.


class ForumMember(val userId: Int, userName: String) {

    class Builder {

        var userName: String = ""

        fun createNewUser(setName: String): ForumMember {

            apply { this.userName = setName }
            val id = (1..2).random()
            val newUser = ForumMember(id, setName)
            listOfForumMembers.add(newUser)
            return newUser
        }
    }
}

var listOfForumMembers: MutableList<ForumMember> = mutableListOf()
var listOfForumMessages: MutableList<String> = mutableListOf()

class ForumMessage(authorId: Int, message: String) {

    class Builder {

        val authorId = 0

        fun createNewMessage(id: Int) {
            val id = authorId
            for (ForumMember in listOfForumMembers) {
                if (ForumMember.userId == id) {

                    var messages: MutableList<String> =
                        mutableListOf("Привет, я тут новичок", "Привет, я модератор", "Привет, я тут старичок")
                    val message = messages.random()
                    listOfForumMessages.add(message)
                } else println("Такого пользователя на форуме не существует")
            }
        }
    }
}

class Forum() {

}

fun main() {

//    val person = ForumMember.Builder().createNewUser()
//
//    val message = ForumMessage.Builder().createNewMessage(1)
//
}


