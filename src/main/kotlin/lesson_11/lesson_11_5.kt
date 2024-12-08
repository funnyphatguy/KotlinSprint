package org.example.lesson_11

import java.util.UUID

class Forum() {

    val listOfForumUsers: MutableList<ForumUser> = mutableListOf()
    val listOfForumMessages: MutableList<ForumMessage> = mutableListOf()

    fun createNewUser(name: String): ForumUser {

        val newUser = ForumUser(userId = UUID.randomUUID().toString(), userName = name)
        listOfForumUsers.add(newUser)
        return newUser

    }

    fun createNewMessage(userId: String, message: String) {

        val user = listOfForumUsers.find { it.userId == userId }

        val forumMessage = ForumMessage(authorId = userId, message = message)
        listOfForumMessages.add(forumMessage)
        println("${user?.userName.toString()}: $message")

    }

   data class ForumUser(
        val userId: String,
        val userName: String
    )

   data class ForumMessage(
        val authorId: String,
        val message: String
    )
}

fun main() {

    val forum = Forum()

    val userVasyan = forum.createNewUser("Васян")
    forum.createNewMessage(userVasyan.userId, "Надеюсь это правильное решение задачи")

     val userValerka = forum.createNewUser("Валерка")
    forum.createNewMessage(userValerka.userId, "сообщение")
    forum.createNewMessage(userValerka.userId, "еще одно сообщение")

}

