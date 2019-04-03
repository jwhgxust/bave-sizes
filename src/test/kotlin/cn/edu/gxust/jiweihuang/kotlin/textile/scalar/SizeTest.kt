package cn.edu.gxust.jiweihuang.kotlin.textile.scalar

import cn.edu.gxust.jiweihuang.kotlin.textile.unit.DTex
import cn.edu.gxust.jiweihuang.kotlin.textile.unit.Denier
import cn.edu.gxust.jiweihuang.kotlin.textile.unit.Tex
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class SizeTest {
    @BeforeEach
    fun setUp() {
        println()
    }

    @AfterEach
    fun tearDown() {
        println()
    }

    @Test
    fun testToString() {
        println("========Test toString()============")
        val oneDenier = Size(1.0, Denier)
        val oneTex = Size(1.0, Tex)
        val oneDTex = Size(1.0, DTex)

        println("oneDenier = $oneDenier")
        println("oneTex = $oneTex")
        println("oneDTex = $oneDTex")
    }

    @Test
    fun unitTo() {
        println("========Test unitTo()============")
        val oneDenier = Size(1.0, Denier)
        val oneTex = Size(1.0, Tex)
        val oneDTex = Size(1.0, DTex)

        println("oneDenier.unitTo(Tex) = ${oneDenier.unitTo(Tex)}")
        println("oneDenier.unitTo(DTex) = ${oneDenier.unitTo(DTex)}")

        println("oneTex.unitTo(DTex) = ${oneTex.unitTo(DTex)}")
        println("oneTex.unitTo(Denier) = ${oneTex.unitTo(Denier)}")

        println("oneDTex.unitTo(Denier) = ${oneDTex.unitTo(Denier)}")
        println("oneDTex.unitTo(Tex) = ${oneDTex.unitTo(Tex)}")

        assertEquals(oneDenier, oneDenier.unitTo(Tex).unitTo(Denier))
        assertEquals(oneDenier, oneDenier.unitTo(DTex).unitTo(Denier))

        println("oneDenier.unitTo(Tex).unitTo(Denier) = ${oneDenier.unitTo(Tex).unitTo(Denier)}")
        println("oneDenier.unitTo(DTex).unitTo(Denier) = ${oneDenier.unitTo(DTex).unitTo(Denier)}")

        assertEquals(oneDTex, oneDTex.unitTo(Denier).unitTo(DTex))
        assertEquals(oneDTex, oneDTex.unitTo(Tex).unitTo(DTex))

        println("oneDTex.unitTo(Denier).unitTo(DTex) = ${oneDTex.unitTo(Denier).unitTo(DTex)}")
        println("oneDTex.unitTo(Tex).unitTo(DTex) = ${oneDTex.unitTo(Tex).unitTo(DTex)}")

        assertEquals(oneTex, oneTex.unitTo(Denier).unitTo(Tex))
        assertEquals(oneTex, oneTex.unitTo(DTex).unitTo(Tex))

        println("oneTex.unitTo(Denier).unitTo(Tex) = ${oneTex.unitTo(Denier).unitTo(Tex)}")
        println("oneTex.unitTo(DTex).unitTo(Tex) = ${oneTex.unitTo(DTex).unitTo(Tex)}")
    }

    @Test
    fun unitTo2() {
        println("========Test unitTo2()============")
        val tenDenier = Size(10.0, Denier)
        val tenTex = Size(10.0, Tex)
        val tenDTex = Size(10.0, DTex)

        println("tenDenier.unitTo(Tex) = ${tenDenier.unitTo(Tex)}")
        println("tenDenier.unitTo(DTex) = ${tenDenier.unitTo(DTex)}")

        println("tenTex.unitTo(DTex) = ${tenTex.unitTo(DTex)}")
        println("tenTex.unitTo(Denier) = ${tenTex.unitTo(Denier)}")

        println("tenDTex.unitTo(Denier) = ${tenDTex.unitTo(Denier)}")
        println("tenDTex.unitTo(Tex) = ${tenDTex.unitTo(Tex)}")

        assertEquals(tenDenier, tenDenier.unitTo(Tex).unitTo(Denier))
        assertEquals(tenDenier, tenDenier.unitTo(DTex).unitTo(Denier))

        println("tenDenier.unitTo(Tex).unitTo(Denier) = ${tenDenier.unitTo(Tex).unitTo(Denier)}")
        println("tenDenier.unitTo(DTex).unitTo(Denier) = ${tenDenier.unitTo(DTex).unitTo(Denier)}")

        assertEquals(tenDTex, tenDTex.unitTo(Denier).unitTo(DTex))
        assertEquals(tenDTex, tenDTex.unitTo(Tex).unitTo(DTex))

        println("tenDTex.unitTo(Denier).unitTo(DTex) = ${tenDTex.unitTo(Denier).unitTo(DTex)}")
        println("tenDTex.unitTo(Tex).unitTo(DTex) = ${tenDTex.unitTo(Tex).unitTo(DTex)}")

        assertEquals(tenTex, tenTex.unitTo(Denier).unitTo(Tex))
        assertEquals(tenTex, tenTex.unitTo(DTex).unitTo(Tex))

        println("tenTex.unitTo(Denier).unitTo(Tex) = ${tenTex.unitTo(Denier).unitTo(Tex)}")
        println("tenTex.unitTo(DTex).unitTo(Tex) = ${tenTex.unitTo(DTex).unitTo(Tex)}")
    }

    @Test
    fun testEquals() {
        println("========Test equals()====================")

        assertEquals(Fineness(1.0, Denier), Fineness(1.0/9.0, Tex))
        assertEquals(Fineness(1.0, Denier), Fineness(10.0/9.0, DTex))

        assertEquals(Fineness(1.0, Tex), Fineness(9.0, Denier))
        assertEquals(Fineness(1.0, Tex), Fineness(10.0, DTex))

        assertEquals(Fineness(1.0, DTex), Fineness(0.9, Denier))
        assertEquals(Fineness(1.0, DTex), Fineness(0.1, Tex))
    }
}