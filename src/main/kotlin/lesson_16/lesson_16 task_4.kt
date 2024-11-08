package org.example.lesson_16

//Создай класс, описывающий заказ в интернет-магазине.
// В заказе должны быть номер заказа и статус готовности. Номер заказа должен быть недоступен для изменения.
//
//Создай метод, который меняет статус заказа.
// Поменять статус заказа можно только отправив заявку менеджеру.
// Имитируй это действие отдельной публичной функцией.
// Она будет принимать новый статус и обращаться к внутреннему методу класса для изменения статуса.

class _Order(
    val number: Int = 2,
    var status: String = "Готовится"
) {

    var newStatus = ""
    fun manager() {
        println("Заявка менеджеру принята")
        newStatus = "Готов к выдаче"
    }

    fun orderChange(newStatus: String) {
        if (newStatus == "Готов к выдаче") status = "Готов к выдаче"
    }
}

fun main() {
    val order = _Order()
    println("${order.status}")
    order.manager()
    order.orderChange(order.newStatus)
    println("${order.status}")
}