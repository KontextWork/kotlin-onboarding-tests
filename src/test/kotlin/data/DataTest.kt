package data

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataTest {
    @Test
    fun shouldCreate() {
        val d = Data("foo", 1)
        assertThat(d.field1).isEqualTo("foo")
        assertThat(d.field2).isEqualTo(1)

        // set mutable
        d.field2 = 5
        assertThat(d.field2).isEqualTo(5)
    }
}
