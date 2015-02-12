
package net.projecteuler;

import common.PrimeCheckerWith6n;
import common.PrimeChecker;
import common.Primes;

public class Problem010 {

    public static long solution(int number) {
        long sum = 2L;
        int candidate = 1;
        PrimeChecker checker = new PrimeCheckerWith6n();
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
        int[] primes = Primes.primesUnder(number);
        for (int prime : primes) {
            sum += prime;
        }
        return sum;
    }
}
