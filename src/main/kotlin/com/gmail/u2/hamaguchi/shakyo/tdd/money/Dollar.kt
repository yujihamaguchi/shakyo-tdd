package com.gmail.u2.hamaguchi.shakyo.tdd.money

data class Dollar(val amount: Int) {
    fun times(multiplier: Int) = Dollar(amount * multiplier)
}