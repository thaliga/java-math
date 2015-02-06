
package net.projecteuler;

import net.projecteuler.Util.Prime.Checker;
import net.projecteuler.Util.Prime.CheckerWith6n;

public class Problem010 {

    public static long solution(int number) {
        long sum = 2L;
        int candidate = 1;
        Checker checker = new CheckerWith6n();
        do {
            candidate = candidate + 2;
            if (checker.isPrime(candidate)) {
                sum += candidate;
            }
        } while (candidate < number);
        return sum;
    }

    public static long solutionBruteforce(int number) {
        long sum = 0L;
        int[] primes = Util.Prime.primesUnder(number);
        for (int prime : primes) {
            sum += prime;
        }
        return sum;
    }
}
