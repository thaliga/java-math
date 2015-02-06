
package net.projecteuler;

import static java.lang.System.nanoTime;
import static net.projecteuler.Problem012.solution;
import static net.projecteuler.Problem012.solutionBruteforce;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem012Test {

    @Test
    public void testSolution() throws Exception {
        double time = nanoTime();
        long result = solution();
        System.out.println("[012] solution (" + result + ") in " + (nanoTime() - time) / 1000000 + " milliseconds.");
        assertEquals(76576500L, result);
    }

    @Test
    public void testSolutionBruteforce() throws Exception {
        double time = nanoTime();
        long result = solutionBruteforce();
        System.out.println("[012] brute force solution (" + result + ") in " + (nanoTime() - time) / 1000000 +
                " milliseconds.");
        assertEquals(76576500L, result);
    }
}
