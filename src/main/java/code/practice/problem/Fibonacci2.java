package code.practice.problem;

public class Fibonacci2 {

    public static void main(String[] args) {

        int n = 30;
        System.out.println(getFibonacci(n, new int[n+1]));
    }

    public static int getFibonacci(int n, int[] memo) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (memo[n] == 0) {
            memo[n] = getFibonacci(n - 1, memo) + getFibonacci(n - 2, memo);
        }
        return memo[n];
    }
}
