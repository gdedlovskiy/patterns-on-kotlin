package ru.dgs.patterns.factoryMethod

class Car : ITransport {
    override fun load(product: String) {
        println("$product loaded in the car")
    }

    override fun delivery(product: String) {
        println("car is delivering $product")
    }
}