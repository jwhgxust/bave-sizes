package cn.edu.gxust.jiweihuang.kotlin.unit

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MetricTonTest {
    @Test
    fun getName() {
        assertEquals("MetricTon", MetricTon.name)
        assertEquals(MetricTon.javaClass.simpleName, MetricTon.name)
    }

    @Test
    fun getSymbol() {
        assertEquals("t", MetricTon.symbol)
    }

    @Test
    fun testToString() {
        println("MetricTon:$MetricTon")
    }

    @Test
    fun testInheritance() {
        println("MetricTon:" + MetricTon::class.objectInstance)
        println("MetricTon:" + MetricTon.javaClass.superclass)
        println("MetricTon:" + MetricTon.javaClass.superclass.superclass)
        println("MetricTon:" + MetricTon.javaClass.superclass.superclass.superclass)
        println("MetricTon:" + MetricTon.javaClass.superclass.superclass.superclass.superclass)
    }
}