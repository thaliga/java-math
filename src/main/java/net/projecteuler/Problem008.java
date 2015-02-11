
package net.projecteuler;

import static common.Util.getInt;

public class Problem008 {

    private static int multiplyFiveDigits(int lastIndex, char[] digits) {
        int n = lastIndex;
        return getInt(digits[n - 4]) * getInt(digits[n - 3]) * getInt(digits[n - 2]) * getInt(digits[n - 1]) *
               getInt(digits[n]);
    }

    public static long solutionBruteforce(char[] digits) {
        int numberOfDigits = digits.length;
        long result = multiplyFiveDigits(4, digits);
        long m = result;
        int zeroIndex = -1;
        for (int i = 5; i < numberOfDigits; ++i) {
            int newest = getInt(digits[i]);
            if (newest == 0) {
                zeroIndex = i;
                continue;
            }

            if (i - zeroIndex < 5) {
                continue;
            }

            if (zeroIndex == -1) {
                int oldest = getInt(digits[i - 5]);
                m /= oldest;
                m *= newest;
            } else {
                zeroIndex = -1;
                m = multiplyFiveDigits(i, digits);
            }

            if (m > result) {
                result = m;
            }
        }
        return result;
    }
}
