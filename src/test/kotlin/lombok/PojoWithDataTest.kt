package lombok

import org.assertj.core.api.AssertionsForClassTypes.assertThatCode
import org.junit.jupiter.api.Test

class PojoWithDataTest {

    @Test
    fun shouldAccess(){
        val pojo = PojoWithData();
        assertThatCode {pojo.field1}
            .doesNotThrowAnyException()
    }
}
