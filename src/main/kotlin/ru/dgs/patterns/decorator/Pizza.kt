package ru.dgs.patterns.decorator

import java.math.BigDecimal
import java.math.RoundingMode

class Pizza(var amount: BigDecimal = BigDecimal.ONE, var label: String) : IOrder {
    override fun amount(): BigDecimal = amount;
    override fun label(): String = label;

}

class Double(order: IOrder) : IOrder {
    private var amount: BigDecimal
    private var label: String

    init {
        amount = order.amount().multiply(BigDecimal(2)).setScale(2, RoundingMode.UP)
        label = order.label()
    }

    override fun amount(): BigDecimal {
        return amount;
    }

    override fun label(): String {
        return "double $label"
    }
}