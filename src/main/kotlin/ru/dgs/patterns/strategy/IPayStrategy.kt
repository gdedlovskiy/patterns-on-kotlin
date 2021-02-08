package ru.dgs.patterns.strategy

fun interface IPayStrategy {

    fun pay(x: PayRequest): PayResult
}