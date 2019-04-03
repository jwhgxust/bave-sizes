package cn.edu.gxust.jiweihuang.kotlin.scalar

import cn.edu.gxust.jiweihuang.kotlin.exception.UnitConversionException
import cn.edu.gxust.jiweihuang.kotlin.unit.Unit
import cn.edu.gxust.jiweihuang.kotlin.unit.*

//Scalar.kt
//Code complete status:100%
//Test complete status:100%
//doc complete status:100%

/**
 * The value with unit.
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-25
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
abstract class Scalar<T : Unit>(open val value: Double, open val unit: T) {

    /**
     * The unit conversion.
     */
    abstract fun unitTo(unit: T): Scalar<T>

    override fun toString(): String = "$value $unit"

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Scalar<*>) return false
        if (unit != other.unit) {
            val scalarChanged: Scalar<*>
            try {
                @Suppress("UNCHECKED_CAST")
                scalarChanged = unitTo(other.unit as T)
            } catch (e: RuntimeException) {
                return false
            }
            return scalarChanged.value == other.value
        } else {
            return value == other.value
        }
    }

    override fun hashCode(): Int {
        var result = value.hashCode()
        result = 31 * result + unit.hashCode()
        return result
    }

}

/**
 * The scalar:[Mass]
 *
 * The unit conversion is only supported for unit of metric system.
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-25
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
class Mass(override val value: Double, override val unit: MassUnit) : Scalar<MassUnit>(value, unit) {

    override fun unitTo(unit: MassUnit): Mass {
        when (this.unit) {
            KiloGram -> return when (unit) {
                KiloGram -> Mass(value, unit)
                Gram -> Mass(value * 1.0e3, unit)
                DeciGram -> Mass(value * 1.0e4, unit)
                CentiGram -> Mass(value * 1.0e5, unit)
                MilliGram -> Mass(value * 1.0e6, unit)
                MicroGram -> Mass(value * 1.0e9, unit)
                MetricTon -> Mass(value * 1.0e-3, unit)
                Quintal -> Mass(value * 1.0e-2, unit)
                Karat -> Mass(value * 0.5e4, unit)
                Point -> Mass(value * 0.5e6, unit)
                else -> {
                    throw UnitConversionException("Casting is not supported for unit: ${unit.name}.")
                }
            }
            Gram -> return when (unit) {
                KiloGram -> Mass(value * 1.0e-3, unit)
                Gram -> Mass(value, unit)
                DeciGram -> Mass(value * 1.0e1, unit)
                CentiGram -> Mass(value * 1.0e2, unit)
                MilliGram -> Mass(value * 1.0e3, unit)
                MicroGram -> Mass(value * 1.0e6, unit)
                MetricTon -> Mass(value * 1.0e-6, unit)
                Quintal -> Mass(value * 1.0e-5, unit)
                Karat -> Mass(value * 0.5e1, unit)
                Point -> Mass(value * 0.5e3, unit)
                else -> {
                    throw UnitConversionException("Casting is not supported for unit: ${unit.name}.")
                }
            }
            DeciGram -> return when (unit) {
                KiloGram -> Mass(value * 1.0e-4, unit)
                Gram -> Mass(value * 1.0e-1, unit)
                DeciGram -> Mass(value, unit)
                CentiGram -> Mass(value * 1.0e1, unit)
                MilliGram -> Mass(value * 1.0e2, unit)
                MicroGram -> Mass(value * 1.0e5, unit)
                MetricTon -> Mass(value * 1.0e-7, unit)
                Quintal -> Mass(value * 1.0e-6, unit)
                Karat -> Mass(value * 0.5, unit)
                Point -> Mass(value * 0.5e2, unit)
                else -> {
                    throw UnitConversionException("Casting is not supported for unit: ${unit.name}.")
                }
            }
            CentiGram -> return when (unit) {
                KiloGram -> Mass(value * 1.0e-5, unit)
                Gram -> Mass(value * 1.0e-2, unit)
                DeciGram -> Mass(value * 1.0e-1, unit)
                CentiGram -> Mass(value, unit)
                MilliGram -> Mass(value * 1.0e1, unit)
                MicroGram -> Mass(value * 1.0e4, unit)
                MetricTon -> Mass(value * 1.0e-8, unit)
                Quintal -> Mass(value * 1.0e-7, unit)
                Karat -> Mass(value * 0.5e-1, unit)
                Point -> Mass(value * 0.5e1, unit)
                else -> {
                    throw UnitConversionException("Casting is not supported for unit: ${unit.name}.")
                }
            }
            MilliGram -> return when (unit) {
                KiloGram -> Mass(value * 1.0e-6, unit)
                Gram -> Mass(value * 1.0e-3, unit)
                DeciGram -> Mass(value * 1.0e-2, unit)
                CentiGram -> Mass(value * 1.0e-1, unit)
                MilliGram -> Mass(value, unit)
                MicroGram -> Mass(value * 1.0e3, unit)
                MetricTon -> Mass(value * 1.0e-9, unit)
                Quintal -> Mass(value * 1.0e-8, unit)
                Karat -> Mass(value * 0.5e-2, unit)
                Point -> Mass(value * 0.5, unit)
                else -> {
                    throw UnitConversionException("Casting is not supported for unit: ${unit.name}.")
                }
            }
            MicroGram -> return when (unit) {
                KiloGram -> Mass(value * 1.0e-9, unit)
                Gram -> Mass(value * 1.0e-6, unit)
                DeciGram -> Mass(value * 1.0e-5, unit)
                CentiGram -> Mass(value * 1.0e-4, unit)
                MilliGram -> Mass(value * 1.0e-3, unit)
                MicroGram -> Mass(value, unit)
                MetricTon -> Mass(value * 1.0e-12, unit)
                Quintal -> Mass(value * 1.0e-11, unit)
                Karat -> Mass(value * 0.5e-5, unit)
                Point -> Mass(value * 0.5e-3, unit)
                else -> {
                    throw UnitConversionException("Casting is not supported for unit: ${unit.name}.")
                }
            }
            MetricTon -> return when (unit) {
                KiloGram -> Mass(value * 1.0e3, unit)
                Gram -> Mass(value * 1.0e6, unit)
                DeciGram -> Mass(value * 1.0e7, unit)
                CentiGram -> Mass(value * 1.0e8, unit)
                MilliGram -> Mass(value * 1.0e9, unit)
                MicroGram -> Mass(value * 1.0e12, unit)
                MetricTon -> Mass(value, unit)
                Quintal -> Mass(value * 1.0e1, unit)
                Karat -> Mass(value * 0.5e7, unit)
                Point -> Mass(value * 0.5e9, unit)
                else -> {
                    throw UnitConversionException("Casting is not supported for unit: ${unit.name}.")
                }
            }
            Quintal -> return when (unit) {
                KiloGram -> Mass(value * 1.0e2, unit)
                Gram -> Mass(value * 1.0e5, unit)
                DeciGram -> Mass(value * 1.0e6, unit)
                CentiGram -> Mass(value * 1.0e7, unit)
                MilliGram -> Mass(value * 1.0e8, unit)
                MicroGram -> Mass(value * 1.0e11, unit)
                MetricTon -> Mass(value * 1.0e-1, unit)
                Quintal -> Mass(value, unit)
                Karat -> Mass(value * 0.5e6, unit)
                Point -> Mass(value * 0.5e8, unit)
                else -> {
                    throw UnitConversionException("Casting is not supported for unit: ${unit.name}.")
                }
            }
            Karat -> return when (unit) {
                KiloGram -> Mass(value * 0.2e-3, unit)
                Gram -> Mass(value * 0.2, unit)
                DeciGram -> Mass(value * 2.0e0, unit)
                CentiGram -> Mass(value * 2.0e1, unit)
                MilliGram -> Mass(value * 2.0e2, unit)
                MicroGram -> Mass(value * 2.0e5, unit)
                MetricTon -> Mass(value * 2e-7, unit)
                Quintal -> Mass(value * 2e-6, unit)
                Karat -> Mass(value, unit)
                Point -> Mass(value * 100, unit)
                else -> {
                    throw UnitConversionException("Casting is not supported for unit: ${unit.name}.")
                }
            }
            Point -> return when (unit) {
                KiloGram -> Mass(value * 2e-6, unit)
                Gram -> Mass(value * 2e-3, unit)
                DeciGram -> Mass(value * 2e-2, unit)
                CentiGram -> Mass(value * 2e-1, unit)
                MilliGram -> Mass(value * 2e0, unit)
                MicroGram -> Mass(value * 2e3, unit)
                MetricTon -> Mass(value * 2e-9, unit)
                Quintal -> Mass(value * 2e-8, unit)
                Karat -> Mass(value * 0.01, unit)
                Point -> Mass(value, unit)
                else -> {
                    throw UnitConversionException("Casting is not supported for unit: ${unit.name}.")
                }
            }
            else -> {
                throw UnitConversionException("Casting is not supported for unit: ${this.unit.name}.")
            }
        }
    }
}
typealias Weight = Mass

/**
 * The scalar:[Length]
 *
 * The unit conversion is only supported unit of metric system.
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-25
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
class Length(override val value: Double, override val unit: LengthUnit) : Scalar<LengthUnit>(value, unit) {
    override fun unitTo(unit: LengthUnit): Length {
        when (this.unit) {
            KiloMeter -> return when (unit) {
                KiloMeter -> Length(value, unit)
                Meter -> Length(value * 1.0e3, unit)
                DeciMeter -> Length(value * 1.0e4, unit)
                CentiMeter -> Length(value * 1.0e5, unit)
                MilliMeter -> Length(value * 1.0e6, unit)
                MicroMeter -> Length(value * 1.0e9, unit)
                NanoMeter -> Length(value * 1.0e12, unit)
                PicoMeter -> Length(value * 1.0e15, unit)
                else -> {
                    throw UnitConversionException("Casting is not supported for unit: ${unit.name}.")
                }
            }
            Meter -> return when (unit) {
                KiloMeter -> Length(value * 1.0e-3, unit)
                Meter -> Length(value, unit)
                DeciMeter -> Length(value * 1.0e1, unit)
                CentiMeter -> Length(value * 1.0e2, unit)
                MilliMeter -> Length(value * 1.0e3, unit)
                MicroMeter -> Length(value * 1.0e6, unit)
                NanoMeter -> Length(value * 1.0e9, unit)
                PicoMeter -> Length(value * 1.0e12, unit)
                else -> {
                    throw UnitConversionException("Casting is not supported for unit: ${unit.name}.")
                }
            }
            DeciMeter -> return when (unit) {
                KiloMeter -> Length(value * 1.0e-4, unit)
                Meter -> Length(value * 1.0e-1, unit)
                DeciMeter -> Length(value, unit)
                CentiMeter -> Length(value * 1.0e1, unit)
                MilliMeter -> Length(value * 1.0e2, unit)
                MicroMeter -> Length(value * 1.0e5, unit)
                NanoMeter -> Length(value * 1.0e8, unit)
                PicoMeter -> Length(value * 1.0e11, unit)
                else -> {
                    throw UnitConversionException("Casting is not supported for unit: ${unit.name}.")
                }
            }
            CentiMeter -> return when (unit) {
                KiloMeter -> Length(value * 1.0e-5, unit)
                Meter -> Length(value * 1.0e-2, unit)
                DeciMeter -> Length(value * 1.0e-1, unit)
                CentiMeter -> Length(value, unit)
                MilliMeter -> Length(value * 1.0e1, unit)
                MicroMeter -> Length(value * 1.0e4, unit)
                NanoMeter -> Length(value * 1.0e7, unit)
                PicoMeter -> Length(value * 1.0e10, unit)
                else -> {
                    throw UnitConversionException("Casting is not supported for unit: ${unit.name}.")
                }
            }
            MilliMeter -> return when (unit) {
                KiloMeter -> Length(value * 1.0e-6, unit)
                Meter -> Length(value * 1.0e-3, unit)
                DeciMeter -> Length(value * 1.0e-2, unit)
                CentiMeter -> Length(value * 1.0e-1, unit)
                MilliMeter -> Length(value, unit)
                MicroMeter -> Length(value * 1.0e3, unit)
                NanoMeter -> Length(value * 1.0e6, unit)
                PicoMeter -> Length(value * 1.0e9, unit)
                else -> {
                    throw UnitConversionException("Casting is not supported for unit: ${unit.name}.")
                }
            }
            MicroMeter -> return when (unit) {
                KiloMeter -> Length(value * 1.0e-9, unit)
                Meter -> Length(value * 1.0e-6, unit)
                DeciMeter -> Length(value * 1.0e-5, unit)
                CentiMeter -> Length(value * 1.0e-4, unit)
                MilliMeter -> Length(value * 1.0e-3, unit)
                MicroMeter -> Length(value, unit)
                NanoMeter -> Length(value * 1.0e3, unit)
                PicoMeter -> Length(value * 1.0e6, unit)
                else -> {
                    throw UnitConversionException("Casting is not supported for unit: ${unit.name}.")
                }
            }
            NanoMeter -> return when (unit) {
                KiloMeter -> Length(value * 1.0e-12, unit)
                Meter -> Length(value * 1.0e-9, unit)
                DeciMeter -> Length(value * 1.0e-8, unit)
                CentiMeter -> Length(value * 1.0e-7, unit)
                MilliMeter -> Length(value * 1.0e-6, unit)
                MicroMeter -> Length(value * 1.0e-3, unit)
                NanoMeter -> Length(value, unit)
                PicoMeter -> Length(value * 1.0e3, unit)
                else -> {
                    throw UnitConversionException("Casting is not supported for unit: ${unit.name}.")
                }
            }
            PicoMeter -> return when (unit) {
                KiloMeter -> Length(value * 1.0e-15, unit)
                Meter -> Length(value * 1.0e-12, unit)
                DeciMeter -> Length(value * 1.0e-11, unit)
                CentiMeter -> Length(value * 1.0e-10, unit)
                MilliMeter -> Length(value * 1.0e-9, unit)
                MicroMeter -> Length(value * 1.0e-6, unit)
                NanoMeter -> Length(value * 1.0e-3, unit)
                PicoMeter -> Length(value, unit)
                else -> {
                    throw UnitConversionException("Casting is not supported for unit: ${unit.name}.")
                }
            }
            else -> {
                throw UnitConversionException("Casting is not supported for unit: ${this.unit.name}.")
            }
        }
    }
}
