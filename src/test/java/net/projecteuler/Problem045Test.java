
package net.projecteuler;

import static java.lang.System.nanoTime;
import static net.projecteuler.Problem045.solution;
import static net.projecteuler.Problem045.solutionBruteforce;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem045Test {

    @Test
    public void testSolution() throws Exception {
        double time = nanoTime();
        long result = solution(285, 165, 143);
        System.out.println("[045] solution (" + result + ") in " + (nanoTime() - time) / 1000000 + " milliseconds.");
        assertEquals(1533776805L, result);
    }

    @Test
    public void testSolutionBruteforce() throws Exception {
        double time = nanoTime();
        long result = solutionBruteforce(285, 165, 143);
        System.out.println("[045] brute force solution (" + result + ") in " + (nanoTime() - time) / 1000000 +
                " milliseconds.");
        assertEquals(1533776805L, result);
    }
}
