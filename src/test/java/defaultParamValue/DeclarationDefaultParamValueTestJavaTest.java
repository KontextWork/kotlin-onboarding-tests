package defaultParamValue;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DeclarationDefaultParamValueTestJavaTest
{
  @Test
  void atTheStart() {
    assertThat((new DeclarationDefaultParamValue().atTheStart(1))).isEqualTo("1 and Me");
  }

  @Test
  void atTheEnd() {
    assertThat((new DeclarationDefaultParamValue().atTheEnd(1))).isEqualTo("1 and Me");
  }

  @Test
  void allGivenAtTheEnd() {
    assertThat((new DeclarationDefaultParamValue().atTheEnd(1, "Mo"))).isEqualTo("1 and Mo");
  }

  @Test
  void allGivenAtTheStart() {
    assertThat((new DeclarationDefaultParamValue().atTheStart("Mo",1))).isEqualTo("1 and Mo");
  }
}
