package com.gmail.u2.hamaguchi.shakyo.tdd.money

data class Franc(override val amount: Int): Money {
    fun times(multiplier: Int) = Franc(amount * multiplier)
}