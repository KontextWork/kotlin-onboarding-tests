package defaultParamValue

import org.assertj.core.api.Assertions.assertThat

import org.junit.jupiter.api.Test

internal class DeclarationDefaultParamValueTest {
    @Test
    fun atTheEnd() {
        assertThat(DeclarationDefaultParamValue().atTheEnd(1)).isEqualTo("1 and Me")
    }

    @Test
    fun atTheStart() {
        assertThat(DeclarationDefaultParamValue().atTheStart(number = 1)).isEqualTo("1 and Me")
    }
}
