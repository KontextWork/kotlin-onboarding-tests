package collections

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CollectionsTest {
    @Test
    fun shouldFilterList() {
        val items = listOf(1,2,3,4,5)
        assertThat(items.filter {i ->  i % 2 == 0}).containsExactlyInAnyOrder(2,4)
    }

    @Test
    fun shouldIterateMap() {
        val map = mapOf(Pair("k1", "v1"), Pair("k2", "v2"))
        assertThat(map.filter { (k,_) -> k.equals("k1") }).containsKey("k1")
    }
}
