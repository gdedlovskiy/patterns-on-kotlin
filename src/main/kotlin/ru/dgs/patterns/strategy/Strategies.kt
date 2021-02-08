package ru.dgs.patterns.strategy

class Strategies {

    companion object {
        fun payPal(): IPayStrategy {
            return IPayStrategy { request ->
                println("Connect to PayPal")
                println("auth..")
                println("check balance")
                println("pay ${request.totalAmount}")
                PayResult(true)
            }
        }

        fun card(): IPayStrategy {
            return IPayStrategy { request ->
                println("Prepare pay ${request.totalAmount}")
                println("Connect to card processing")
                val payResult = PayResult(false)
                payResult.errorMsg = "Fail connect"
                return@IPayStrategy payResult;
            }
        }

        fun phone(): IPayStrategy {
            return IPayStrategy { request ->
                println("Prepare pay ${request.totalAmount}")
                println("pay by phone")
                PayResult(true)
            }
        }
    }
}