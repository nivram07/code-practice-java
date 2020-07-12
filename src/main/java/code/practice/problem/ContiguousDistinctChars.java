package code.practice.problem;

import java.util.HashMap;
import java.util.Map;

/* Calculate the maximum contiguous characters that has k distinct characters
    example.
    AAAHHBIG, k = 2
    answer = 5 because AAAHH is the maximum contiguous characters
* */
public class ContiguousDistinctChars {

  public static void main(String[] args) {

    int result = findMaxContiguousChars("AAAHHBIGBBBBVVVVVVV", 2);
    System.out.format("result: %d\n", result);

    result = findMaxContiguousChars("AAAHHBIGBBBBCVVVVVVV", 2);
    System.out.format("result: %d\n", result);
    result = findMaxContiguousChars("AAAHHBIGBBBBCVVVVVVV", 3);
    System.out.format("result: %d\n", result);
  }

  public static int findMaxContiguousChars(String str, int k) {
    int left = 0;

    int result = Integer.MIN_VALUE;
    int currentMax = 0;
    Map<Character, Integer> charCountMap = new HashMap<>();
    for (int right = 0; right < str.length(); right++) {
      Character c = str.charAt(right);
      if (charCountMap.containsKey(c)) {
        charCountMap.put(c, charCountMap.get(c) + 1);
        currentMax++;
        result = Integer.max(result, currentMax);
      } else {
        if (charCountMap.size() < k) {
          charCountMap.put(c, 1);
          currentMax++;
          result = Integer.max(result, currentMax);
        } else {
          charCountMap.put(c, 1);
          currentMax++;
          while (charCountMap.size() > k) {
            Character leftC = str.charAt(left);
            charCountMap.put(leftC, charCountMap.get(leftC) - 1);
            currentMax--;
            if (charCountMap.get(leftC) == 0) {
              charCountMap.remove(leftC);
            }
            left++;
          }

        }
      }
    }
    return result;
  }
}
