package com.gmail.u2.hamaguchi.shakyo.tdd.money

import jdk.internal.org.objectweb.asm.tree.FrameNode
import org.amshove.kluent.shouldEqual
import org.amshove.kluent.shouldNotEqual
import org.junit.Test

class MoneyTest {
    @Test
    fun ドルに対し乗算できる() {
        val five = Dollar(5)
        five.times(2) shouldEqual Dollar(10)
        five.times(3) shouldEqual Dollar(15)
    }

    @Test
    fun 金額の等価性を確認出来る() {
        Dollar(5) shouldEqual Dollar(5)
        Dollar(5) shouldNotEqual  Dollar(6)
        Franc(5) shouldEqual Franc(5)
        Franc(5) shouldNotEqual  Franc(6)
        Franc(5) shouldNotEqual  Dollar(5)
    }

    @Test
    fun フランに対し乗算できる() {
        val five = Franc(5)
        five.times(2) shouldEqual Franc(10)
        five.times(3) shouldEqual Franc(15)
    }

}


