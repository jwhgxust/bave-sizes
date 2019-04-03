package cn.edu.gxust.jiweihuang.kotlin.textile.unit

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class TexTest{
    @Test
    fun getName() {
        assertEquals("Tex", Tex.name)
        assertEquals(Tex.javaClass.simpleName, Tex.name)
    }

    @Test
    fun getSymbol() {
        assertEquals("tex", Tex.symbol)
    }

    @Test
    fun testToString() {
        println("Tex:$Tex")
    }

    @Test
    fun testInheritance() {
        println("Tex:" + Tex::class.objectInstance)
        println("Tex:" + Tex.javaClass.superclass)
        println("Tex:" + Tex.javaClass.superclass.superclass)
        println("Tex:" + Tex.javaClass.superclass.superclass.superclass)
        println("Tex:" + Tex.javaClass.superclass.superclass.superclass.superclass)
    }
}