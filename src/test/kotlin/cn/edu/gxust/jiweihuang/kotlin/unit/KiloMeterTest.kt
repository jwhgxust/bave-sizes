package cn.edu.gxust.jiweihuang.kotlin.unit

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class KiloMeterTest {
    @Test
    fun getName() {
        assertEquals("KiloMeter", KiloMeter.name)
        assertEquals(KiloMeter.javaClass.simpleName, KiloMeter.name)
    }

    @Test
    fun getSymbol() {
        assertEquals("km", KiloMeter.symbol)
    }

    @Test
    fun testToString() {
        println("KiloMeter:$KiloMeter")
    }

    @Test
    fun testInheritance() {
        println("KiloMeter:" + KiloMeter::class.objectInstance)
        println("KiloMeter:" + KiloMeter.javaClass.superclass)
        println("KiloMeter:" + KiloMeter.javaClass.superclass.superclass)
        println("KiloMeter:" + KiloMeter.javaClass.superclass.superclass.superclass)
        println("KiloMeter:" + KiloMeter.javaClass.superclass.superclass.superclass.superclass)
    }
}