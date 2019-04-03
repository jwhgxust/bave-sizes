package cn.edu.gxust.jiweihuang.kotlin.unit

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CentiGramTest{
    @Test
    fun getName() {
        assertEquals("CentiGram", CentiGram.name)
        assertEquals(CentiGram.javaClass.simpleName, CentiGram.name)
    }

    @Test
    fun getSymbol() {
        assertEquals("cg", CentiGram.symbol)
    }

    @Test
    fun testToString() {
        println("CentiGram:$CentiGram")
    }

    @Test
    fun testInheritance() {
        println("CentiGram:" + CentiGram::class.objectInstance)
        println("CentiGram:" + CentiGram.javaClass.superclass)
        println("CentiGram:" + CentiGram.javaClass.superclass.superclass)
        println("CentiGram:" + CentiGram.javaClass.superclass.superclass.superclass)
        println("CentiGram:" + CentiGram.javaClass.superclass.superclass.superclass.superclass)
    }
}