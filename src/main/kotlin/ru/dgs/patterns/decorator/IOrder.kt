package ru.dgs.patterns.decorator

import java.math.BigDecimal

interface IOrder {

    fun amount(): BigDecimal

    fun label(): String
}