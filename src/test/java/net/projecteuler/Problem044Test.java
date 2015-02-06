
package net.projecteuler;

import static java.lang.System.nanoTime;
import static net.projecteuler.Problem044.solution;
import static net.projecteuler.Problem044.solutionBruteforce;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem044Test {

    @Test
    public void testSolution() throws Exception {
        double time = nanoTime();
        long result = solution();
        System.out.println("[044] solution (" + result + ") in " + (nanoTime() - time) / 1000000 + " milliseconds.");
        assertEquals(0L, result);
    }

    @Test
    public void testSolutionBruteforce() throws Exception {
        double time = nanoTime();
        long result = solutionBruteforce();
        System.out.println("[044] brute force solution (" + result + ") in " + (nanoTime() - time) / 1000000 +
                " milliseconds.");
        assertEquals(5482660L, result);
    }
}
