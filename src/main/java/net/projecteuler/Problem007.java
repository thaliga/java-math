
package net.projecteuler;

import net.projecteuler.Util.Prime.Checker;
import net.projecteuler.Util.Prime.CheckerWith6n;

public class Problem007 {

    public static long solution(int numberOfPrime) {
        int count = 1;
        int candidate = 1;
        Checker checker = new CheckerWith6n();
        do {
            candidate = candidate + 2;
            if (checker.isPrime(candidate)) {
                count = count + 1;
            }
        } while (count != numberOfPrime);
        return candidate;
    }

    public static long solutionBruteforce(int numberOfPrime) {
        int[] primes = Util.Prime.primes(numberOfPrime);
        return primes[primes.length - 1];
    }
}
