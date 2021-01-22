package ru.dgs.patterns.factoryMethod

abstract class TransportPark {

    fun delivery(product: String) {
        println("Start delivery")
        println("packing $product")
        val transport = createTransport()
        transport.load(product)
        transport.delivery(product);
        println("end delivery")
        println("----------------------------")
    }

    protected abstract fun createTransport(): ITransport
}