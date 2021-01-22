package ru.dgs.patterns.adapter

class CD(private var value: String = "disk_data") {

    fun getData(): String {
        return value;
    }

}