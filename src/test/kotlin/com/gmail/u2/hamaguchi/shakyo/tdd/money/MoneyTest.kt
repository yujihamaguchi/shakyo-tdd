package com.gmail.u2.hamaguchi.shakyo.tdd.money

import org.junit.Test
import org.amshove.kluent.*

class MoneyTest {
    @Test
    fun ドルに対し乗算できる() {
        val five: Money = Money.dollar(5)
        five.times(2) shouldEqual Money.dollar(10)
        five.times(3) shouldEqual Money.dollar(15)
    }

    @Test
    fun 金額の等価性を確認出来る() {
        Money.dollar(5) shouldEqual Money.dollar(5)
        Money.dollar(5) shouldNotEqual  Money.dollar(6)
        Money.franc(5) shouldEqual Money.franc(5)
        Money.franc(5) shouldNotEqual  Money.franc(6)
        Franc(5) shouldNotEqual Money.dollar(5)
    }

    @Test
    fun フランに対し乗算できる() {
        val five = Money.franc(5)
        five.times(2) shouldEqual Money.franc(10)
        five.times(3) shouldEqual Money.franc(15)
    }

}


