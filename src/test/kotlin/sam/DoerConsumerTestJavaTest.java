package sam;

import org.junit.jupiter.api.Test;

class DoerConsumerTestJavaTest
{
  @Test
  void doer() {
    (new DoerConsumer()).giveMeDoerNoArg(() -> { var i = 1;});
  }
}
