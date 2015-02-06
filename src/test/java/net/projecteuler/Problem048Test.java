
package net.projecteuler;

import static java.lang.System.nanoTime;
import static net.projecteuler.Problem048.solution;
import static net.projecteuler.Problem048.solutionBruteforce;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem048Test {

    @Test
    public void testSolution() throws Exception {
        double time = nanoTime();
        long result = solution();
        System.out.println("[048] solution (" + result + ") in " + (nanoTime() - time) / 1000000 + " milliseconds.");
        assertEquals(0L, result);
    }

    @Test
    public void testSolutionBruteforce() throws Exception {
        double time = nanoTime();
        long result = solutionBruteforce(1000);
        System.out.println("[048] brute force solution (" + result + ") in " + (nanoTime() - time) / 1000000 +
                " milliseconds.");
        assertEquals(9110846700L, result);
    }
}
