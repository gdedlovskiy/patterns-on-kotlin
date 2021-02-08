package ru.dgs.patterns.strategy

import java.math.BigDecimal

class PayRequest {
    val totalAmount: BigDecimal;

    constructor(basket: Basket) {
        totalAmount = basket.orders.sumOf { order: Order -> order.amount }
    }
}