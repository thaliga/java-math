
package net.projecteuler;

import java.math.BigInteger;

public class Problem013 {

    public static String solutionBruteforce(String[] numbers) {
        BigInteger sum = new BigInteger("0");
        for (int i = 0; i < numbers.length; ++i) {
            sum = sum.add(new BigInteger(numbers[i]));
        }
        return sum.toString().substring(0, 10);
    }
}
