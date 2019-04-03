package cn.edu.gxust.jiweihuang.kotlin.textile.unit

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class DenierTest {
    @Test
    fun getName() {
        assertEquals("Denier", Denier.name)
        assertEquals(Denier.javaClass.simpleName, Denier.name)
    }

    @Test
    fun getSymbol() {
        assertEquals("den", Denier.symbol)
    }

    @Test
    fun testToString() {
        println("Denier:$Denier")
    }

    @Test
    fun testInheritance() {
        println("Denier:" + Denier::class.objectInstance)
        println("Denier:" + Denier.javaClass.superclass)
        println("Denier:" + Denier.javaClass.superclass.superclass)
        println("Denier:" + Denier.javaClass.superclass.superclass.superclass)
        println("Denier:" + Denier.javaClass.superclass.superclass.superclass.superclass)
    }
}