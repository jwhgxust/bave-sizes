package cn.edu.gxust.jiweihuang.kotlin.textile.unit

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MetricNumberTest {
    @Test
    fun getName() {
        assertEquals("MetricNumber", MetricNumber.name)
        assertEquals(MetricNumber.javaClass.simpleName, MetricNumber.name)
    }

    @Test
    fun getSymbol() {
        assertEquals("Nm", MetricNumber.symbol)
    }

    @Test
    fun testToString() {
        println("MetricNumber:$MetricNumber")
    }

    @Test
    fun testInheritance() {
        println("MetricNumber:" + MetricNumber::class.objectInstance)
        println("MetricNumber:" + MetricNumber.javaClass.superclass)
        println("MetricNumber:" + MetricNumber.javaClass.superclass.superclass)
        println("MetricNumber:" + MetricNumber.javaClass.superclass.superclass.superclass)
        println("MetricNumber:" + MetricNumber.javaClass.superclass.superclass.superclass.superclass)
    }
}