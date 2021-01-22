package ru.dgs.patterns.factoryMethod

class Aircraft : ITransport {
    override fun load(product: String) {
        println("$product loaded in aircraft")
    }

    override fun delivery(product: String) {
        println("aircraft is delivering $product")
    }
}