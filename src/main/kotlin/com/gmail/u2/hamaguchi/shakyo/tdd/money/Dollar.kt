package com.gmail.u2.hamaguchi.shakyo.tdd.money

data class Dollar(override val amount: Int): Money {
    fun times(multiplier: Int) = Dollar(amount * multiplier)
}