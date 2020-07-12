package code.practice.problem;

public class PermutationOfString {

  public void permutate(String str) {
    permutate("", str);
  }

  public void permutate(String str, String rem) {
    if (rem.length() == 0) System.out.println(str);
    else {
      for (int i = 0; i < rem.length(); i++) {
        char c = rem.charAt(i);
        permutate(str + c, rem.substring(0,i) + rem.substring(i+1));
      }
    }
  }
}
