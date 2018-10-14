package com.gmail.u2.hamaguchi.shakyo.tdd.money

interface Money {
    val amount: Int
    companion object {
        fun dollar(amount: Int): Money = Dollar(amount)
        fun franc(amount: Int): Money = Franc(amount)
    }

    fun times(amount: Int): Money
}
