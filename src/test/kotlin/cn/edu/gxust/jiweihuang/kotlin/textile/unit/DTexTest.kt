package cn.edu.gxust.jiweihuang.kotlin.textile.unit

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class DTexTest{
    @Test
    fun getName() {
        assertEquals("DTex", DTex.name)
        assertEquals(DTex.javaClass.simpleName, DTex.name)
    }

    @Test
    fun getSymbol() {
        assertEquals("dtex", DTex.symbol)
    }

    @Test
    fun testToString() {
        println("DTex:$DTex")
    }

    @Test
    fun testInheritance() {
        println("DTex:" + DTex::class.objectInstance)
        println("DTex:" + DTex.javaClass.superclass)
        println("DTex:" + DTex.javaClass.superclass.superclass)
        println("DTex:" + DTex.javaClass.superclass.superclass.superclass)
        println("DTex:" + DTex.javaClass.superclass.superclass.superclass.superclass)
    }
}