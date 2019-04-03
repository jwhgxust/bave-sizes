package cn.edu.gxust.jiweihuang.kotlin.unit

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PicoMeterTest {

    @Test
    fun getName() {
        assertEquals("PicoMeter", PicoMeter.name)
        assertEquals(PicoMeter.javaClass.simpleName, PicoMeter.name)
    }

    @Test
    fun getSymbol() {
        assertEquals("pm", PicoMeter.symbol)
    }

    @Test
    fun testToSting() {
        println("PicoMeter:$PicoMeter")
    }

    @Test
    fun testInheritance() {
        println("PicoMeter:" + PicoMeter::class.objectInstance)
        println("PicoMeter:" + PicoMeter.javaClass.superclass)
        println("PicoMeter:" + PicoMeter.javaClass.superclass.superclass)
        println("PicoMeter:" + PicoMeter.javaClass.superclass.superclass.superclass)
        println("PicoMeter:" + PicoMeter.javaClass.superclass.superclass.superclass.superclass)
    }
}