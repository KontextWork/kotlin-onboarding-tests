package data

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BuilderDataTest {
    @Test
    fun shouldSetField2() {
        val data = BuilderDefaultParamData(
            field2 = "foo",
            field4 = 1
        )
        assertThat(data.field1).isNull()
        assertThat(data.field2).isEqualTo("foo")
        assertThat(data.field4).isEqualTo(1)
    }

    @Test
    fun shouldApply() {
        val data = BuilderDefaultParamData().apply {
            field2 = "foo"
            field4 = 1
        }
        assertThat(data.field1).isNull()
        assertThat(data.field2).isEqualTo("foo")
        assertThat(data.field4).isEqualTo(1)
    }
}
