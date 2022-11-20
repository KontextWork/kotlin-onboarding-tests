package unit

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DeclarationUnitTest {
    @Test
    fun doReturnNothing() {
        val underTest = DeclarationUnit()
        assertThat(underTest.returnNothing()).isInstanceOf(Unit::class.java)
    }

    @Test
    fun doReturnUnit() {
        val underTest = DeclarationUnit()
        assertThat(underTest.returnUnit()).isInstanceOf(Unit::class.java)
    }
}
