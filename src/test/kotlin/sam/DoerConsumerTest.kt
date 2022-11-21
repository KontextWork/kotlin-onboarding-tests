package sam

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DoerConsumerTest {
    @Test
    fun lambdaLastParam() {
        DoerConsumer().giveMeDoerNoArg() { println("hi") }
    }

    @Test
    fun lambdaLastParamFold() {
        val items = listOf(1,2,3,4,5)
        val fold = items.fold("Elements") { acc, i -> "$acc $i" }
        assertThat(fold).isEqualTo("Elements 1 2 3 4 5")
    }
}
