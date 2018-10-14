package com.gmail.u2.hamaguchi.shakyo.tdd.money

data class Dollar(override val amount: Int) : Money {
    override fun times(multiplier: Int): Money = Dollar(amount * multiplier)
}