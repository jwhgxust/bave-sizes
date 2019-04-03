package cn.edu.gxust.jiweihuang.kotlin.unit

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class DeciGramTest{
    @Test
    fun getName() {
        assertEquals("DeciGram", DeciGram.name)
        assertEquals(DeciGram.javaClass.simpleName, DeciGram.name)
    }

    @Test
    fun getSymbol() {
        assertEquals("dg", DeciGram.symbol)
    }

    @Test
    fun testToString() {
        println("DeciGram:$DeciGram")
    }

    @Test
    fun testInheritance() {
        println("DeciGram:" + DeciGram::class.objectInstance)
        println("DeciGram:" + DeciGram.javaClass.superclass)
        println("DeciGram:" + DeciGram.javaClass.superclass.superclass)
        println("DeciGram:" + DeciGram.javaClass.superclass.superclass.superclass)
        println("DeciGram:" + DeciGram.javaClass.superclass.superclass.superclass.superclass)
    }
}