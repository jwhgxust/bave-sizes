package cn.edu.gxust.jiweihuang.kotlin.util.series

import java.lang.Math.pow
import java.lang.Math.sqrt

/**
 * The [DoubleSeries] is used for representing double numeric sequence with statistics and calculation.
 *
 * a [List] with [Double] as closed data container,it is immutable.
 *
 * It require that there are at least 2 elements in internal implementation,
 * the customer can specify the minimum length,but that must be equal or greater
 * than 2 (internal implementation required).
 *
 * it require that not contain {Double.NaN}.
 *
 * it require that not contain {Double.POSITIVE_INFINITY}.
 *
 * it require that not contain {Double.NEGATIVE_INFINITY}.
 *
 *
 * Create date: 2019-04-01.
 *
 * last revision date: 2019-04-03.
 * @property lengthAtLeast The minimum number of elements in series requested by customer.
 * @author Jiwei Huang.
 * @since 1.0.0
 * @see List
 */
open class DoubleSeries(dataList: List<Double>, val lengthAtLeast: Int = 2) : Iterable<Double> {
    //==========================================================================================
    companion object {
        /**
         * The minimum number of elements in series requested by internal implementation.
         */
        private const val lengthAtLeastImp: Int = 2
    }

    //==========================================================================================
    /**
     * The data storage in internal implementation.
     */
    private val data: List<Double>
    //==========================================================================================

    init {
        //make sure that minimum length specified by customer is equal or greater than by internal implementation.
        if (lengthAtLeast < lengthAtLeastImp) {
            throw IllegalArgumentException("Expected the parameter {lengthAtLeast >= $lengthAtLeastImp}, but get {lengthAtLeast = $lengthAtLeast}.")
        }
        //make sure that not contain {Double.NaN}.
        //make sure that not contain {Double.POSITIVE_INFINITY}.
        //make sure that not contain {Double.NEGATIVE_INFINITY}.
        data = dataList.filter { it.isFinite() }
        //make sure that length of data is equal or greater than minimum length specified by customer.
        if (length < lengthAtLeast) {
            throw IllegalArgumentException("Expected the length of parameter {dataList} which has been filter with {Double.isFinite()} is more than or equals to {$lengthAtLeast}, but get {length = $length}")
        }
    }

    constructor(vararg data: Double) : this(data.toList(), 2)
    //==========================================================================================

    /**
     * The length of series.
     */
    val length: Int
        get() = data.size

    //==========================================================================================
    /**
     * The iterator for Iterable<Double>
     */
    override fun iterator(): Iterator<Double> {
        return data.iterator()
    }

    //==========================================================================================
    /**
     * indexer
     */
    operator fun get(index: Int): Double {
        return data[index]
    }

    //==========================================================================================
    /**
     * to [List]
     */
    fun toList(): List<Double> {
        return data.toList()
    }

    /**
     * to [DoubleArray]
     */
    fun toDoubleArray(): DoubleArray {
        return data.toDoubleArray()
    }

    /**
     * to [Map]
     */
    fun toMap(): Map<Int, Double> {
        return (0 until length).zip(data).toMap()
    }

    /**
     * to copy
     */
    fun copy(): DoubleSeries {
        return DoubleSeries(data, lengthAtLeast)
    }

    //==========================================================================================
    /**
     * {@inheritDoc}
     */
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DoubleSeries) return false
        if (lengthAtLeast != other.lengthAtLeast) return false
        if (data != other.toList()) return false
        return true
    }

    /**
     * {@inheritDoc}
     */
    override fun hashCode(): Int {
        var result = lengthAtLeast
        result = 31 * result + data.hashCode()
        return result
    }

    /**
     * {@inheritDoc}
     */
    override fun toString(): String {
        return "DoubleSeries(data=$data,lengthAtLeast=$lengthAtLeast,length=$length)"
    }

    //==========================================================================================
    /**
     * The sum of double series.
     */
    val sum: Double
        get() = data.sum()

    /**
     * The average of double series.
     */
    val average: Double
        get() = sum / length

    /**
     * The sum of squares of double series.
     */
    val sumsq: Double
        get() {
            var makeSum = 0.0
            data.forEach {
                makeSum += pow(it, 2.0)
            }
            return makeSum
        }

    /**
     * The sguare sum of deviation from mean of double series.
     */
    val devsq: Double
        get() {
            var makeSum = 0.0
            data.forEach {
                makeSum += pow(it - average, 2.0)
            }
            return makeSum
        }

    /**
     * The variance of double series.
     */
    val vari: Double
        get() = devsq / length

    /**
     * The variance of double series as sample.
     */
    val varis: Double
        get() = devsq / (length - 1)

    /**
     * The variance of double series as population.
     */
    val varip: Double
        get() = devsq / length

    /**
     * The variance of double series with another algorithm.
     */
    val vari2: Double
        get() = sumsq / length - pow(average, 2.0)

    /**
     * The standard deviation of double series.
     */
    val std: Double
        get() = sqrt(vari)

    /**
     * The standard deviation of double series that be as sample.
     */
    val stds: Double
        get() = sqrt(varis)

    /**
     * The standard deviation of double series that be as population.
     */
    val stdp: Double
        get() = sqrt(varip)

    /**
     * The maximum value in double series.
     */
    val max: Double
        get() {
            var makeMax = data[0]
            for (d in data) {
                if (d > makeMax) {
                    makeMax = d
                }
            }
            return makeMax
        }

    /**
     * The minimum value in double series.
     */
    val min: Double
        get() {
            var makeMin = data[0]
            for (d in data) {
                if (d < makeMin) {
                    makeMin = d
                }
            }
            return makeMin
        }

    /**
     * The index of maximum value in double series.
     */
    val maxIndex: Int
        get() {
            for (index in data.indices) {
                if (data[index] == max) return index
            }
            throw IllegalArgumentException("There is no matching index of maximum value.")
        }

    /**
     * The index of minimum value in double series.
     */
    val minIndex: Int
        get() {
            for (index in data.indices) {
                if (data[index] == min) return index
            }
            throw IllegalArgumentException("There is no matching index of minimum value.")
        }

}