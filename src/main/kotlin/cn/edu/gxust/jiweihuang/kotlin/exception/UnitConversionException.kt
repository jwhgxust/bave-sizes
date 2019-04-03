package cn.edu.gxust.jiweihuang.kotlin.exception

//UnitConversionException.kt
//Create date: 2019-02-24
//Complete status: 100%

import cn.edu.gxust.jiweihuang.kotlin.scalar.Scalar

/**
 * The exception for [Unit] conversion of [Scalar]
 *
 * Create date:2019-02-24
 *
 * Last revision date:2019-03-08
 *
 * @author Jiwei Huang
 * @since 1.0.0
 * @see RuntimeException
 */
class UnitConversionException : RuntimeException {
    /**
     * {@inheritDoc}
     */
    constructor() : super()

    /**
     * {@inheritDoc}
     */
    constructor(message: String) : super(message)

    /**
     * {@inheritDoc}
     */
    constructor(message: String, cause: Throwable) : super(message, cause)

    /**
     * {@inheritDoc}
     */
    constructor(cause: Throwable) : super(cause)

    /**
     * {@inheritDoc}
     */
    constructor(message: String, cause: Throwable,
                enableSuppression: Boolean,
                writableStackTrace: Boolean) : super(message, cause,
            enableSuppression, writableStackTrace)
}