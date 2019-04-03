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
}