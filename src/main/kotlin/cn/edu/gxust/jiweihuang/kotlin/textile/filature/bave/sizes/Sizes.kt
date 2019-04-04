package cn.edu.gxust.jiweihuang.kotlin.textile.filature.bave.sizes

import cn.edu.gxust.jiweihuang.kotlin.textile.unit.DTex
import cn.edu.gxust.jiweihuang.kotlin.textile.unit.LengthBasedFinenessUnit
import cn.edu.gxust.jiweihuang.kotlin.util.collections.fromString as fromStringToList
import cn.edu.gxust.jiweihuang.kotlin.util.series.DoubleSeries

class Sizes(data: List<Double>, val testLengthMeter: Double = 100 * 1.125,
            val unit: LengthBasedFinenessUnit = DTex) : DoubleSeries(data) {
    companion object {
        fun fromString(dataString: String, separator: String = "\\s+", isIgnoreError: Boolean = true,
                       testLengthMeter: Double = 100 * 1.125,
                       unit: LengthBasedFinenessUnit = DTex): Sizes {
            return Sizes(fromStringToList(dataString, separator, isIgnoreError), testLengthMeter, unit)
        }
    }
}