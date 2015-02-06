
package net.projecteuler;

import java.math.BigInteger;

public class Problem020 {

    public static long solutionBruteforce() {
        BigInteger factorial = new BigInteger("100");
        for (int i = 99; i > 0; --i) {
            factorial = factorial.multiply(new BigInteger(Integer.toString(i)));
        }
        return Util.sumOfDigits(factorial);
    }
}
