package cn.edu.gxust.jiweihuang.kotlin.textile.filature.bave.sizes.regression.stepwise

import cn.edu.gxust.jiweihuang.kotlin.util.series.DoubleSeries
import org.hipparchus.linear.*

val DoubleSeries.slope: Double
    get() {
        var sum = 0.0
        for (i in 0 until length) sum += i * get(i)
        return (12.0 * sum - 6.0 * (length - 1.0) * average * length) / ((length -
                1.0) * length * (length + 1.0))
    }

val DoubleSeries.line: DoubleSeries
    get() {
        val makeArray = mutableListOf<Double>()
        for (i in 0 until length) {
            makeArray.add(average + slope * (i - (length - 1) / 2.0))
        }
        return DoubleSeries(makeArray)
    }

operator fun DoubleSeries.minus(ds: DoubleSeries): DoubleSeries {
    val makeList = mutableListOf<Double>()
    for (i in 0 until length) {
        makeList.add(get(i) - ds[i])
    }
    return DoubleSeries(makeList)
}

/**
 * autocovariance function
 */
fun DoubleSeries.acvf(r: Int, m: Int): Double {
    var sum = 0.0
    val remain = this - this.line
    for (i in 0 until length - m) {
        sum += remain[i] * remain[i + r]
    }
    return sum
}

/**
 * autocovariance matrix
 *
 * require that {1 <= k < length}
 */
fun DoubleSeries.acvm(k: Int): RealMatrix {
    if (k >= length || k < 1) {

    }
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
 *
 * require that {1 <= k < length}
 */
fun DoubleSeries.acvv(k: Int): RealVector {
    val vector: RealVector = ArrayRealVector(k)
    for (i in 1..k) {
        vector.setEntry(i - 1, acvf(i, i))
    }
    return vector
}

/**
 * The coefficients of stepwise autoregression
 *
 * require that {1 <= k < length}
 */
fun DoubleSeries.coefs(k: Int): RealVector {
    return LUDecomposition(acvm(k)).solver.solve(acvv(k))
}

operator fun DoubleSeries.plus(ds: DoubleSeries): DoubleSeries {
    val makeList = mutableListOf<Double>()
    for (i in 0 until length) {
        makeList.add(get(i) + ds[i])
    }
    return DoubleSeries(makeList)
}

/**
 *
 * require that {1 <= k < length}
 */
fun DoubleSeries.regression(k: Int, z0: Double, length: Int): DoubleSeries {
    val makeList = mutableListOf<Double>()
    makeList.add(z0)
    val coef = this.coefs(k)
    for (i in 1 until length) {
        if (i <= k) {
            var makeSum = 0.0
            for (r in 1..i) {
                makeSum += coef.getEntry(r - 1) * makeList[i - r]
            }
            makeList.add(makeSum)
        } else {
            var makeSum = 0.0
            for (r in 1..k) {
                makeSum += coef.getEntry(r - 1) * makeList[i - r]
            }
            makeList.add(makeSum)
        }
    }
    return DoubleSeries(makeList)
}

/**
 * require that {1 <= k < length}
 */
fun DoubleSeries.restore(k: Int, z0: Double, length: Int): DoubleSeries {
    return line + regression(k, z0, length)
}