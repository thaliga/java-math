
package net.projecteuler;

import static net.projecteuler.Util.findFibonacciIndex;
import static net.projecteuler.Util.sumFibonacciNumbers;

public class Problem002 {

    public static long solutionBruteforce() {
        long result = 0;
        long limit = 4000000L;
        long a = 1;
        long b = 1;
        long c = 2;
        for (; c < limit;) {
            result += c;
            a = b + c;
            b = c + a;
            c = a + b;
        }
        return result;
    }

    public static long solutionElegant() {
        long result = 0;
        long limit = 4000000L;
        int index = findFibonacciIndex(limit);
        if (index % 3 == 0) {
            result = sumFibonacciNumbers(index) / 2;
        }
        return result;
    }
}
