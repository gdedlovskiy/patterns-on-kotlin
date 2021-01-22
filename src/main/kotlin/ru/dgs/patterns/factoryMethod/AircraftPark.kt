package ru.dgs.patterns.factoryMethod

class AircraftPark : TransportPark() {

    override fun createTransport(): ITransport {
        return Aircraft()
    }

}