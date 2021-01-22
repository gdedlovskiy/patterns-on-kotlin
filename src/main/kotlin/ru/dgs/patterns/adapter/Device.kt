package ru.dgs.patterns.adapter

class Device(private val reader: IReader) {

    fun read(): String {
        return reader.read();
    }
}
