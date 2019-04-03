package cn.edu.gxust.jiweihuang.kotlin.unit

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MilliGramTest{
    @Test
    fun getName() {
        assertEquals("MilliGram", MilliGram.name)
        assertEquals(MilliGram.javaClass.simpleName, MilliGram.name)
    }

    @Test
    fun getSymbol() {
        assertEquals("mg", MilliGram.symbol)
    }

    @Test
    fun testToString() {
        println("MilliGram:$MilliGram")
    }

    @Test
    fun testInheritance() {
        println("MilliGram:" + MilliGram::class.objectInstance)
        println("MilliGram:" + MilliGram.javaClass.superclass)
        println("MilliGram:" + MilliGram.javaClass.superclass.superclass)
        println("MilliGram:" + MilliGram.javaClass.superclass.superclass.superclass)
        println("MilliGram:" + MilliGram.javaClass.superclass.superclass.superclass.superclass)
    }
}