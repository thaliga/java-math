
package net.projecteuler;

import static java.lang.Math.pow;

public class Problem004 {

    public static boolean isPalindrome(int number) {
        char[] digits = Integer.toString(number).toCharArray();
        int length = digits.length;
        for (int i = 0; i <= length / 2; i++) {
            if (digits[i] != digits[length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static long solutionBruteforce(long value) {
        long result = 0L;
        int maxValue = (int) pow(10, value) - 1;
        for (int level = 0; level < maxValue; ++level) {
            int common = maxValue - level;
            boolean finished = true;
//            System.out.println("processing level " + level);
            for (int i = 0; i <= level; ++i) {
                int m = (common - i) * (common + i);
                if (m > result) {
                    finished = false;
                    if (isPalindrome(m)) {
//                        System.out.println("palindrome found: " + m + " = " + (common - i) + " * " + (common + i));
                        result = m;
                    }
                }
            }
            if (finished) {
                break;
            }
            if (result > 0) {
//                System.out.println("result found at level " + level + ": " + result);
            }
        }
        return result;
    }
}
