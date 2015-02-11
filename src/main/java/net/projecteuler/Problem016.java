
package net.projecteuler;

import java.math.BigInteger;

import common.Util;

public class Problem016 {

    public static long solution(int power) {
        BigInteger number = new BigInteger("1").shiftLeft(power);
        return Util.sumOfDigits(number);
    }

    public static long solutionBruteforce() {
        return 0L;
    }
}
