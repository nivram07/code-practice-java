package code.practice.problem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;

@RunWith(JUnit4.class)
public class PrimeNumberTest {

  @Test
  public void itShouldGeneratePrimeNumbersUpToN() {
    PrimeNumber primeNumber = new PrimeNumber();
    int[] result = primeNumber.generateAllPrimeToN(100);
    System.out.println(Arrays.toString(result));
  }
}
