package ru.dgs.patterns.adapter

class Adapters {

    open class CardAdapter(private var card: MemoryCard) : IReader {
        override fun read(): String {
            return card.getData();
        }
    }
    open class DiskAdapter(private var disk:CD) : IReader {
        override fun read(): String {
            return disk.getData();
        }
    }
}