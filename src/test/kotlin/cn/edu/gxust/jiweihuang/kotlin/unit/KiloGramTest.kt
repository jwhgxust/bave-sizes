package cn.edu.gxust.jiweihuang.kotlin.unit

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class KiloGramTest{
    @Test
    fun getName() {
        assertEquals("KiloGram", KiloGram.name)
        assertEquals(KiloGram.javaClass.simpleName, KiloGram.name)
    }

    @Test
    fun getSymbol() {
        assertEquals("kg", KiloGram.symbol)
    }

    @Test
    fun testToString() {
        println("KiloGram:$KiloGram")
    }

    @Test
    fun testInheritance() {
        println("KiloGram:" + KiloGram::class.objectInstance)
        println("KiloGram:" + KiloGram.javaClass.superclass)
        println("KiloGram:" + KiloGram.javaClass.superclass.superclass)
        println("KiloGram:" + KiloGram.javaClass.superclass.superclass.superclass)
        println("KiloGram:" + KiloGram.javaClass.superclass.superclass.superclass.superclass)
    }
}