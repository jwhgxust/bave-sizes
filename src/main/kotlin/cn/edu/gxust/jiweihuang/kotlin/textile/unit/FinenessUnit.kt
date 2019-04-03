package cn.edu.gxust.jiweihuang.kotlin.textile.unit

import cn.edu.gxust.jiweihuang.kotlin.scalar.Length
import cn.edu.gxust.jiweihuang.kotlin.scalar.Weight
import cn.edu.gxust.jiweihuang.kotlin.unit.Gram
import cn.edu.gxust.jiweihuang.kotlin.unit.Meter
import cn.edu.gxust.jiweihuang.kotlin.unit.Unit

//FinenessUnit.kt
//Code complete status:100%
//Test complete status:100%
//Doc complete status:100%

/**
 * The fineness unit.
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-25
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
abstract class FinenessUnit(val weight: Weight, val length: Length) : Unit() {
    override val name: String = "FinenessUnit"
}

/**
 * The fineness unit based on fixed weight system.
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-25
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
abstract class WeightBasedFinenessUnit(length: Length, weight: Weight) : FinenessUnit(weight, length) {
    override val name: String = "WeightBasedFinenessUnit"
}

/**
 * The fineness unit based on fixed weight of metric system.
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-25
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
abstract class MetricWeightBasedFinenessUnit(length: Length, weight: Weight) : WeightBasedFinenessUnit(length, weight) {
    override val name: String = "MetricWeightBasedFinenessUnit"
}

/**
 * The fineness unit:[MetricNumber].
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-25
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
object MetricNumber : MetricWeightBasedFinenessUnit(Length(1.0, Meter), Weight(1.0, Gram)) {
    override val name: String = "MetricNumber"
    override val symbol: String = "Nm"
}

/**
 * The fineness unit based on fixed length system.
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-25
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
abstract class LengthBasedFinenessUnit(weight: Weight, length: Length) : FinenessUnit(weight, length) {
    override val name: String = "LengthBasedFinenessUnit"
}

/**
 * The fineness unit based on fixed length system.
 *
 * [LinearDensityUnit] is a type alias of [LengthBasedFinenessUnit]
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-25
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
typealias LinearDensityUnit = LengthBasedFinenessUnit

/**
 * The fineness unit:[Denier].
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-25
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
object Denier : LinearDensityUnit(Weight(1.0, Gram), Length(9000.0, Meter)) {
    override val name: String = "Denier"
    override val symbol: String = "den"
}

/**
 * The fineness unit based on fixed length of metric system.
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-25
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
abstract class MetricLinearDensityUnit(weight: Weight, length: Length) : LinearDensityUnit(weight, length) {
    override val name: String = "LinearDensityUnit"
}

/**
 * The fineness unit:[Tex].
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-25
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
object Tex : MetricLinearDensityUnit(Weight(1.0, Gram), Length(1000.0, Meter)) {
    override val name: String = "Tex"
    override val symbol: String = "tex"
}

/**
 * The fineness unit:[DTex].
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-25
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
object DTex : MetricLinearDensityUnit(Weight(1.0, Gram), Length(10000.0, Meter)) {
    override val name: String = "DTex"
    override val symbol: String = "dtex"
}