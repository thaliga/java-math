
package net.projecteuler;

import static java.lang.System.nanoTime;
import static net.projecteuler.Problem006.solution;
import static net.projecteuler.Problem006.solutionBruteforce;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem006Test {
    @Test
    public void testSolutionFor10() throws Exception {
        long value = 10L;
        double time = nanoTime();
        long result = solution(value);
        System.out.println("Time for solution (" + value + "-> " + result + ") took " +
                (nanoTime() - time) / 1000000 + " milliseconds.");
        assertEquals(2640L, result);
    }

    @Test
    public void testSolutionFor100() throws Exception {
        long value = 100L;
        double time = nanoTime();
        long result = solution(value);
        System.out.println("Time for solution (" + value + "-> " + result + ") took " +
                (nanoTime() - time) / 1000000 + " milliseconds.");
        assertEquals(25164150L, result);
    }

    @Test
    public void testSolutionBruteforceFor10() throws Exception {
        long value = 10L;
        double time = nanoTime();
        long result = solutionBruteforce(value);
        System.out.println("Time for brute force solution (" + value + "-> " + result + ") took " +
                (nanoTime() - time) / 1000000 + " milliseconds.");
        assertEquals(2640L, result);
    }

    @Test
    public void testSolutionBruteforceFor100() throws Exception {
        long value = 100L;
        double time = nanoTime();
        long result = solutionBruteforce(value);
        System.out.println("Time for brute force solution (" + value + "-> " + result + ") took " +
                (nanoTime() - time) / 1000000 + " milliseconds.");
        assertEquals(25164150L, result);
    }
}
