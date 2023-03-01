package lombok

import org.assertj.core.api.AssertionsForClassTypes.assertThatCode
import org.junit.jupiter.api.Test
import utils.MyLombokPojo

/**
 * We need the kotlin lombok gradle plugin to make lombok annotations work in all cases. For example, lombok annotations within
 * the test scope like src/test/java/utils/MyLombokPojo.java would not be respected by kotlin - thus the
 * getter would not be callable. For lombok support within the main scope, we could use the normal java lombok
 * annotation processor.
 */
class PojoWithGetterFromTestScopeTest {

    @Test
    fun shouldAccess(){
        val pojo = MyLombokPojo();
        assertThatCode {pojo.field1} .doesNotThrowAnyException()
    }
}
