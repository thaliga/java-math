
package net.projecteuler;

import static java.lang.System.nanoTime;
import static net.projecteuler.Problem020.solutionBruteforce;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem020Test {

    @Test
    public void testSolutionBruteforce() throws Exception {
        double time = nanoTime();
        long result = solutionBruteforce();
        System.out.println("[020] brute force solution (" + result + ") in " + (nanoTime() - time) / 1000000 +
                " milliseconds.");
        assertEquals(648L, result);
    }
}
