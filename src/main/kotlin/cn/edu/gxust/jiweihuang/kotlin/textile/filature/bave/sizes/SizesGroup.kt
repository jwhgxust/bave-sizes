package cn.edu.gxust.jiweihuang.kotlin.textile.filature.bave.sizes

import cn.edu.gxust.jiweihuang.kotlin.textile.unit.DTex
import cn.edu.gxust.jiweihuang.kotlin.textile.unit.LengthBasedFinenessUnit
import cn.edu.gxust.jiweihuang.kotlin.util.collections.fromString as fromStringToList
import cn.edu.gxust.jiweihuang.kotlin.util.series.DoubleSeriesGroup

class SizesGroup(val name: String, val testLengthMeter: Double = 100 * 1.125,
                 val unit: LengthBasedFinenessUnit = DTex) : DoubleSeriesGroup() {
    fun add(sizes: Sizes) {
        if (sizes.testLengthMeter == testLengthMeter && sizes.unit == unit) {
            add(sizes)
        } else {
            throw IllegalArgumentException("Expected the parameter {sizes.testLengthMeter == $testLengthMeter && sizes.unit == $unit}, but get {sizes.testLengthMeter == ${sizes.testLengthMeter} && sizes.unit == ${sizes.unit}}.")
        }
    }

    val lengthMeterList: List<Double>
        get() = lengthList.map { it * testLengthMeter }

    fun add(str: String, separator: String = "\\s+", isIgnoreError: Boolean = true,
            testLengthMeter: Double = 100 * 1.125,
            unit: LengthBasedFinenessUnit = DTex) {
        add(Sizes.fromString(str, separator, isIgnoreError,testLengthMeter, unit))
    }

    companion object {
        fun fromFile(file: String, separator: String = "\\s+", name: String, testLengthMeter: Double = 100 * 1.125,
                     unit: LengthBasedFinenessUnit = DTex): SizesGroup {
            val sg = SizesGroup(name, testLengthMeter, unit)
            for (dsg in DoubleSeriesGroup.fromFile(file, separator)) {
                sg.add(dsg)
            }
            return sg
        }
    }
}