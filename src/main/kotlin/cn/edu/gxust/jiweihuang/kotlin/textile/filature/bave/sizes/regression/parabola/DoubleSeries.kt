package cn.edu.gxust.jiweihuang.kotlin.textile.filature.bave.sizes.regression.parabola

import cn.edu.gxust.jiweihuang.kotlin.util.series.DoubleSeries

val DoubleSeries.beta: Double
    get() = (6.0 * average - 4.0 * get(0) - 2.0 * get(length - 1)) / length

val DoubleSeries.alpha: Double
    get() = (12.0 * average - 6.0 * get(0) - 6.0 * get(length - 1)) / (length * (length - 1))

