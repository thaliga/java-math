
package net.projecteuler;

import static java.lang.Math.sqrt;

public class Problem003 {

    public static long solutionBruteforce(long value) {
        long result = value;
        if (result % 2 == 0) {
            result /= 2;
        }
        double sqrt = sqrt(result);
        for (long i = 3;; i += 2) {
            if (sqrt < i) {
                break;
            }
            if (result % i == 0) {
                while (result % i == 0) {
                    result = result / i;
                }
                sqrt = sqrt(result);
            }
        }
        return result;
    }
}
