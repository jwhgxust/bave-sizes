package cn.edu.gxust.jiweihuang.kotlin.unit

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MicroGramTest{
    @Test
    fun getName() {
        assertEquals("MicroGram", MicroGram.name)
        assertEquals(MicroGram.javaClass.simpleName, MicroGram.name)
    }

    @Test
    fun getSymbol() {
        assertEquals("μg", MicroGram.symbol)
    }

    @Test
    fun testToString() {
        println("MicroGram:$MicroGram")
    }

    @Test
    fun testInheritance() {
        println("MicroGram:" + MicroGram::class.objectInstance)
        println("MicroGram:" + MicroGram.javaClass.superclass)
        println("MicroGram:" + MicroGram.javaClass.superclass.superclass)
        println("MicroGram:" + MicroGram.javaClass.superclass.superclass.superclass)
        println("MicroGram:" + MicroGram.javaClass.superclass.superclass.superclass.superclass)
    }
}