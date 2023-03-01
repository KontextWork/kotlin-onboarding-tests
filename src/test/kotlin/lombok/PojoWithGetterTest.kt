package lombok

import org.assertj.core.api.AssertionsForClassTypes.assertThatCode
import org.junit.jupiter.api.Test

class PojoWithGetterTest {

    @Test
    fun shouldAccess(){
        val pojo = PojoWithGetter();
        assertThatCode {pojo.field1}.doesNotThrowAnyException()
    }
}
