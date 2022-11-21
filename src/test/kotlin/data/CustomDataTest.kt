package data

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomDataTest {
    @Test
    fun testSetterGetter() {
        val d = CustomData()
        // using a custom setter
        d.field1 = "bar"
        d.field2 = 9000

        // due to the custom setter, it has been prefixed
        assertThat(d.field1).isEqualTo("bar_suffix")
        // custom getter adds 1
        assertThat(d.field2).isEqualTo(9001)
    }
}
