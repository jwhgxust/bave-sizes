package cn.edu.gxust.jiweihuang.kotlin.unit

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CentiMeterTest {
    @Test
    fun getName() {
        assertEquals("CentiMeter", CentiMeter.name)
        assertEquals(CentiMeter.javaClass.simpleName, CentiMeter.name)
    }

    @Test
    fun getSymbol() {
        assertEquals("cm", CentiMeter.symbol)
    }

    @Test
    fun testToString() {
        println("CentiMeter:$CentiMeter")
    }

    @Test
    fun testInheritance() {
        println("CentiMeter:" + CentiMeter::class.objectInstance)
        println("CentiMeter:" + CentiMeter.javaClass.superclass)
        println("CentiMeter:" + CentiMeter.javaClass.superclass.superclass)
        println("CentiMeter:" + CentiMeter.javaClass.superclass.superclass.superclass)
        println("CentiMeter:" + CentiMeter.javaClass.superclass.superclass.superclass.superclass)
    }
}