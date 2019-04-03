package cn.edu.gxust.jiweihuang.kotlin.unit

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MicroMeterTest {

    @Test
    fun getName() {
        assertEquals("MicroMeter", MicroMeter.name)
        assertEquals(MicroMeter.javaClass.simpleName, MicroMeter.name)
    }

    @Test
    fun getSymbol() {
        assertEquals("μm", MicroMeter.symbol)
    }

    @Test
    fun testToString() {
        println("MicroMeter:${MicroMeter}")
    }

    @Test
    fun testInheritance() {
        println("MicroMeter:" + MicroMeter::class.objectInstance)
        println("MicroMeter:" + MicroMeter.javaClass.superclass)
        println("MicroMeter:" + MicroMeter.javaClass.superclass.superclass)
        println("MicroMeter:" + MicroMeter.javaClass.superclass.superclass.superclass)
        println("MicroMeter:" + MicroMeter.javaClass.superclass.superclass.superclass.superclass)
    }
}