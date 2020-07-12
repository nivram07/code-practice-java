package code.practice.problem;

public class GenerateBitMask {

  public static void main(String[] args) {

    int n = 5;
    for (int i = (int)Math.pow(2, n); i < (int)Math.pow(2, n + 1); ++i) {
      // generate bitmask, from 0..00 to 1..11
      System.out.format("%d: ", i);
      String bitmask = Integer.toBinaryString(i).substring(1);
      System.out.format("%s\n", bitmask);
    }

  }
}
