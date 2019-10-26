package code.practice.java.problem;

import java.util.Arrays;

public class Fibonacci {

    public static void main(String args[]) {
        int fibNumbers[] = new int[30];
        fibonacci(fibNumbers);
//        Arrays.stream(fibNumbers).forEach(num -> System.out.println(num));
        justPrintFibonacci(10);
    }

    // 0 1 1 2 3 5 8 13 21
    public static void fibonacci(int arr[]) {
        if ( arr.length == 1) {
            arr[0] = 0;
        }

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
    }

    public static void justPrintFibonacci(int n) {
        if (n <= 0) {
            return;
        } else if (n == 1) {
            System.out.println("0");
        } else {
            System.out.println("0");
            System.out.println("1");
            int numMinusOne = 1;
            int numMinusTwo = 0;
            for (int i = 2; i < n; i++) {
                int currentNum = numMinusOne + numMinusTwo;
                numMinusTwo = numMinusOne;
                numMinusOne = currentNum;
                System.out.println(currentNum);
            }
        }
    }
}
