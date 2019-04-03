package cn.edu.gxust.jiweihuang.kotlin.scalar

import cn.edu.gxust.jiweihuang.kotlin.unit.*
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class LengthTest {
    @BeforeEach
    fun setUp() {
        println()
    }

    @AfterEach
    fun tearDown() {
        println()
    }

    @Test
    fun testToString() {
        println("===============Test toString()=======================")
        val oneKiloMeter = Length(1.0, KiloMeter)
        val oneMeter = Length(1.0, Meter)
        val oneDeciMeter = Length(1.0, DeciMeter)
        val oneCentiMeter = Length(1.0, CentiMeter)
        val oneMilliMeter = Length(1.0, MilliMeter)
        val oneMicroMeter = Length(1.0, MicroMeter)
        val oneNanoMeter = Length(1.0, NanoMeter)
        val onePicoMeter = Length(1.0, PicoMeter)

        println("Length(1.0, KiloMeter) = $oneKiloMeter")
        println("Length(1.0, Meter) = $oneMeter")
        println("Length(1.0, DeciMeter) = $oneDeciMeter")
        println("Length(1.0, CentiMeter) = $oneCentiMeter")
        println("Length(1.0, MilliMeter) = $oneMilliMeter")
        println("Length(1.0, MicroMeter) = $oneMicroMeter")
        println("Length(1.0, NanoMeter) = $oneNanoMeter")
        println("Length(1.0, PicoMeter) = $onePicoMeter")
    }

    @Test
    fun unitTo() {
        println("===============Test unitTo()=======================")
        val oneKiloMeter = Length(1.0, KiloMeter)
        val oneMeter = Length(1.0, Meter)
        val oneDeciMeter = Length(1.0, DeciMeter)
        val oneCentiMeter = Length(1.0, CentiMeter)
        val oneMilliMeter = Length(1.0, MilliMeter)
        val oneMicroMeter = Length(1.0, MicroMeter)
        val oneNanoMeter = Length(1.0, NanoMeter)
        val onePicoMeter = Length(1.0, PicoMeter)

        println("oneKiloMeter.unitTo(Meter) = ${oneKiloMeter.unitTo(Meter)}")
        println("oneKiloMeter.unitTo(DeciMeter) = ${oneKiloMeter.unitTo(DeciMeter)}")
        println("oneKiloMeter.unitTo(CentiMeter) = ${oneKiloMeter.unitTo(CentiMeter)}")
        println("oneKiloMeter.unitTo(MilliMeter) = ${oneKiloMeter.unitTo(MilliMeter)}")
        println("oneKiloMeter.unitTo(MicroMeter) = ${oneKiloMeter.unitTo(MicroMeter)}")
        println("oneKiloMeter.unitTo(NanoMeter) =${oneKiloMeter.unitTo(NanoMeter)}")
        println("oneKiloMeter.unitTo(PicoMeter) = ${oneKiloMeter.unitTo(PicoMeter)}")

        println("oneMeter.unitTo(KiloMeter) = ${oneMeter.unitTo(KiloMeter)}")
        println("oneMeter.unitTo(DeciMeter) = ${oneMeter.unitTo(DeciMeter)}")
        println("oneMeter.unitTo(CentiMeter) = ${oneMeter.unitTo(CentiMeter)}")
        println("oneMeter.unitTo(MilliMeter) = ${oneMeter.unitTo(MilliMeter)}")
        println("oneMeter.unitTo(MicroMeter) = ${oneMeter.unitTo(MicroMeter)}")
        println("oneMeter.unitTo(NanoMeter) =${oneMeter.unitTo(NanoMeter)}")
        println("oneMeter.unitTo(PicoMeter) = ${oneMeter.unitTo(PicoMeter)}")

        println("oneDeciMeter.unitTo(Meter) = ${oneDeciMeter.unitTo(Meter)}")
        println("oneDeciMeter.unitTo(KiloMeter) = ${oneDeciMeter.unitTo(KiloMeter)}")
        println("oneDeciMeter.unitTo(CentiMeter) = ${oneDeciMeter.unitTo(CentiMeter)}")
        println("oneDeciMeter.unitTo(MilliMeter) = ${oneDeciMeter.unitTo(MilliMeter)}")
        println("oneDeciMeter.unitTo(MicroMeter) = ${oneDeciMeter.unitTo(MicroMeter)}")
        println("oneDeciMeter.unitTo(NanoMeter) =${oneDeciMeter.unitTo(NanoMeter)}")
        println("oneDeciMeter.unitTo(PicoMeter) = ${oneDeciMeter.unitTo(PicoMeter)}")

        assertEquals(oneMeter, oneMeter.unitTo(KiloMeter).unitTo(Meter))
        assertEquals(oneMeter, oneMeter.unitTo(DeciMeter).unitTo(Meter))
        assertEquals(oneMeter, oneMeter.unitTo(CentiMeter).unitTo(Meter))
        assertEquals(oneMeter, oneMeter.unitTo(MilliMeter).unitTo(Meter))
        assertEquals(oneMeter, oneMeter.unitTo(MicroMeter).unitTo(Meter))
        assertEquals(oneMeter, oneMeter.unitTo(NanoMeter).unitTo(Meter))
        assertEquals(oneMeter, oneMeter.unitTo(PicoMeter).unitTo(Meter))

        assertEquals(oneDeciMeter, oneDeciMeter.unitTo(Meter).unitTo(DeciMeter))
        assertEquals(oneDeciMeter, oneDeciMeter.unitTo(KiloMeter).unitTo(DeciMeter))
        assertEquals(oneDeciMeter, oneDeciMeter.unitTo(CentiMeter).unitTo(DeciMeter))
        assertEquals(oneDeciMeter, oneDeciMeter.unitTo(MilliMeter).unitTo(DeciMeter))
        assertEquals(oneDeciMeter, oneDeciMeter.unitTo(MicroMeter).unitTo(DeciMeter))
        assertEquals(oneDeciMeter, oneDeciMeter.unitTo(NanoMeter).unitTo(DeciMeter))
        //assertEquals(oneDeciMeter, oneDeciMeter.unitTo(PicoMeter).unitTo(DeciMeter))

        assertEquals(oneCentiMeter, oneCentiMeter.unitTo(Meter).unitTo(CentiMeter))
        assertEquals(oneCentiMeter, oneCentiMeter.unitTo(DeciMeter).unitTo(CentiMeter))
        assertEquals(oneCentiMeter, oneCentiMeter.unitTo(KiloMeter).unitTo(CentiMeter))
        assertEquals(oneCentiMeter, oneCentiMeter.unitTo(MilliMeter).unitTo(CentiMeter))
        assertEquals(oneCentiMeter, oneCentiMeter.unitTo(MicroMeter).unitTo(CentiMeter))
        assertEquals(oneCentiMeter, oneCentiMeter.unitTo(NanoMeter).unitTo(CentiMeter))
        assertEquals(oneCentiMeter, oneCentiMeter.unitTo(PicoMeter).unitTo(CentiMeter))

        assertEquals(oneMilliMeter, oneMilliMeter.unitTo(Meter).unitTo(MilliMeter))
        assertEquals(oneMilliMeter, oneMilliMeter.unitTo(DeciMeter).unitTo(MilliMeter))
        assertEquals(oneMilliMeter, oneMilliMeter.unitTo(CentiMeter).unitTo(MilliMeter))
        assertEquals(oneMilliMeter, oneMilliMeter.unitTo(KiloMeter).unitTo(MilliMeter))
        assertEquals(oneMilliMeter, oneMilliMeter.unitTo(MicroMeter).unitTo(MilliMeter))
        assertEquals(oneMilliMeter, oneMilliMeter.unitTo(NanoMeter).unitTo(MilliMeter))
        assertEquals(oneMilliMeter, oneMilliMeter.unitTo(PicoMeter).unitTo(MilliMeter))

        assertEquals(oneMicroMeter, oneMicroMeter.unitTo(Meter).unitTo(MicroMeter))
        assertEquals(oneMicroMeter, oneMicroMeter.unitTo(DeciMeter).unitTo(MicroMeter))
        assertEquals(oneMicroMeter, oneMicroMeter.unitTo(CentiMeter).unitTo(MicroMeter))
        assertEquals(oneMicroMeter, oneMicroMeter.unitTo(MilliMeter).unitTo(MicroMeter))
        assertEquals(oneMicroMeter, oneMicroMeter.unitTo(KiloMeter).unitTo(MicroMeter))
        assertEquals(oneMicroMeter, oneMicroMeter.unitTo(NanoMeter).unitTo(MicroMeter))
        assertEquals(oneMicroMeter, oneMicroMeter.unitTo(PicoMeter).unitTo(MicroMeter))

        assertEquals(oneNanoMeter, oneNanoMeter.unitTo(Meter).unitTo(NanoMeter))
        assertEquals(oneNanoMeter, oneNanoMeter.unitTo(DeciMeter).unitTo(NanoMeter))
        assertEquals(oneNanoMeter, oneNanoMeter.unitTo(CentiMeter).unitTo(NanoMeter))
        assertEquals(oneNanoMeter, oneNanoMeter.unitTo(MilliMeter).unitTo(NanoMeter))
        assertEquals(oneNanoMeter, oneNanoMeter.unitTo(MicroMeter).unitTo(NanoMeter))
        assertEquals(oneNanoMeter, oneNanoMeter.unitTo(KiloMeter).unitTo(NanoMeter))
        assertEquals(oneNanoMeter, oneNanoMeter.unitTo(PicoMeter).unitTo(NanoMeter))

        assertEquals(onePicoMeter, onePicoMeter.unitTo(Meter).unitTo(PicoMeter))
        //assertEquals(onePicoMeter, onePicoMeter.unitTo(DeciMeter).unitTo(PicoMeter))
        assertEquals(onePicoMeter, onePicoMeter.unitTo(CentiMeter).unitTo(PicoMeter))
        assertEquals(onePicoMeter, onePicoMeter.unitTo(MilliMeter).unitTo(PicoMeter))
        assertEquals(onePicoMeter, onePicoMeter.unitTo(MicroMeter).unitTo(PicoMeter))
        assertEquals(onePicoMeter, onePicoMeter.unitTo(NanoMeter).unitTo(PicoMeter))
        assertEquals(onePicoMeter, onePicoMeter.unitTo(KiloMeter).unitTo(PicoMeter))
    }

    @Test
    fun testEquals() {
        println("===============Test equals()=======================")
        assertEquals(Length(1.0, Meter), Length(1.0e-3, KiloMeter))
        assertEquals(Length(1.0, Meter), Length(1.0e1, DeciMeter))
        assertEquals(Length(1.0, Meter), Length(1.0e2, CentiMeter))
        assertEquals(Length(1.0, Meter), Length(1.0e3, MilliMeter))
        assertEquals(Length(1.0, Meter), Length(1.0e6, MicroMeter))
        assertEquals(Length(1.0, Meter), Length(1.0e9, NanoMeter))
        assertEquals(Length(1.0, Meter), Length(1.0e12, PicoMeter))

        assertEquals(Length(1.0, KiloMeter), Length(1.0e3, Meter))
        assertEquals(Length(1.0, KiloMeter), Length(1.0e4, DeciMeter))
        assertEquals(Length(1.0, KiloMeter), Length(1.0e5, CentiMeter))
        assertEquals(Length(1.0, KiloMeter), Length(1.0e6, MilliMeter))
        assertEquals(Length(1.0, KiloMeter), Length(1.0e9, MicroMeter))
        assertEquals(Length(1.0, KiloMeter), Length(1.0e12, NanoMeter))
        assertEquals(Length(1.0, KiloMeter), Length(1.0e15, PicoMeter))

        assertEquals(Length(1.0, DeciMeter), Length(1.0e-1, Meter))
        assertEquals(Length(1.0, DeciMeter), Length(1.0e-4, KiloMeter))
        assertEquals(Length(1.0, DeciMeter), Length(1.0e1, CentiMeter))
        assertEquals(Length(1.0, DeciMeter), Length(1.0e2, MilliMeter))
        assertEquals(Length(1.0, DeciMeter), Length(1.0e5, MicroMeter))
        assertEquals(Length(1.0, DeciMeter), Length(1.0e8, NanoMeter))
        assertEquals(Length(1.0, DeciMeter), Length(1.0e11, PicoMeter))

        assertEquals(Length(1.0, CentiMeter), Length(1.0e-2, Meter))
        assertEquals(Length(1.0, CentiMeter), Length(1.0e-5, KiloMeter))
        assertEquals(Length(1.0, CentiMeter), Length(1.0e-1, DeciMeter))
        assertEquals(Length(1.0, CentiMeter), Length(1.0e1, MilliMeter))
        assertEquals(Length(1.0, CentiMeter), Length(1.0e4, MicroMeter))
        assertEquals(Length(1.0, CentiMeter), Length(1.0e7, NanoMeter))
        assertEquals(Length(1.0, CentiMeter), Length(1.0e10, PicoMeter))

        assertEquals(Length(1.0, MilliMeter), Length(1.0e-3, Meter))
        assertEquals(Length(1.0, MilliMeter), Length(1.0e-6, KiloMeter))
        assertEquals(Length(1.0, MilliMeter), Length(1.0e-2, DeciMeter))
        assertEquals(Length(1.0, MilliMeter), Length(1.0e-1, CentiMeter))
        assertEquals(Length(1.0, MilliMeter), Length(1.0e3, MicroMeter))
        assertEquals(Length(1.0, MilliMeter), Length(1.0e6, NanoMeter))
        assertEquals(Length(1.0, MilliMeter), Length(1.0e9, PicoMeter))

        assertEquals(Length(1.0, MicroMeter), Length(1.0e-6, Meter))
        assertEquals(Length(1.0, MicroMeter), Length(1.0e-9, KiloMeter))
        assertEquals(Length(1.0, MicroMeter), Length(1.0e-5, DeciMeter))
        assertEquals(Length(1.0, MicroMeter), Length(1.0e-4, CentiMeter))
        assertEquals(Length(1.0, MicroMeter), Length(1.0e-3, MilliMeter))
        assertEquals(Length(1.0, MicroMeter), Length(1.0e3, NanoMeter))
        assertEquals(Length(1.0, MicroMeter), Length(1.0e6, PicoMeter))

        assertEquals(Length(1.0, NanoMeter), Length(1.0e-9, Meter))
        assertEquals(Length(1.0, NanoMeter), Length(1.0e-12, KiloMeter))
        assertEquals(Length(1.0, NanoMeter), Length(1.0e-8, DeciMeter))
        assertEquals(Length(1.0, NanoMeter), Length(1.0e-7, CentiMeter))
        assertEquals(Length(1.0, NanoMeter), Length(1.0e-6, MilliMeter))
        assertEquals(Length(1.0, NanoMeter), Length(1.0e-3, MicroMeter))
        assertEquals(Length(1.0, NanoMeter), Length(1.0e3, PicoMeter))

        assertEquals(Length(1.0, PicoMeter), Length(1.0e-12, Meter))
        assertEquals(Length(1.0, PicoMeter), Length(1.0e-15, KiloMeter))
        assertEquals(Length(1.0, PicoMeter), Length(1.0e-11, DeciMeter))
        assertEquals(Length(1.0, PicoMeter), Length(1.0e-10, CentiMeter))
        assertEquals(Length(1.0, PicoMeter), Length(1.0e-9, MilliMeter))
        assertEquals(Length(1.0, PicoMeter), Length(1.0e-6, MicroMeter))
        assertEquals(Length(1.0, PicoMeter), Length(1.0e-3, NanoMeter))
    }
}