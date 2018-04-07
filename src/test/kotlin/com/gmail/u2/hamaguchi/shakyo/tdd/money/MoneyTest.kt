package com.gmail.u2.hamaguchi.shakyo.tdd.money

import org.amshove.kluent.shouldEqual
import org.amshove.kluent.shouldNotEqual
import org.junit.Test

class MoneyTest {
    @Test
    fun ドルに対し乗算できる() {
        val five = Dollar(5)
        var product = five.times(2)
        product.amount shouldEqual 10
        product = five.times(3)
        product.amount shouldEqual 15
    }

    @Test
    fun ドル金額の等価性を確認出来る() {
        Dollar(5) shouldEqual Dollar(5)
        Dollar(5) shouldNotEqual  Dollar(6)
    }
}


