package companion

import org.assertj.core.api.AssertionsForClassTypes.assertThat
import org.junit.jupiter.api.Test

internal class IhaveStaticsTest {
    @Test
    fun shouldAccessStatic() {
        assertThat(IhaveStatics.
        FIELD).isEqualTo("123");
    }
}
