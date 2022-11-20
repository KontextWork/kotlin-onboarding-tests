package companion

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class DeclarationCompanionTest {
    @Test
    fun accessStatic() {
        println("Program arguments: ${DeclarationCompanion::FOO}")

    }

    @Test
    fun accessCompanionStatic() {
        // that's odd when accessing the companion?
        println("Program arguments: ${DeclarationCompanion.BAR}")
    }
}
