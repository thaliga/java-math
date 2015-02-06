
package net.projecteuler;

import static java.lang.System.nanoTime;
import static net.projecteuler.Problem016.solution;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem016Test {

    @Test
    public void testSolution0() throws Exception {
        double time = nanoTime();
        long result = solution(0);
        System.out.println("[016] solution (" + result + ") in " + (nanoTime() - time) / 1000000 + " milliseconds.");
        assertEquals(1L, result);
    }

    @Test
    public void testSolution3() throws Exception {
        double time = nanoTime();
        long result = solution(3);
        System.out.println("[016] solution (" + result + ") in " + (nanoTime() - time) / 1000000 + " milliseconds.");
        assertEquals(8L, result);
    }

    @Test
    public void testSolution5() throws Exception {
        double time = nanoTime();
        long result = solution(5);
        System.out.println("[016] solution (" + result + ") in " + (nanoTime() - time) / 1000000 + " milliseconds.");
        assertEquals(5L, result);
    }

    @Test
    public void testSolution1000() throws Exception {
        double time = nanoTime();
        long result = solution(1000);
        System.out.println("[016] solution (" + result + ") in " + (nanoTime() - time) / 1000000 + " milliseconds.");
        assertEquals(1366L, result);
    }
}
