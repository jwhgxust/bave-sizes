package cn.edu.gxust.jiweihuang.kotlin.util.series

import cn.edu.gxust.jiweihuang.kotlin.util.collections.fromString
import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.util.*

open class DoubleSeriesGroup : Iterable<DoubleSeries> {
    //=================================================
    private val dataMap = TreeMap<Long, DoubleSeries>()

    //=================================================
    companion object {
        private var counter: Long = 0

        fun fromFile(file: String, separator: String = "\\s+"): DoubleSeriesGroup {
            val dsg = DoubleSeriesGroup()
            val fileName = File(file)
            var fileReader: FileReader? = null
            var bufferedReader: BufferedReader? = null
            try {
                fileReader = FileReader(fileName)
                bufferedReader = BufferedReader(fileReader)
                try {
                    var read: String? = null
                    while ({ read = bufferedReader.readLine();read }() != null) {
                        dsg.add(fromString(read!!, separator))
                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                }

            } catch (e: Exception) {
                e.printStackTrace()
            } finally {
                bufferedReader?.close()
                fileReader?.close()
            }
            return dsg
        }
    }

    //=================================================
    init {
        counter = 0
    }

    //=================================================
    fun add(ds: DoubleSeries) {
        counter++
        dataMap[counter] = ds
    }

    fun add(list: List<Double>) {
        add(DoubleSeries(list))
    }

    //=================================================
    val lengthList: List<Int>
        get() {
            val makeList = mutableListOf<Int>()
            for (d in this) {
                makeList.add(d.length)
            }
            return makeList
        }
    val headList: List<Double>
        get() {
            val makeList = mutableListOf<Double>()
            for (d in this) {
                makeList.add(d[0])
            }
            return makeList
        }
    val endList: List<Double>
        get() {
            val makeList = mutableListOf<Double>()
            for (d in this) {
                makeList.add(d[d.length - 1])
            }
            return makeList
        }
    val maxList: List<Double>
        get() {
            val makeList = mutableListOf<Double>()
            for (d in this) {
                makeList.add(d.max)
            }
            return makeList
        }
    val maxIndexList: List<Int>
        get() {
            val makeList = mutableListOf<Int>()
            for (d in this) {
                makeList.add(d.maxIndex)
            }
            return makeList
        }
    val minList: List<Double>
        get() {
            val makeList = mutableListOf<Double>()
            for (d in this) {
                makeList.add(d.min)
            }
            return makeList
        }
    val minIndexList: List<Int>
        get() {
            val makeList = mutableListOf<Int>()
            for (d in this) {
                makeList.add(d.minIndex)
            }
            return makeList
        }

    //=================================================
    override fun iterator(): Iterator<DoubleSeries> {
        return dataMap.values.iterator()
    }

    fun toMap(): Map<Long, DoubleSeries> {
        return dataMap.toMap()
    }

    //=================================================
    override fun toString(): String {
        val stringBuilder = StringBuilder()
        dataMap.forEach { t, u -> stringBuilder.append("$t=$u\n") }
        return stringBuilder.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DoubleSeriesGroup) return false
        if (dataMap != other.toMap()) return false
        return true
    }

    override fun hashCode(): Int {
        return dataMap.hashCode()
    }
    //=================================================
}