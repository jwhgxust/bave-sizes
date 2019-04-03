package cn.edu.gxust.jiweihuang.kotlin.unit

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MilliMeterTest {
    @Test
    fun getName() {
        assertEquals("MilliMeter", MilliMeter.name)
        assertEquals(MilliMeter.javaClass.simpleName, MilliMeter.name)
    }

    @Test
    fun getSymbol() {
        assertEquals("mm", MilliMeter.symbol)
    }

    @Test
    fun testToString() {
        println("MilliMeter:$MilliMeter")
    }

    @Test
    fun testInheritance() {
        println("MilliMeter:" + MilliMeter::class.objectInstance)
        println("MilliMeter:" + MilliMeter.javaClass.superclass)
        println("MilliMeter:" + MilliMeter.javaClass.superclass.superclass)
        println("MilliMeter:" + MilliMeter.javaClass.superclass.superclass.superclass)
        println("MilliMeter:" + MilliMeter.javaClass.superclass.superclass.superclass.superclass)
    }
}