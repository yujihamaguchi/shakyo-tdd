package com.gmail.u2.hamaguchi.shakyo.tdd.money

data class Franc(override val amount: Int): Money {
    override fun times(multiplier: Int): Money = Franc(amount * multiplier)
}