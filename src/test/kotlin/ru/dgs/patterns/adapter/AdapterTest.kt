package ru.dgs.patterns.adapter

import org.junit.Test
import kotlin.test.assertEquals

class AdapterTest {

    @Test
    fun `device read with memory card`() {
        assertEquals("test_card_data", Device(Adapters.CardAdapter(MemoryCard("test_card_data"))).read())
    }

    @Test
    fun `device read with disk`() {
        assertEquals("test_disk_data", Device(Adapters.DiskAdapter(CD("test_disk_data"))).read())
    }

}