
package net.projecteuler;

import static java.lang.System.nanoTime;
import static net.projecteuler.Problem009.solutionBruteforce;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem009Test {
    @Test
    public void testSolutionBruteforce() throws Exception {
        double time = nanoTime();
        long result = solutionBruteforce(1000);
        System.out.println("Time for brute force solution (" + result + ") took " + (nanoTime() - time) / 1000000 +
                           " milliseconds.");
        assertEquals(31875000, result);
    }
}
