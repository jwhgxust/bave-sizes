package cn.edu.gxust.jiweihuang.kotlin.unit

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class QuintalTest{
    @Test
    fun getName() {
        assertEquals("Quintal", Quintal.name)
        assertEquals(Quintal.javaClass.simpleName, Quintal.name)
    }

    @Test
    fun getSymbol() {
        assertEquals("q", Quintal.symbol)
    }

    @Test
    fun testToString() {
        println("Quintal:$Quintal")
    }

    @Test
    fun testInheritance() {
        println("Quintal:" + Quintal::class.objectInstance)
        println("Quintal:" + Quintal.javaClass.superclass)
        println("Quintal:" + Quintal.javaClass.superclass.superclass)
        println("Quintal:" + Quintal.javaClass.superclass.superclass.superclass)
        println("Quintal:" + Quintal.javaClass.superclass.superclass.superclass.superclass)
    }
}