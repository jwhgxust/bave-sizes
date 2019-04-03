package cn.edu.gxust.jiweihuang.kotlin.textile.filature.bave.sizes.regression.stepwise

import cn.edu.gxust.jiweihuang.kotlin.util.series.DoubleSeries

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
    for (i in 0..length) {
        makeList.add(get(i) - ds[i])
    }
    return DoubleSeries(makeList)
}

fun DoubleSeries.acvf(r: Int, m: Int): Double {
    var sum = 0.0
    val remain = this - this.line
    for (i in 0 until length - m) {
        sum += remain[i] * remain[i + r]
    }
    return sum
}