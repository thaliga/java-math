
package net.projecteuler;

import static java.lang.System.nanoTime;
import static net.projecteuler.Problem010.solution;
import static net.projecteuler.Problem010.solutionBruteforce;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem010Test {

    private static final int LIMIT = 2000000;

    @Test
    public void testSolution() throws Exception {
        double time = nanoTime();
        long result = solution(LIMIT);
        System.out.println("010 solution (" + result + ") in " + (nanoTime() - time) / 1000000 + " milliseconds.");
        assertEquals(142913828922L, result);
    }

    @Test
    public void testSolutionBruteforce() throws Exception {
        double time = nanoTime();
        long result = solutionBruteforce(LIMIT);
        System.out.println("010 brute force solution (" + result + ") in " + (nanoTime() - time) / 1000000 +
                           " milliseconds.");
        assertEquals(142913828922L, result);
    }
}
