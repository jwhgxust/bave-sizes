package cn.edu.gxust.jiweihuang.kotlin.unit

//Unit.kt
//Create date: 2019-02-24
//Code complete status: 100%
//Test Code complete status:100%
//Doc complete status:100%

/**
 * The unit of measure.
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-25
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
abstract class Unit {

    /**
     * The name of unit,it must be
     * overrided by subclass or sub-object.
     */
    open val name: String
        get() = "Unit"

    /**
     * The symbol of unit,it must be
     * overrided by subclass or sub-object,
     * the default value is not meaningful.
     */
    open val symbol: String
        get() = ""

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Unit) return false
        if (name != other.name) return false
        if (symbol != other.symbol) return false
        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + symbol.hashCode()
        return result
    }

    override fun toString(): String {
        return "$name($symbol)"
    }

}

//====================================

/**
 * The mass unit.
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-25
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
abstract class MassUnit : Unit() {
    override val name: String
        get() = "MassUnit"
}
/**
 * The weight unit.
 *
 * [WeightUnit] is a type alias of [MassUnit].
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-25
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
typealias WeightUnit = MassUnit

//-------------------------------------
/**
 * The mass unit of metric system.
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-25
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
abstract class MetricMassUnit : MassUnit() {
    override val name: String
        get() = "MetricMassUnit"
}
/**
 * The weight unit of metric system.
 *
 * [MetricWeightUnit] is a type alias of [MetricMassUnit]
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-25
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
typealias MetricWeightUnit = MetricMassUnit

//....................................
/**
 * The mass unit:[MetricTon]
 *
 * 1 t = 1e3 kg
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-25
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
object MetricTon : MetricMassUnit() {
    override val name: String
        get() = "MetricTon"
    override val symbol: String
        get() = "t"
}

/**
 * The mass unit:[Quintal]
 *
 * 1 q = 1e2 kg
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-25
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
object Quintal : MetricMassUnit() {
    override val name: String
        get() = "Quintal"
    override val symbol: String
        get() = "q"
}

/**
 * The mass unit:[KiloGram]
 *
 * 1 kg = 1e3 g
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-25
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
object KiloGram : MetricMassUnit() {
    override val name: String
        get() = "KiloGram"
    override val symbol: String
        get() = "kg"
}

/**
 * The mass unit:[Gram]
 *
 * 1 g = 1e-3 kg
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-25
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
object Gram : MetricMassUnit() {
    override val name: String
        get() = "Gram"
    override val symbol: String
        get() = "g"
}

/**
 * The mass unit:[DeciGram]
 *
 * 1 dg = 1e-1 g
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-25
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
object DeciGram : MetricMassUnit() {
    override val name: String
        get() = "DeciGram"
    override val symbol: String
        get() = "dg"
}

/**
 * The mass unit:[CentiGram]
 *
 * 1 cg = 1e-2 g
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-25
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
object CentiGram : MetricMassUnit() {
    override val name: String
        get() = "CentiGram"
    override val symbol: String
        get() = "cg"
}

/**
 * The mass unit:[MilliGram]
 *
 * 1 mg = 1e-3 g
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-25
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
object MilliGram : MetricMassUnit() {
    override val name: String
        get() = "MilliGram"
    override val symbol: String
        get() = "mg"
}

/**
 * The mass unit:[MicroGram]
 *
 * 1 μg = 1e-6 g
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-25
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
object MicroGram : MetricMassUnit() {
    override val name: String
        get() = "MicroGram"
    override val symbol: String
        get() = "μg"
}

/**
 * The mass unit:[Karat]
 *
 * 1 ct = 0.2 g
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-25
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
object Karat : MetricMassUnit() {
    override val name: String
        get() = "Karat"
    override val symbol: String
        get() = "ct"
}

/**
 * The mass unit:[Point]
 *
 * 1 point = 0.002 g
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-25
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
object Point : MetricMassUnit() {
    override val name: String
        get() = "Point"
    override val symbol: String
        get() = "point"
}

//-------------------------------------
/**
 * The mass unit of british system.
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-25
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
abstract class BritishMassUnit : MassUnit() {
    override val name: String
        get() = "BritishMassUnit"
}
/**
 * The weight unit of british system.
 *
 * [BritishWeightUnit] is type alias of [BritishMassUnit]
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-25
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
typealias BritishWeightUnit = BritishMassUnit

//-------------------------------------
/**
 * The mass unit of american system.
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-25
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
abstract class AmericanMassUnit : MassUnit() {
    override val name: String
        get() = "AmericanMassUnit"
}
/**
 * The weight unit of american system.
 *
 * [AmericanWeightUnit] is a type alias of [AmericanMassUnit].
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-25
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
typealias AmericanWeightUnit = AmericanMassUnit

//-------------------------------------
/**
 * The mass unit of chinese system.
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-25
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
abstract class ChineseMassUnit : MassUnit() {
    override val name: String
        get() = "ChineseMassUnit"
}
/**
 * The weight unit of chinese system.
 *
 * [ChineseWeighUnit] is a type alias of [ChineseMassUnit].
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-25
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
typealias ChineseWeighUnit = ChineseMassUnit

//====================================
/**
 * The length unit.
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-24
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
abstract class LengthUnit : Unit() {
    override val name: String
        get() = "LengthUnit"
}

//-------------------------------------
/**
 * The length unit of metric system.
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-24
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
abstract class MetricLengthUnit : LengthUnit() {
    override val name: String
        get() = "MetricLengthUnit"
}

//....................................
/**
 * The length unit:[KiloMeter]
 *
 * 1 km = 1e3 m
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-24
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
object KiloMeter : MetricLengthUnit() {
    override val name: String
        get() = "KiloMeter"
    override val symbol: String
        get() = "km"
}

/**
 * The length unit:[Meter]
 *
 * 1 m = 1e-3 km
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-24
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
object Meter : MetricLengthUnit() {
    override val name: String
        get() = "Meter"
    override val symbol: String
        get() = "m"
}

/**
 * The length unit:[DeciMeter]
 *
 * 1 dm = 1e-1 m
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-24
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
object DeciMeter : MetricLengthUnit() {
    override val name: String
        get() = "DeciMeter"
    override val symbol: String
        get() = "dm"
}

/**
 * The length unit:[CentiMeter]
 *
 * 1 cm = 1e-2 m
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-24
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
object CentiMeter : MetricLengthUnit() {
    override val name: String
        get() = "CentiMeter"
    override val symbol: String
        get() = "cm"
}

/**
 * The length unit:[MilliMeter]
 *
 * 1 mm = 1e-3 m
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-24
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
object MilliMeter : MetricLengthUnit() {
    override val name: String
        get() = "MilliMeter"
    override val symbol: String
        get() = "mm"
}

/**
 * The length unit:[MicroMeter]
 *
 * 1 μm = 1e-6 m
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-24
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
object MicroMeter : MetricLengthUnit() {
    override val name: String
        get() = "MicroMeter"
    override val symbol: String
        get() = "μm"
}

/**
 * The length unit:[NanoMeter]
 *
 * 1 nm = 1e-9 m
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-24
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
object NanoMeter : MetricLengthUnit() {
    override val name: String
        get() = "NanoMeter"
    override val symbol: String
        get() = "nm"
}

/**
 * The length unit:[PicoMeter]
 *
 * 1 pm = 1e-12 m
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-24
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
object PicoMeter : MetricLengthUnit() {
    override val name: String
        get() = "PicoMeter"
    override val symbol: String
        get() = "pm"
}

//-------------------------------------
/**
 * The length unit of british system.
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-24
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
abstract class BritishLengthUnit : LengthUnit() {
    override val name: String
        get() = "BritishLengthUnit"
}

//-------------------------------------
/**
 * The length unit of american system.
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-24
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
abstract class AmericanLengthUnit : LengthUnit() {
    override val name: String
        get() = "AmericanLengthUnit"
}

//-------------------------------------
/**
 * The length unit of Chinese system.
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-02-24
 *
 * @author Jiwei Huang
 * @since 1.0.0
 */
abstract class ChineseLengthUnit : LengthUnit() {
    override val name: String
        get() = "ChineseLengthUnit"
}