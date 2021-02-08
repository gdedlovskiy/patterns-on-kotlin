package ru.dgs.patterns.strategy

import java.math.BigDecimal

class Basket {
    val orders: MutableList<Order> = mutableListOf()

}

class Order(val amount: BigDecimal, val name: String) {

}
