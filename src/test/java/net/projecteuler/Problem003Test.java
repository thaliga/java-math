
package net.projecteuler;

import static java.lang.System.nanoTime;
import static net.projecteuler.Problem003.solutionBruteforce;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem003Test {
    @Test
    public void testSolutionBruteforce() throws Exception {
        long value = 600851475143L;
        double time = nanoTime();
        long result = solutionBruteforce(value);
        System.out.println("Time for brute force solution was " + (nanoTime() - time) / 1000000 + " milliseconds.");
        assertEquals(result, 6857L);
    }
}
