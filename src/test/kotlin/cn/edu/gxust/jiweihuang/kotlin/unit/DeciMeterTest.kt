package cn.edu.gxust.jiweihuang.kotlin.unit

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class DeciMeterTest{
    @Test
    fun getName() {
        assertEquals("DeciMeter", DeciMeter.name)
        assertEquals(DeciMeter.javaClass.simpleName, DeciMeter.name)
    }

    @Test
    fun getSymbol() {
        assertEquals("dm", DeciMeter.symbol)
    }

    @Test
    fun testToString() {
        println("DeciMeter:$DeciMeter")
    }

    @Test
    fun testInheritance() {
        println("DeciMeter:" + DeciMeter::class.objectInstance)
        println("DeciMeter:" + DeciMeter.javaClass.superclass)
        println("DeciMeter:" + DeciMeter.javaClass.superclass.superclass)
        println("DeciMeter:" + DeciMeter.javaClass.superclass.superclass.superclass)
        println("DeciMeter:" + DeciMeter.javaClass.superclass.superclass.superclass.superclass)
    }
}