package cn.edu.gxust.jiweihuang.kotlin.unit

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class KaratTest{
    @Test
    fun getName() {
        assertEquals("Karat", Karat.name)
        assertEquals(Karat.javaClass.simpleName, Karat.name)
    }

    @Test
    fun getSymbol() {
        assertEquals("ct", Karat.symbol)
    }

    @Test
    fun testToString() {
        println("Karat:$Karat")
    }

    @Test
    fun testInheritance() {
        println("Karat:" + Karat::class.objectInstance)
        println("Karat:" + Karat.javaClass.superclass)
        println("Karat:" + Karat.javaClass.superclass.superclass)
        println("Karat:" + Karat.javaClass.superclass.superclass.superclass)
        println("Karat:" + Karat.javaClass.superclass.superclass.superclass.superclass)
    }
}