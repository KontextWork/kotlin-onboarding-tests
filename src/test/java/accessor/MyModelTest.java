package accessor;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

public class MyModelTest
{
  /**
   * Ensure that kotlin getter/setter actually expose getX for java.
   */
  @Test
  void shouldHaveAccessor() {
    final MyModel apple = new MyModel(true, "apple");

    apple.setName("banana");
    assertThat(apple.getGreen()).isTrue();
    assertThat(apple.getName()).isEqualTo("banana");
  }
}
