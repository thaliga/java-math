
package net.projecteuler;

import static java.lang.System.nanoTime;
import static net.projecteuler.Problem004.solutionBruteforce;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem004Test {
    @Test
    public void testPalindrome() throws Exception {
        assertEquals(true, Problem004.isPalindrome(1001));
        assertEquals(true, Problem004.isPalindrome(121));
        assertEquals(false, Problem004.isPalindrome(1212));
        assertEquals(false, Problem004.isPalindrome(10));
    }

    @Test
    public void testSolutionBruteforce2Digits() throws Exception {
        long value = 2L;
        double time = nanoTime();
        long result = solutionBruteforce(value);
        System.out.println("Time for brute force solution (" + "-> " + ") took " + (nanoTime() - time) / 1000000 +
                " milliseconds.");
        assertEquals(9009L, result);
    }

    @Test
    public void testSolutionBruteforceFor3Digits() throws Exception {
        long value = 3L;
        double time = nanoTime();
        long result = solutionBruteforce(value);
        System.out.println("Time for brute force solution (" + "-> " + ") took " + (nanoTime() - time) / 1000000 +
                " milliseconds.");
        assertEquals(906609L, result);
    }
}
