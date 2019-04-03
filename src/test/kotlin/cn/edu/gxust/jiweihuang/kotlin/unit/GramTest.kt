package cn.edu.gxust.jiweihuang.kotlin.unit

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class GramTest {
    @Test
    fun getName() {
        assertEquals("Gram", Gram.name)
        assertEquals(Gram.javaClass.simpleName, Gram.name)
    }

    @Test
    fun getSymbol() {
        assertEquals("g", Gram.symbol)
    }

    @Test
    fun testToString() {
        println("Gram:$Gram")
    }

    @Test
    fun testInheritance() {
        println("Gram:" + Gram::class.objectInstance)
        println("Gram:" + Gram.javaClass.superclass)
        println("Gram:" + Gram.javaClass.superclass.superclass)
        println("Gram:" + Gram.javaClass.superclass.superclass.superclass)
        println("Gram:" + Gram.javaClass.superclass.superclass.superclass.superclass)
    }
}