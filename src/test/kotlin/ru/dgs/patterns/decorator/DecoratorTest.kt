package ru.dgs.patterns.decorator

import org.junit.Assert.*
import org.junit.Test
import java.math.BigDecimal
import java.math.RoundingMode

class DecoratorTest {

    @Test
    fun `double decorator`() {
        val pizza = Double(Pizza(BigDecimal(10.1), "pizza"))
        assertEquals(BigDecimal(20.2).setScale(2, RoundingMode.UP), pizza.amount())
        assertEquals("double pizza", pizza.label())
    }

}