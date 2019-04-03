package cn.edu.gxust.jiweihuang.kotlin.unit

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class PointTest{
    @Test
    fun getName() {
        assertEquals("Point", Point.name)
        assertEquals(Point.javaClass.simpleName, Point.name)
    }

    @Test
    fun getSymbol() {
        assertEquals("point", Point.symbol)
    }

    @Test
    fun testToString() {
        println("Point:$Point")
    }

    @Test
    fun testInheritance() {
        println("Point:" + Point::class.objectInstance)
        println("Point:" + Point.javaClass.superclass)
        println("Point:" + Point.javaClass.superclass.superclass)
        println("Point:" + Point.javaClass.superclass.superclass.superclass)
        println("Point:" + Point.javaClass.superclass.superclass.superclass.superclass)
    }
}