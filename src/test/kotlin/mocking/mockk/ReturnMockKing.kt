package mocking.mockk

import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(MockKExtension::class)
class ReturnMockKing {
    class TestClass {
        fun simpleReturn(): Int {
            return 1;
        }
    }
    @Test
    fun testDoReturn(@MockK underTest: TestClass) {
        every {
            underTest.simpleReturn()
        }.returns(2)

        assertThat(underTest.simpleReturn()).isEqualTo(2);
    }
}
