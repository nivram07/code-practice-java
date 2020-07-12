package code.practice.problem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class PermutationOfStringTest {

  @Test
  public void itShouldSuccessfullyPrintPermutationOfString() {
    PermutationOfString permutationOfString = new PermutationOfString();

    permutationOfString.permutate("abc");
  }
}
