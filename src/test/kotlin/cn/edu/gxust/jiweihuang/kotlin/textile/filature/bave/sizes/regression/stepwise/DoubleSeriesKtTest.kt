package cn.edu.gxust.jiweihuang.kotlin.textile.filature.bave.sizes.regression.stepwise

import cn.edu.gxust.jiweihuang.kotlin.util.series.DoubleSeries
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class DoubleSeriesKtTest {
    val ds = DoubleSeries(3.3, 3.4, 3.6, 3.5, 3.3, 3.2, 3.0, 2.9, 2.7, 2.5, 2.4, 2.3, 2.1, 1.8)
    @BeforeEach
    fun setUp() {
        println("====================================")
        println("ds:DoubleSeries = $ds")
    }

    @AfterEach
    fun tearDown() {
        println("====================================")
        println()
    }

    @Test
    fun getSlope() {
        println("ds.slope = ${ds.slope}")
    }

    @Test
    fun getLine() {
        println("ds.line = ${ds.line}")
        assertEquals(ds.average, ds.line.average, 1e-15)
    }

    @Test
    fun minus() {
    }

    @Test
    fun acvf() {
        println("ds.acvf(1,2) = ${ds.acvf(1, 2)}")
    }

    @Test
    fun acvm() {
        println("ds.acvm(5) = ${ds.acvm(5)}")
    }

    @Test
    fun acvv() {
        println("ds.acvv(5) = ${ds.acvv(5)}")
    }

    @Test
    fun coefs() {
        println("ds.coefs(5) = ${ds.coefs(5)}")
    }

    @Test
    fun plus() {
    }

    @Test
    fun regression() {
        println(ds - ds.line)
        println(ds.regression(5, (ds - ds.line)[0], ds.length))
    }

    @Test
    fun restore() {
        println(ds.restore(5, (ds - ds.line)[0], ds.length))
        println((ds - ds.restore(1, (ds - ds.line)[0], ds.length)).sum)
        println((ds - ds.restore(2, (ds - ds.line)[0], ds.length)).sum)
        println((ds - ds.restore(3, (ds - ds.line)[0], ds.length)).sum)
        println((ds - ds.restore(4, (ds - ds.line)[0], ds.length)).sum)
        println((ds - ds.restore(5, (ds - ds.line)[0], ds.length)).sum)
        println((ds - ds.restore(6, (ds - ds.line)[0], ds.length)).sum)
        println((ds - ds.restore(7, (ds - ds.line)[0], ds.length)).sum)
        println((ds - ds.restore(8, (ds - ds.line)[0], ds.length)).sum)
        println((ds - ds.restore(9, (ds - ds.line)[0], ds.length)).sum)
        println((ds - ds.restore(10, (ds - ds.line)[0], ds.length)).sum)
        println((ds - ds.restore(11, (ds - ds.line)[0], ds.length)).sum)
        println((ds - ds.restore(12, (ds - ds.line)[0], ds.length)).sum)
        println((ds - ds.restore(13, (ds - ds.line)[0], ds.length)).sum)
        println(ds.length)
    }
}