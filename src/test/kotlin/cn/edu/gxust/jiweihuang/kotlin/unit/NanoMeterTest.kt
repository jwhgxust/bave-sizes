package cn.edu.gxust.jiweihuang.kotlin.unit

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class NanoMeterTest {

    @Test
    fun getName() {
        assertEquals("NanoMeter", NanoMeter.name)
        assertEquals(NanoMeter.javaClass.simpleName, NanoMeter.name)
    }

    @Test
    fun getSymbol() {
        assertEquals("nm", NanoMeter.symbol)
    }

    @Test
    fun testToString() {
        println("NanoMeter:$NanoMeter")
    }

    @Test
    fun testInheritance() {
        println("NanoMeter:" + NanoMeter::class.objectInstance)
        println("NanoMeter:" + NanoMeter.javaClass.superclass)
        println("NanoMeter:" + NanoMeter.javaClass.superclass.superclass)
        println("NanoMeter:" + NanoMeter.javaClass.superclass.superclass.superclass)
        println("NanoMeter:" + NanoMeter.javaClass.superclass.superclass.superclass.superclass)
    }
}