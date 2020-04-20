package code.practice.problem;

public class TwoKeysKeyboard {

    public static void main(String[] args) {
        minSteps(10);

    }

    public static int minSteps(int n) {
        int count = 0;
        int current = 0;
        while (n > 1) {
            current = n/2;
            for (; current > 1; current--) {
                if (n % current == 0) {
                    count += n/current;
                    n = current;
                    break;
                }
            }
            if (current <= 2)
                return count + n;
        }

        return 0;
    }

}
