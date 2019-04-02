package cn.edu.gxust.jiweihuang.kotlin.util.series


open class DoubleSeries(dataList: List<Double>, val lengthAtLeast: Int = 2) : Iterable<Double> {
    //==========================================================================================
    companion object {
        private const val lengthAtLeastImp: Int = 2
    }

    //==========================================================================================
    private val data: List<Double>
    //==========================================================================================

    init {
        if (lengthAtLeast < lengthAtLeastImp) {
            throw IllegalArgumentException("Expected the parameter {lengthAtLeast >= $lengthAtLeastImp}, but get {lengthAtLeast = $lengthAtLeast}.")
        }
        data = dataList.filter { it.isFinite() }
        if (length < lengthAtLeast) {
            throw IllegalArgumentException("Expected the length of parameter {dataList} which has been filter with {Double.isFinite()} is more than or equals to {$lengthAtLeast}, but get {length = $length}")
        }
    }
    //==========================================================================================

    val length: Int
        get() = data.size

    //==========================================================================================
    override fun iterator(): Iterator<Double> {
        return data.iterator()
    }

    //==========================================================================================
    operator fun get(index: Int): Double {
        return data[index]
    }

    //==========================================================================================
    fun toList(): List<Double> {
        return data.toList()
    }

    fun toDoubleArray(): DoubleArray {
        return data.toDoubleArray()
    }

    fun toMap(): Map<Int, Double> {
        return (0 until length).zip(data).toMap()
    }

    fun copy(): DoubleSeries {
        return DoubleSeries(data, lengthAtLeast)
    }

    //==========================================================================================
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DoubleSeries) return false
        if (lengthAtLeast != other.lengthAtLeast) return false
        if (data != other.toList()) return false
        return true
    }

    override fun hashCode(): Int {
        var result = lengthAtLeast
        result = 31 * result + data.hashCode()
        return result
    }

    override fun toString(): String {
        return "DoubleSeries(data=$data,lengthAtLeast=$lengthAtLeast,length=$length)"
    }

    //==========================================================================================

}