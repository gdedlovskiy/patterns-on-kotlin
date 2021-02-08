package ru.dgs.patterns.strategy

class User {

    fun pay(basket: Basket, strategy: IPayStrategy):PayResult {
        return strategy.pay(PayRequest(basket))
    }
}