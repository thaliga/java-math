
package net.projecteuler;

import common.PrimeCheckerWith6n;
import common.PrimeChecker;
import common.Primes;

public class Problem007 {

    public static long solution(int numberOfPrime) {
        int count = 1;
        int candidate = 1;
        PrimeChecker checker = new PrimeCheckerWith6n();
        do {
            candidate = candidate + 2;
            if (checker.isPrime(candidate)) {
                count = count + 1;
            }
        } while (count != numberOfPrime);
        return candidate;
    }

    public static long solutionBruteforce(int numberOfPrime) {
        int[] primes = Primes.primes(numberOfPrime);
        return primes[primes.length - 1];
    }
}
