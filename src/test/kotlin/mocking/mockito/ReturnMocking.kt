package mocking.mockito

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mock
import org.mockito.Mockito.doReturn
import org.mockito.junit.jupiter.MockitoExtension

@ExtendWith(MockitoExtension::class)
class ReturnMocking {
    class TestClass {
        fun simpleReturn(): Int {
            return 1;
        }
    }
    @Test
    fun testDoReturn(@Mock underTest: TestClass) {
        // The ugly `when`
        doReturn(2).`when`(underTest).simpleReturn();

        assertThat(underTest.simpleReturn()).isEqualTo(2);
    }
}
