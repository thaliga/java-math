
package net.projecteuler;

import static java.lang.System.nanoTime;
import static net.projecteuler.Problem007.solution;
import static net.projecteuler.Problem007.solutionBruteforce;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem007Test {

    private static final int LIMIT = 10001;

    @Test
    public void testSolution() throws Exception {
        double time = nanoTime();
        long result = solution(LIMIT);
        System.out.println("Time for solution was " + (nanoTime() - time) / 1000000 + " milliseconds.");
        assertEquals(104743L, result);
    }

    @Test
    public void testSolutionBruteforce() throws Exception {
        double time = nanoTime();
        long result = solutionBruteforce(LIMIT);
        System.out.println("Time for brute force solution was " + (nanoTime() - time) / 1000000 + " milliseconds.");
        assertEquals(104743L, result);
    }
}
