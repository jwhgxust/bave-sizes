package cn.edu.gxust.jiweihuang.kotlin.scalar

import cn.edu.gxust.jiweihuang.kotlin.unit.*

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class MassTest {

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
        println("=============Test toString()=================")
        val oneKiloGram = Mass(1.0, KiloGram)
        val oneGram = Mass(1.0, Gram)
        val oneDeciGram = Mass(1.0, DeciGram)
        val oneCentiGram = Mass(1.0, CentiGram)
        val oneMilliGram = Mass(1.0, MilliGram)
        val oneMicroGram = Mass(1.0, MicroGram)
        val oneTon = Mass(1.0, MetricTon)
        val oneQuintal = Mass(1.0, Quintal)
        val oneKarat = Mass(1.0, Karat)
        val onePoint = Mass(1.0, Point)

        println("Mass(1.0, KiloGram) = $oneKiloGram")
        println("Mass(1.0, Gram) = $oneGram")
        println("Mass(1.0, DeciGram) = $oneDeciGram")
        println("Mass(1.0, CentiGram) = $oneCentiGram")
        println("Mass(1.0, MilliGram) = $oneMilliGram")
        println("Mass(1.0, MicroGram) = $oneMicroGram")
        println("Mass(1.0, MetricTon) = $oneTon")
        println("Mass(1.0, Quintal) = $oneQuintal")
        println("Mass(1.0, Karat) = $oneKarat")
        println("Mass(1.0, Point) = $onePoint")
    }

    @Test
    fun unitsTo() {
        println("=============Test unitTo()=================")
        val oneKiloGram = Mass(1.0, KiloGram)
        val oneGram = Mass(1.0, Gram)
        val oneDeciGram = Mass(1.0, DeciGram)
        val oneCentiGram = Mass(1.0, CentiGram)
        val oneMilliGram = Mass(1.0, MilliGram)
        val oneMicroGram = Mass(1.0, MicroGram)
        val oneTon = Mass(1.0, MetricTon)
        val oneQuintal = Mass(1.0, Quintal)
        val oneKarat = Mass(1.0, Karat)
        val onePoint = Mass(1.0, Point)

        assertEquals(oneKiloGram, oneKiloGram.unitTo(Gram).unitTo(KiloGram))
        assertEquals(oneKiloGram, oneKiloGram.unitTo(DeciGram).unitTo(KiloGram))
        assertEquals(oneKiloGram, oneKiloGram.unitTo(CentiGram).unitTo(KiloGram))
        assertEquals(oneKiloGram, oneKiloGram.unitTo(MilliGram).unitTo(KiloGram))
        assertEquals(oneKiloGram, oneKiloGram.unitTo(MicroGram).unitTo(KiloGram))
        assertEquals(oneKiloGram, oneKiloGram.unitTo(MetricTon).unitTo(KiloGram))
        assertEquals(oneKiloGram, oneKiloGram.unitTo(Quintal).unitTo(KiloGram))
        assertEquals(oneKiloGram, oneKiloGram.unitTo(Karat).unitTo(KiloGram))
        assertEquals(oneKiloGram, oneKiloGram.unitTo(Point).unitTo(KiloGram))

        assertEquals(oneGram, oneGram.unitTo(KiloGram).unitTo(Gram))
        assertEquals(oneGram, oneGram.unitTo(DeciGram).unitTo(Gram))
        assertEquals(oneGram, oneGram.unitTo(CentiGram).unitTo(Gram))
        assertEquals(oneGram, oneGram.unitTo(MilliGram).unitTo(Gram))
        assertEquals(oneGram, oneGram.unitTo(MicroGram).unitTo(Gram))
        assertEquals(oneGram, oneGram.unitTo(MetricTon).unitTo(Gram))
        assertEquals(oneGram, oneGram.unitTo(Quintal).unitTo(Gram))
        assertEquals(oneGram, oneGram.unitTo(Karat).unitTo(Gram))
        assertEquals(oneGram, oneGram.unitTo(Point).unitTo(Gram))

        assertEquals(oneDeciGram, oneDeciGram.unitTo(Gram).unitTo(DeciGram))
        assertEquals(oneDeciGram, oneDeciGram.unitTo(KiloGram).unitTo(DeciGram))
        assertEquals(oneDeciGram, oneDeciGram.unitTo(CentiGram).unitTo(DeciGram))
        assertEquals(oneDeciGram, oneDeciGram.unitTo(MilliGram).unitTo(DeciGram))
        assertEquals(oneDeciGram, oneDeciGram.unitTo(MicroGram).unitTo(DeciGram))
        assertEquals(oneDeciGram, oneDeciGram.unitTo(MetricTon).unitTo(DeciGram))
        assertEquals(oneDeciGram, oneDeciGram.unitTo(Quintal).unitTo(DeciGram))
        assertEquals(oneDeciGram, oneDeciGram.unitTo(Karat).unitTo(DeciGram))
        assertEquals(oneDeciGram, oneDeciGram.unitTo(Point).unitTo(DeciGram))

        assertEquals(oneCentiGram, oneCentiGram.unitTo(Gram).unitTo(CentiGram))
        assertEquals(oneCentiGram, oneCentiGram.unitTo(DeciGram).unitTo(CentiGram))
        assertEquals(oneCentiGram, oneCentiGram.unitTo(KiloGram).unitTo(CentiGram))
        assertEquals(oneCentiGram, oneCentiGram.unitTo(MilliGram).unitTo(CentiGram))
        assertEquals(oneCentiGram, oneCentiGram.unitTo(MicroGram).unitTo(CentiGram))
        assertEquals(oneCentiGram, oneCentiGram.unitTo(MetricTon).unitTo(CentiGram))
        assertEquals(oneCentiGram, oneCentiGram.unitTo(Quintal).unitTo(CentiGram))
        assertEquals(oneCentiGram, oneCentiGram.unitTo(Karat).unitTo(CentiGram))
        assertEquals(oneCentiGram, oneCentiGram.unitTo(Point).unitTo(CentiGram))


        assertEquals(oneMilliGram, oneMilliGram.unitTo(Gram).unitTo(MilliGram))
        assertEquals(oneMilliGram, oneMilliGram.unitTo(DeciGram).unitTo(MilliGram))
        assertEquals(oneMilliGram, oneMilliGram.unitTo(CentiGram).unitTo(MilliGram))
        assertEquals(oneMilliGram, oneMilliGram.unitTo(KiloGram).unitTo(MilliGram))
        assertEquals(oneMilliGram, oneMilliGram.unitTo(MicroGram).unitTo(MilliGram))
        assertEquals(oneMilliGram, oneMilliGram.unitTo(MetricTon).unitTo(MilliGram))
        assertEquals(oneMilliGram, oneMilliGram.unitTo(Quintal).unitTo(MilliGram))
        assertEquals(oneMilliGram, oneMilliGram.unitTo(Karat).unitTo(MilliGram))
        assertEquals(oneMilliGram, oneMilliGram.unitTo(Point).unitTo(MilliGram))


        assertEquals(oneMicroGram, oneMicroGram.unitTo(Gram).unitTo(MicroGram))
        assertEquals(oneMicroGram, oneMicroGram.unitTo(DeciGram).unitTo(MicroGram))
        assertEquals(oneMicroGram, oneMicroGram.unitTo(CentiGram).unitTo(MicroGram))
        assertEquals(oneMicroGram, oneMicroGram.unitTo(MilliGram).unitTo(MicroGram))
        assertEquals(oneMicroGram, oneMicroGram.unitTo(KiloGram).unitTo(MicroGram))
        assertEquals(oneMicroGram, oneMicroGram.unitTo(MetricTon).unitTo(MicroGram))
        //assertEquals(oneMicroGram, oneMicroGram.unitTo(Quintal).unitTo(MicroGram))
        assertEquals(oneMicroGram, oneMicroGram.unitTo(Karat).unitTo(MicroGram))
        assertEquals(oneMicroGram, oneMicroGram.unitTo(Point).unitTo(MicroGram))


        assertEquals(oneTon, oneTon.unitTo(Gram).unitTo(MetricTon))
        assertEquals(oneTon, oneTon.unitTo(DeciGram).unitTo(MetricTon))
        assertEquals(oneTon, oneTon.unitTo(CentiGram).unitTo(MetricTon))
        assertEquals(oneTon, oneTon.unitTo(MilliGram).unitTo(MetricTon))
        assertEquals(oneTon, oneTon.unitTo(MicroGram).unitTo(MetricTon))
        assertEquals(oneTon, oneTon.unitTo(KiloGram).unitTo(MetricTon))
        assertEquals(oneTon, oneTon.unitTo(Quintal).unitTo(MetricTon))
        assertEquals(oneTon, oneTon.unitTo(Karat).unitTo(MetricTon))
        assertEquals(oneTon, oneTon.unitTo(Point).unitTo(MetricTon))


        assertEquals(oneQuintal, oneQuintal.unitTo(Gram).unitTo(Quintal))
        assertEquals(oneQuintal, oneQuintal.unitTo(DeciGram).unitTo(Quintal))
        assertEquals(oneQuintal, oneQuintal.unitTo(CentiGram).unitTo(Quintal))
        assertEquals(oneQuintal, oneQuintal.unitTo(MilliGram).unitTo(Quintal))
        //assertEquals(oneQuintal, oneQuintal.unitTo(MicroGram).unitTo(Quintal))
        assertEquals(oneQuintal, oneQuintal.unitTo(MetricTon).unitTo(Quintal))
        assertEquals(oneQuintal, oneQuintal.unitTo(KiloGram).unitTo(Quintal))
        assertEquals(oneQuintal, oneQuintal.unitTo(Karat).unitTo(Quintal))
        assertEquals(oneQuintal, oneQuintal.unitTo(Point).unitTo(Quintal))


        assertEquals(oneKarat, oneKarat.unitTo(Gram).unitTo(Karat))
        assertEquals(oneKarat, oneKarat.unitTo(DeciGram).unitTo(Karat))
        assertEquals(oneKarat, oneKarat.unitTo(CentiGram).unitTo(Karat))
        assertEquals(oneKarat, oneKarat.unitTo(MilliGram).unitTo(Karat))
        assertEquals(oneKarat, oneKarat.unitTo(MicroGram).unitTo(Karat))
        assertEquals(oneKarat, oneKarat.unitTo(MetricTon).unitTo(Karat))
        assertEquals(oneKarat, oneKarat.unitTo(Quintal).unitTo(Karat))
        assertEquals(oneKarat, oneKarat.unitTo(KiloGram).unitTo(Karat))
        assertEquals(oneKarat, oneKarat.unitTo(Point).unitTo(Karat))


        assertEquals(onePoint, onePoint.unitTo(Gram).unitTo(Point))
        assertEquals(onePoint, onePoint.unitTo(DeciGram).unitTo(Point))
        assertEquals(onePoint, onePoint.unitTo(CentiGram).unitTo(Point))
        assertEquals(onePoint, onePoint.unitTo(MilliGram).unitTo(Point))
        assertEquals(onePoint, onePoint.unitTo(MicroGram).unitTo(Point))
        assertEquals(onePoint, onePoint.unitTo(MetricTon).unitTo(Point))
        assertEquals(onePoint, onePoint.unitTo(Quintal).unitTo(Point))
        assertEquals(onePoint, onePoint.unitTo(Karat).unitTo(Point))
        assertEquals(onePoint, onePoint.unitTo(KiloGram).unitTo(Point))
    }

    @Test
    fun testEquals() {
        println("=============Test equals()=================")
        assertEquals(Mass(1.0, Gram), Mass(1.0e-3, KiloGram))
        assertEquals(Mass(1.0, Gram), Mass(1.0e-6, MetricTon))
        assertEquals(Mass(1.0, Gram), Mass(1.0e-5, Quintal))
        assertEquals(Mass(1.0, Gram), Mass(1.0e1, DeciGram))
        assertEquals(Mass(1.0, Gram), Mass(1.0e2, CentiGram))
        assertEquals(Mass(1.0, Gram), Mass(1.0e3, MilliGram))
        assertEquals(Mass(1.0, Gram), Mass(1.0e6, MicroGram))
        assertEquals(Mass(1.0, Gram), Mass(5.0, Karat))
        assertEquals(Mass(1.0, Gram), Mass(500.0, Point))

        assertEquals(Mass(1.0, KiloGram), Mass(1.0e3, Gram))
        assertEquals(Mass(1.0, KiloGram), Mass(1.0e-3, MetricTon))
        assertEquals(Mass(1.0, KiloGram), Mass(1.0e-2, Quintal))
        assertEquals(Mass(1.0, KiloGram), Mass(1.0e4, DeciGram))
        assertEquals(Mass(1.0, KiloGram), Mass(1.0e5, CentiGram))
        assertEquals(Mass(1.0, KiloGram), Mass(1.0e6, MilliGram))
        assertEquals(Mass(1.0, KiloGram), Mass(1.0e9, MicroGram))
        assertEquals(Mass(1.0, KiloGram), Mass(5000.0, Karat))
        assertEquals(Mass(1.0, KiloGram), Mass(500000.0, Point))

        assertEquals(Mass(1.0, MetricTon), Mass(1.0e6, Gram))
        assertEquals(Mass(1.0, MetricTon), Mass(1.0e3, KiloGram))
        assertEquals(Mass(1.0, MetricTon), Mass(1.0e1, Quintal))
        assertEquals(Mass(1.0, MetricTon), Mass(1.0e7, DeciGram))
        assertEquals(Mass(1.0, MetricTon), Mass(1.0e8, CentiGram))
        assertEquals(Mass(1.0, MetricTon), Mass(1.0e9, MilliGram))
        assertEquals(Mass(1.0, MetricTon), Mass(1.0e12, MicroGram))
        assertEquals(Mass(1.0, MetricTon), Mass(5.0e6, Karat))
        assertEquals(Mass(1.0, MetricTon), Mass(5.0e8, Point))

        assertEquals(Mass(1.0, Quintal), Mass(1.0e5, Gram))
        assertEquals(Mass(1.0, Quintal), Mass(1.0e2, KiloGram))
        assertEquals(Mass(1.0, Quintal), Mass(1.0e-1, MetricTon))
        assertEquals(Mass(1.0, Quintal), Mass(1.0e6, DeciGram))
        assertEquals(Mass(1.0, Quintal), Mass(1.0e7, CentiGram))
        assertEquals(Mass(1.0, Quintal), Mass(1.0e8, MilliGram))
        assertEquals(Mass(1.0, Quintal), Mass(1.0e11, MicroGram))
        assertEquals(Mass(1.0, Quintal), Mass(5.0e5, Karat))
        assertEquals(Mass(1.0, Quintal), Mass(5.0e7, Point))

        assertEquals(Mass(1.0, DeciGram), Mass(1.0e-1, Gram))
        assertEquals(Mass(1.0, DeciGram), Mass(1.0e-4, KiloGram))
        assertEquals(Mass(1.0, DeciGram), Mass(1.0e-7, MetricTon))
        assertEquals(Mass(1.0, DeciGram), Mass(1.0e-6, Quintal))
        assertEquals(Mass(1.0, DeciGram), Mass(1.0e1, CentiGram))
        assertEquals(Mass(1.0, DeciGram), Mass(1.0e2, MilliGram))
        assertEquals(Mass(1.0, DeciGram), Mass(1.0e5, MicroGram))
        assertEquals(Mass(1.0, DeciGram), Mass(5.0e-1, Karat))
        assertEquals(Mass(1.0, DeciGram), Mass(5.0e1, Point))

        assertEquals(Mass(1.0, CentiGram), Mass(1.0e-2, Gram))
        assertEquals(Mass(1.0, CentiGram), Mass(1.0e-5, KiloGram))
        assertEquals(Mass(1.0, CentiGram), Mass(1.0e-8, MetricTon))
        assertEquals(Mass(1.0, CentiGram), Mass(1.0e-7, Quintal))
        assertEquals(Mass(1.0, CentiGram), Mass(1.0e-1, DeciGram))
        assertEquals(Mass(1.0, CentiGram), Mass(1.0e1, MilliGram))
        assertEquals(Mass(1.0, CentiGram), Mass(1.0e4, MicroGram))
        assertEquals(Mass(1.0, CentiGram), Mass(5.0e-2, Karat))
        assertEquals(Mass(1.0, CentiGram), Mass(5.0e0, Point))

        assertEquals(Mass(1.0, MilliGram), Mass(1.0e-3, Gram))
        assertEquals(Mass(1.0, MilliGram), Mass(1.0e-6, KiloGram))
        assertEquals(Mass(1.0, MilliGram), Mass(1.0e-9, MetricTon))
        assertEquals(Mass(1.0, MilliGram), Mass(1.0e-8, Quintal))
        assertEquals(Mass(1.0, MilliGram), Mass(1.0e-2, DeciGram))
        assertEquals(Mass(1.0, MilliGram), Mass(1.0e-1, CentiGram))
        assertEquals(Mass(1.0, MilliGram), Mass(1.0e3, MicroGram))
        assertEquals(Mass(1.0, MilliGram), Mass(5.0e-3, Karat))
        assertEquals(Mass(1.0, MilliGram), Mass(5.0e-1, Point))

        assertEquals(Mass(1.0, MicroGram), Mass(1.0e-6, Gram))
        assertEquals(Mass(1.0, MicroGram), Mass(1.0e-9, KiloGram))
        assertEquals(Mass(1.0, MicroGram), Mass(1.0e-12, MetricTon))
        assertEquals(Mass(1.0, MicroGram), Mass(1.0e-11, Quintal))
        assertEquals(Mass(1.0, MicroGram), Mass(1.0e-5, DeciGram))
        assertEquals(Mass(1.0, MicroGram), Mass(1.0e-4, CentiGram))
        assertEquals(Mass(1.0, MicroGram), Mass(1.0e-3, MilliGram))
        assertEquals(Mass(1.0, MicroGram), Mass(5.0e-6, Karat))
        assertEquals(Mass(1.0, MicroGram), Mass(5.0e-4, Point))

        assertEquals(Mass(1.0, Karat), Mass(0.2e0, Gram))
        assertEquals(Mass(1.0, Karat), Mass(0.2e-3, KiloGram))
        assertEquals(Mass(1.0, Karat), Mass(0.2e-6, MetricTon))
        assertEquals(Mass(1.0, Karat), Mass(0.2e-5, Quintal))
        assertEquals(Mass(1.0, Karat), Mass(0.2e1, DeciGram))
        assertEquals(Mass(1.0, Karat), Mass(0.2e2, CentiGram))
        assertEquals(Mass(1.0, Karat), Mass(0.2e3, MilliGram))
        assertEquals(Mass(1.0, Karat), Mass(0.2e6, MicroGram))
        assertEquals(Mass(1.0, Karat), Mass(1.0e2, Point))

        assertEquals(Mass(1.0, Point), Mass(0.2e-2, Gram))
        assertEquals(Mass(1.0, Point), Mass(0.2e-5, KiloGram))
        assertEquals(Mass(1.0, Point), Mass(0.2e-8, MetricTon))
        assertEquals(Mass(1.0, Point), Mass(0.2e-7, Quintal))
        assertEquals(Mass(1.0, Point), Mass(0.2e-1, DeciGram))
        assertEquals(Mass(1.0, Point), Mass(0.2e0, CentiGram))
        assertEquals(Mass(1.0, Point), Mass(0.2e1, MilliGram))
        assertEquals(Mass(1.0, Point), Mass(0.2e4, MicroGram))
        assertEquals(Mass(1.0, Point), Mass(1.0e-2, Karat))

    }
}