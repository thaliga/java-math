
package net.projecteuler;

import static java.lang.System.nanoTime;
import static net.projecteuler.Problem028.solution;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem028Test {

    @Test
    public void testSolution3() throws Exception {
        double time = nanoTime();
        long result = solution(3);
        System.out.println("[028] solution (" + result + ") in " + (nanoTime() - time) / 1000000 + " milliseconds.");
        assertEquals(25L, result);
    }

    @Test
    public void testSolution5() throws Exception {
        double time = nanoTime();
        long result = solution(5);
        System.out.println("[028] solution (" + result + ") in " + (nanoTime() - time) / 1000000 + " milliseconds.");
        assertEquals(101L, result);
    }

    @Test
    public void testSolution1001() throws Exception {
        double time = nanoTime();
        long result = solution(1001);
        System.out.println("[028] solution (" + result + ") in " + (nanoTime() - time) / 1000000 + " milliseconds.");
        assertEquals(669171001L, result);
    }
}
