package code.practice.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumber {
  public int[] generateAllPrimeToN(int n) {
    boolean[] flags = new boolean[n + 1];
    Arrays.fill(flags, true);
    flags[0] = false;
    flags[1] = false;
    List<Integer> primes = new ArrayList<>();
    int index = 2;
    while (index < (int)Math.sqrt(n) + 1) {
      invalidate(flags, index);
      index = getNextPrime(flags, index);
    }

    for (int i = 0; i < flags.length; i++) {
      if (flags[i]) primes.add(i);
    }
    return primes.stream().mapToInt(i -> i).toArray();
  }

  public void invalidate(boolean[] flags, int prime) {
    for (int i = prime * prime; i < flags.length; i += prime) {
      flags[i] = false;
    }
  }

  public int getNextPrime(boolean[] flags, int prime) {
    int index = prime + 1;
    for (int i = index; i < flags.length; i++) {
      if (flags[i]) {
        index = i;
        break;
      }
    }
    return index;
  }
}
