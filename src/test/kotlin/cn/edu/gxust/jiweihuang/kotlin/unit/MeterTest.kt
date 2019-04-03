package cn.edu.gxust.jiweihuang.kotlin.unit

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MeterTest{
    @Test
    fun getName() {
        assertEquals("Meter", Meter.name)
        assertEquals(Meter.javaClass.simpleName, Meter.name)
    }

    @Test
    fun getSymbol() {
        assertEquals("m", Meter.symbol)
    }

    @Test
    fun testToString() {
        println("Meter:$Meter")
    }

    @Test
    fun testInheritance() {
        println("Meter:" + Meter::class.objectInstance)
        println("Meter:" + Meter.javaClass.superclass)
        println("Meter:" + Meter.javaClass.superclass.superclass)
        println("Meter:" + Meter.javaClass.superclass.superclass.superclass)
        println("Meter:" + Meter.javaClass.superclass.superclass.superclass.superclass)
    }
}