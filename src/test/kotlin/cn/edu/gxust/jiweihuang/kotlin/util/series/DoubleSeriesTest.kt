package cn.edu.gxust.jiweihuang.kotlin.util.series

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.util.*

internal class DoubleSeriesTest {

    @BeforeEach
    fun setUp() {
        println("================================")
    }

    @AfterEach
    fun tearDown() {
        println("================================")
        println()
    }

    @Test
    fun testConstructor() {
        val data = mutableListOf<Double>(2.0, 3.0, Double.NaN, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY)
        println("data = $data")
        val ds = DoubleSeries(data)
        println("ds = $ds")

        data[0] = 1.0
        println("data = $data")
        println("ds = $ds")
        val data1 = mutableListOf<Double>(Double.NaN, 1.0, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY)

        try {
            DoubleSeries(data1)
        } catch (e: IllegalArgumentException) {
            println(e.message)
        }

        try {
            DoubleSeries(data, 1)
        } catch (e: IllegalArgumentException) {
            println(e.message)
        }
    }

    @Test
    fun getLength() {
        val ds = DoubleSeries(listOf(1.0, 2.0, 3.0, 4.0, 5.0))
        assertEquals(5, ds.length)
    }

    @Test
    operator fun iterator() {

    }

    @Test
    fun get() {
        val ds = DoubleSeries(listOf(1.0, 2.0, 3.0, 4.0, 5.0))
        assertEquals(ds[0], 1.0)
    }

    @Test
    fun toList() {
        val ds = DoubleSeries(listOf(1.0, 2.0, 3.0, 4.0, 5.0))
        println("ds = $ds")
        println("data = ${ds.toList()}")
    }

    @Test
    fun toDoubleArray() {
        val ds = DoubleSeries(listOf(1.0, 2.0, 3.0, 4.0, 5.0))
        println("ds = $ds")
        println("data = ${Arrays.toString(ds.toDoubleArray())}")
    }

    @Test
    fun toMap() {
        val ds = DoubleSeries(listOf(1.0, 2.0, 3.0, 4.0, 5.0))
        println("ds = $ds")
        println("data = ${ds.toMap()}")
    }

    @Test
    fun copy() {
        val ds = DoubleSeries(listOf(1.0, 2.0, 3.0, 4.0, 5.0))
        println("ds = $ds")
        println("data = ${ds.copy()}")
    }

    @Test
    fun getLengthAtLeast() {
        val ds = DoubleSeries(listOf(1.0, 2.0, 3.0, 4.0, 5.0))
        println("ds = $ds")
        println("data = ${ds.lengthAtLeast}")
    }
}