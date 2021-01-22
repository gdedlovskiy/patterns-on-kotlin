package ru.dgs.patterns.factoryMethod

class CarPark : TransportPark() {

    override fun createTransport(): ITransport {
        return Car()
    }

}