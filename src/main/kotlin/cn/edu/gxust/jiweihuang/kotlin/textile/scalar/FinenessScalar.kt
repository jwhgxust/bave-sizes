package cn.edu.gxust.jiweihuang.kotlin.textile.scalar

import cn.edu.gxust.jiweihuang.kotlin.exception.UnitConversionException
import cn.edu.gxust.jiweihuang.kotlin.scalar.Scalar
import cn.edu.gxust.jiweihuang.kotlin.textile.unit.*


//FinenessScalar.kt
//Code complete status:100%
//Test complete status:100%
//Doc complete status:100%

/**
 * The scalar of fineness.
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-25
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
class Fineness(override val value: Double, override val unit: FinenessUnit) : Scalar<FinenessUnit>(value, unit) {
    override fun unitTo(unit: FinenessUnit): Fineness {
        when (this.unit) {
            MetricNumber -> return when (unit) {
                MetricNumber -> Fineness(value, unit)
                Denier -> Fineness((MetricNumber.weight.value / value) * (Denier.length.value / MetricNumber.length.value), unit)
                Tex -> Fineness((MetricNumber.weight.value / value) * (Tex.length.value / MetricNumber.length.value), unit)
                DTex -> Fineness((MetricNumber.weight.value / value) * (DTex.length.value / MetricNumber.length.value), unit)
                else -> {
                    throw UnitConversionException("Casting is not supported for unit: ${unit.name}.")
                }
            }
            Denier -> return when (unit) {
                MetricNumber -> Fineness(MetricNumber.weight.value / (value / Denier.length.value), unit)
                Denier -> Fineness(value, unit)
                Tex -> Fineness(value * (Tex.length.value / Denier.length.value), unit)
                DTex -> Fineness(value * (DTex.length.value / Denier.length.value), unit)
                else -> {
                    throw UnitConversionException("Casting is not supported for unit: ${unit.name}.")
                }
            }
            Tex -> return when (unit) {
                MetricNumber -> Fineness(Tex.length.value / value, unit)
                Denier -> Fineness(value * (Denier.length.value / Tex.length.value), unit)
                Tex -> Fineness(value, unit)
                DTex -> Fineness(value * (DTex.length.value / Tex.length.value), unit)
                else -> {
                    throw UnitConversionException("Casting is not supported for unit: ${unit.name}.")
                }
            }
            DTex -> return when (unit) {
                MetricNumber -> Fineness(DTex.length.value / value, unit)
                Denier -> Fineness(value * (Denier.length.value / DTex.length.value), unit)
                Tex -> Fineness(value * (Tex.length.value / DTex.length.value), unit)
                DTex -> Fineness(value, unit)
                else -> {
                    throw UnitConversionException("Casting is not supported for unit: ${unit.name}.")
                }
            }
            else -> {
                throw UnitConversionException("Casting is not supported for unit: ${unit.name}.")
            }
        }
    }
}
/**
 * The scalar of size.
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-25
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
class Size(override val value: Double, override val unit: LinearDensityUnit) : Scalar<LinearDensityUnit>(value, unit) {
    override fun unitTo(unit: LinearDensityUnit): Size {
        when (this.unit) {
            Denier -> return when (unit) {
                Denier -> Size(value, unit)
                Tex -> Size(value * (Tex.length.value / Denier.length.value), unit)
                DTex -> Size(value * (DTex.length.value / Denier.length.value), unit)
                else -> {
                    throw UnitConversionException("Casting is not supported for unit: ${unit.name}.")
                }
            }
            Tex -> return when (unit) {
                Denier -> Size(value * (Denier.length.value / Tex.length.value), unit)
                Tex -> Size(value, unit)
                DTex -> Size(value * (DTex.length.value / Tex.length.value), unit)
                else -> {
                    throw UnitConversionException("Casting is not supported for unit: ${unit.name}.")
                }
            }
            DTex -> return when (unit) {
                Denier -> Size(value * (Denier.length.value / DTex.length.value), unit)
                Tex -> Size(value * (Tex.length.value / DTex.length.value), unit)
                DTex -> Size(value, unit)
                else -> {
                    throw UnitConversionException("Casting is not supported for unit: ${unit.name}.")
                }
            }
            else -> {
                throw UnitConversionException("Casting is not supported for unit: ${unit.name}.")
            }
        }
    }
}