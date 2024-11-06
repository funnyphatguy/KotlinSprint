package org.example.lesson_16

//Создай класс, описывающий пользователя, который хранит поля логин и пароль.
//
//Пароль не должен быть виден в теле главной функции, но должен быть способ проверить, что пароль введен верно.
// Функция валидации должна принимать строку и возвращать результат проверки (и только его – без распечатки или генерации других строк).
//
//Выведи информацию о корректности введенного пароля.

class User(
    val login: String ,
    private val password: Int
) {
    fun passwordCheck(input: Int): Boolean {
        return input == password
    }
}

fun main() {

    val dff = User("Алешка",34452)
    val input = 34452
    println("Результат проверки пароля ${dff.passwordCheck(input)}")

}