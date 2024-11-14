package org.example.lesson_18

class Order(val number: Int) {

    fun showOrder(product: String) {
        val _product = product
        println("Заказан товар: $_product")
    }

    fun showOrder(product: List<String>) {

        println("Заказаны товары: ${product.joinToString(",")}")

    }

}

fun main() {

    val unoOrder = Order(3)

    unoOrder.showOrder("PlayStation 5")

    val moreThanOneOrders = Order(4)
    moreThanOneOrders.showOrder(listOf("клюшка", "иксбокс", "гитара"))

}