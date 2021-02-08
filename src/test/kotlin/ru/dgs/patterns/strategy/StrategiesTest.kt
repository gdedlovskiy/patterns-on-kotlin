package ru.dgs.patterns.strategy

import org.junit.Test
import java.math.BigDecimal

class StrategiesTest {


    @Test
    fun `pay by various strategies`() {
        val basket = Basket()
        basket.orders.add(Order(BigDecimal.TEN, "milk"))
        basket.orders.add(Order(BigDecimal("34.55"), "meat"))
        basket.orders.add(Order(BigDecimal("0.11"), "bread"))
        val user = User()
        user.pay(basket, Strategies.payPal())
        println("============")
        user.pay(basket, Strategies.card())
        println("============")
        user.pay(basket, Strategies.phone())
    }
}