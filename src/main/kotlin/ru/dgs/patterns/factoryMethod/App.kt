package ru.dgs.patterns.factoryMethod


fun main() {
    selectPark(DeliveryMode.FAST).delivery("meat")
    selectPark(DeliveryMode.SLOW).delivery("bread")
}


fun selectPark(mode: DeliveryMode): TransportPark {
    if (DeliveryMode.FAST == mode) {
        return AircraftPark()
    } else {
        return CarPark()
    }
}

enum class DeliveryMode {
    SLOW,
    FAST
}
