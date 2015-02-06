
package net.projecteuler;

import static java.lang.System.nanoTime;
import static net.projecteuler.Problem014.solutionBruteforce;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem014Test {

    @Test
    public void testSolutionBruteforce() throws Exception {
        double time = nanoTime();
        long result = solutionBruteforce(1000000);
        System.out.println("[014] solution (" + result + ") in " + (nanoTime() - time) / 1000000 + " milliseconds.");
        assertEquals(837799L, result);
    }
}
