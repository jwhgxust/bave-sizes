package cn.edu.gxust.jiweihuang.kotlin.textile.scalar

import cn.edu.gxust.jiweihuang.kotlin.textile.unit.DTex
import cn.edu.gxust.jiweihuang.kotlin.textile.unit.Denier
import cn.edu.gxust.jiweihuang.kotlin.textile.unit.MetricNumber
import cn.edu.gxust.jiweihuang.kotlin.textile.unit.Tex
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class FinenessTest {
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
        println("========Test toString()====================")
        val oneNm = Fineness(1.0, MetricNumber)
        val oneDenier = Fineness(1.0, Denier)
        val oneTex = Fineness(1.0, Tex)
        val oneDTex = Fineness(1.0, DTex)

        println("oneNm = $oneNm")
        println("oneDenier = $oneDenier")
        println("oneTex = $oneTex")
        println("oneDTex = $oneDTex")
    }

    @Test
    fun unitTo() {
        println("========Test unitTo()====================")
        val oneNm = Fineness(1.0, MetricNumber)
        val oneDenier = Fineness(1.0, Denier)
        val oneTex = Fineness(1.0, Tex)
        val oneDTex = Fineness(1.0, DTex)

        println("oneNm.unitTo(Denier) = ${oneNm.unitTo(Denier)}")
        println("oneNm.unitTo(Tex) = ${oneNm.unitTo(Tex)}")
        println("oneNm.unitTo(DTex) = ${oneNm.unitTo(DTex)}")

        println("oneDenier.unitTo(MetricNumber) = ${oneDenier.unitTo(MetricNumber)}")
        println("oneDenier.unitTo(Tex) = ${oneDenier.unitTo(Tex)}")
        println("oneDenier.unitTo(DTex) = ${oneDenier.unitTo(DTex)}")

        println("oneTex.unitTo(MetricNumber) = ${oneTex.unitTo(MetricNumber)}")
        println("oneTex.unitTo(DTex) = ${oneTex.unitTo(DTex)}")
        println("oneTex.unitTo(Denier) = ${oneTex.unitTo(Denier)}")

        println("oneDTex.unitTo(MetricNumber) = ${oneDTex.unitTo(MetricNumber)}")
        println("oneDTex.unitTo(Denier) = ${oneDTex.unitTo(Denier)}")
        println("oneDTex.unitTo(Tex) = ${oneDTex.unitTo(Tex)}")

        assertEquals(oneDenier, oneDenier.unitTo(MetricNumber).unitTo(Denier))
        assertEquals(oneDenier, oneDenier.unitTo(Tex).unitTo(Denier))
        assertEquals(oneDenier, oneDenier.unitTo(DTex).unitTo(Denier))

        println("oneDenier.unitTo(MetricNumber).unitTo(Denier) = ${oneDenier.unitTo(MetricNumber).unitTo(Denier)}")
        println("oneDenier.unitTo(Tex).unitTo(Denier) = ${oneDenier.unitTo(Tex).unitTo(Denier)}")
        println("oneDenier.unitTo(DTex).unitTo(Denier) = ${oneDenier.unitTo(DTex).unitTo(Denier)}")

        assertEquals(oneNm, oneNm.unitTo(Denier).unitTo(MetricNumber))
        assertEquals(oneNm, oneNm.unitTo(DTex).unitTo(MetricNumber))
        assertEquals(oneNm, oneNm.unitTo(Tex).unitTo(MetricNumber))

        println("oneNm.unitTo(Denier).unitTo(MetricNumber) = ${oneNm.unitTo(Denier).unitTo(MetricNumber)}")
        println("oneNm.unitTo(DTex).unitTo(MetricNumber) = ${oneNm.unitTo(DTex).unitTo(MetricNumber)}")
        println("oneNm.unitTo(Tex).unitTo(MetricNumber) = ${oneNm.unitTo(Tex).unitTo(MetricNumber)}")

        assertEquals(oneDTex, oneDTex.unitTo(Denier).unitTo(DTex))
        assertEquals(oneDTex, oneDTex.unitTo(MetricNumber).unitTo(DTex))
        assertEquals(oneDTex, oneDTex.unitTo(Tex).unitTo(DTex))

        println("oneDTex.unitTo(Denier).unitTo(DTex) = ${oneDTex.unitTo(Denier).unitTo(DTex)}")
        println("oneDTex.unitTo(MetricNumber).unitTo(DTex) = ${oneDTex.unitTo(MetricNumber).unitTo(DTex)}")
        println("oneDTex.unitTo(Tex).unitTo(DTex) = ${oneDTex.unitTo(Tex).unitTo(DTex)}")

        assertEquals(oneTex, oneTex.unitTo(Denier).unitTo(Tex))
        assertEquals(oneTex, oneTex.unitTo(MetricNumber).unitTo(Tex))
        assertEquals(oneTex, oneTex.unitTo(DTex).unitTo(Tex))

        println("oneTex.unitTo(Denier).unitTo(Tex) = ${oneTex.unitTo(Denier).unitTo(Tex)}")
        println("oneTex.unitTo(MetricNumber).unitTo(Tex) = ${oneTex.unitTo(MetricNumber).unitTo(Tex)}")
        println("oneTex.unitTo(DTex).unitTo(Tex) = ${oneTex.unitTo(DTex).unitTo(Tex)}")
    }

    @Test
    fun unitTo2() {
        println("========Test unitTo2()====================")
        val tenNm = Fineness(10.0, MetricNumber)
        val tenDenier = Fineness(10.0, Denier)
        val tenTex = Fineness(10.0, Tex)
        val tenDTex = Fineness(10.0, DTex)

        println("tenNm.unitTo(Denier) = ${tenNm.unitTo(Denier)}")
        println("tenNm.unitTo(Tex) = ${tenNm.unitTo(Tex)}")
        println("tenNm.unitTo(DTex) = ${tenNm.unitTo(DTex)}")

        println("tenDenier.unitTo(MetricNumber) = ${tenDenier.unitTo(MetricNumber)}")
        println("tenDenier.unitTo(Tex) = ${tenDenier.unitTo(Tex)}")
        println("tenDenier.unitTo(DTex) = ${tenDenier.unitTo(DTex)}")

        println("tenTex.unitTo(MetricNumber) = ${tenTex.unitTo(MetricNumber)}")
        println("tenTex.unitTo(DTex) = ${tenTex.unitTo(DTex)}")
        println("tenTex.unitTo(Denier) = ${tenTex.unitTo(Denier)}")

        println("tenDTex.unitTo(MetricNumber) = ${tenDTex.unitTo(MetricNumber)}")
        println("tenDTex.unitTo(Denier) = ${tenDTex.unitTo(Denier)}")
        println("tenDTex.unitTo(Tex) = ${tenDTex.unitTo(Tex)}")

        assertEquals(tenDenier, tenDenier.unitTo(MetricNumber).unitTo(Denier))
        assertEquals(tenDenier, tenDenier.unitTo(Tex).unitTo(Denier))
        assertEquals(tenDenier, tenDenier.unitTo(DTex).unitTo(Denier))

        println("tenDenier.unitTo(MetricNumber).unitTo(Denier) = ${tenDenier.unitTo(MetricNumber).unitTo(Denier)}")
        println("tenDenier.unitTo(Tex).unitTo(Denier) = ${tenDenier.unitTo(Tex).unitTo(Denier)}")
        println("tenDenier.unitTo(DTex).unitTo(Denier) = ${tenDenier.unitTo(DTex).unitTo(Denier)}")

        assertEquals(tenNm, tenNm.unitTo(Denier).unitTo(MetricNumber))
        assertEquals(tenNm, tenNm.unitTo(DTex).unitTo(MetricNumber))
        assertEquals(tenNm, tenNm.unitTo(Tex).unitTo(MetricNumber))

        println("tenNm.unitTo(Denier).unitTo(MetricNumber) = ${tenNm.unitTo(Denier).unitTo(MetricNumber)}")
        println("tenNm.unitTo(DTex).unitTo(MetricNumber) = ${tenNm.unitTo(DTex).unitTo(MetricNumber)}")
        println("tenNm.unitTo(Tex).unitTo(MetricNumber) = ${tenNm.unitTo(Tex).unitTo(MetricNumber)}")

        assertEquals(tenDTex, tenDTex.unitTo(Denier).unitTo(DTex))
        assertEquals(tenDTex, tenDTex.unitTo(MetricNumber).unitTo(DTex))
        assertEquals(tenDTex, tenDTex.unitTo(Tex).unitTo(DTex))

        println("tenDTex.unitTo(Denier).unitTo(DTex) = ${tenDTex.unitTo(Denier).unitTo(DTex)}")
        println("tenDTex.unitTo(MetricNumber).unitTo(DTex) = ${tenDTex.unitTo(MetricNumber).unitTo(DTex)}")
        println("tenDTex.unitTo(Tex).unitTo(DTex) = ${tenDTex.unitTo(Tex).unitTo(DTex)}")

        assertEquals(tenTex, tenTex.unitTo(Denier).unitTo(Tex))
        assertEquals(tenTex, tenTex.unitTo(MetricNumber).unitTo(Tex))
        assertEquals(tenTex, tenTex.unitTo(DTex).unitTo(Tex))

        println("tenTex.unitTo(Denier).unitTo(Tex) = ${tenTex.unitTo(Denier).unitTo(Tex)}")
        println("tenTex.unitTo(MetricNumber).unitTo(Tex) = ${tenTex.unitTo(MetricNumber).unitTo(Tex)}")
        println("tenTex.unitTo(DTex).unitTo(Tex) = ${tenTex.unitTo(DTex).unitTo(Tex)}")
    }

    @Test
    fun testEquals() {
        println("========Test equals()====================")
        assertEquals(Fineness(1.0, MetricNumber), Fineness(9000.0, Denier))
        assertEquals(Fineness(1.0, MetricNumber), Fineness(1000.0, Tex))
        assertEquals(Fineness(1.0, MetricNumber), Fineness(10000.0, DTex))

        assertEquals(Fineness(1.0, Denier), Fineness(9000.0, MetricNumber))
        assertEquals(Fineness(1.0, Denier), Fineness(1.0/9.0, Tex))
        assertEquals(Fineness(1.0, Denier), Fineness(10.0/9.0, DTex))

        assertEquals(Fineness(1.0, Tex), Fineness(1000.0, MetricNumber))
        assertEquals(Fineness(1.0, Tex), Fineness(9.0, Denier))
        assertEquals(Fineness(1.0, Tex), Fineness(10.0, DTex))

        assertEquals(Fineness(1.0, DTex), Fineness(10000.0, MetricNumber))
        assertEquals(Fineness(1.0, DTex), Fineness(0.9, Denier))
        assertEquals(Fineness(1.0, DTex), Fineness(0.1, Tex))
    }
}