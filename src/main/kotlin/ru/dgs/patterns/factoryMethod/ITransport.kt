package ru.dgs.patterns.factoryMethod

interface ITransport {

    fun load(product: String)

    fun delivery(product: String)
}