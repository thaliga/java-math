
package net.projecteuler;

import static java.lang.System.nanoTime;
import static net.projecteuler.Problem002.solutionBruteforce;
import static net.projecteuler.Problem002.solutionElegant;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem002Test {

    @Test
    public void testSolutionBruteforce() throws Exception {
        double time = nanoTime();
        long result = solutionBruteforce();
        System.out.println("Time for brute force solution was " + (nanoTime() - time) / 1000000 + " milliseconds.");
        assertEquals(result, 4613732L);
    }

    @Test
    public void testSolutionElegant() throws Exception {
        double time = nanoTime();
        long result = solutionElegant();
        System.out.println("Time for elegant solution was " + (nanoTime() - time) / 1000000 + " milliseconds.");
        assertEquals(result, 4613732L);
    }
}
