package cn.edu.gxust.jiweihuang.kotlin.textile.filature.bave.sizes.regression.stepwise

import cn.edu.gxust.jiweihuang.kotlin.util.series.DoubleSeriesGroup
import org.hipparchus.linear.*

fun DoubleSeriesGroup.acvf(r: Int, m: Int): Double {
    var sum = 0.0
    for (ds in this) {
        sum += ds.acvf(r, m)
    }
    return sum
}

/**
 * autocovariance matrix
 */
fun DoubleSeriesGroup.acvm(k: Int): RealMatrix {
    val matrix: RealMatrix = Array2DRowRealMatrix(k, k)
    for (i in 0 until k) {
        for (j in i until k) {
            matrix.setEntry(i, j, acvf(j - i, j + 1))
        }
        for (h in 0 until i) {
            matrix.setEntry(i, h, acvf(i - h, i + 1))
        }
    }
    return matrix
}

/**
 * autocovariance vector
 */
fun DoubleSeriesGroup.acvv(k: Int): RealVector {
    val vector: RealVector = ArrayRealVector(k)
    for (i in 1..k) {
        vector.setEntry(i - 1, acvf(i, i))
    }
    return vector
}

/**
 * The coefficients of stepwise autoregression
 */
fun DoubleSeriesGroup.coefs(k: Int): RealVector {
    return LUDecomposition(acvm(k)).solver.solve(acvv(k))
}