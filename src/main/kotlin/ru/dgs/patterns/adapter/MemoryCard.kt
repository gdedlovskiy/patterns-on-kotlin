package ru.dgs.patterns.adapter

class MemoryCard(private var value: String = "card_data") {

    fun getData(): String {
        return value;
    }

}