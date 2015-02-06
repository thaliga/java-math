
package net.projecteuler;

import static java.lang.System.nanoTime;
import static net.projecteuler.Problem015.solution;
import static net.projecteuler.Problem015.solutionBruteforce;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem015Test {

    @Test
    public void testSolution2() throws Exception {
        double time = nanoTime();
        long result = solution(2);
        System.out.println("[015] solution (" + result + ") in " + (nanoTime() - time) / 1000000 + " milliseconds.");
        assertEquals(2L, result);
    }

    @Test
    public void testSolution3() throws Exception {
        double time = nanoTime();
        long result = solution(3);
        System.out.println("[015] solution (" + result + ") in " + (nanoTime() - time) / 1000000 + " milliseconds.");
        assertEquals(6L, result);
    }

    @Test
    public void testSolution4() throws Exception {
        double time = nanoTime();
        long result = solution(4);
        System.out.println("[015] solution (" + result + ") in " + (nanoTime() - time) / 1000000 + " milliseconds.");
        assertEquals(20L, result);
    }

    @Test
    public void testSolution5() throws Exception {
        double time = nanoTime();
        long result = solution(5);
        System.out.println("[015] solution (" + result + ") in " + (nanoTime() - time) / 1000000 + " milliseconds.");
        assertEquals(70L, result);
    }

    @Test
    public void testSolution6() throws Exception {
        double time = nanoTime();
        long result = solution(6);
        System.out.println("[015] solution (" + result + ") in " + (nanoTime() - time) / 1000000 + " milliseconds.");
        assertEquals(252L, result);
    }

    @Test
    public void testSolution20() throws Exception {
        double time = nanoTime();
        long result = solution(20);
        System.out.println("[015] solution (" + result + ") in " + (nanoTime() - time) / 1000000 + " milliseconds.");
        assertEquals(35345263800L, result);
    }

    @Test
    public void testSolutionBruteforceFor2() throws Exception {
        double time = nanoTime();
        long result = solutionBruteforce(2);
        System.out.println("[015] brute force solution (" + result + ") in " + (nanoTime() - time) / 1000000 +
                " milliseconds.");
        assertEquals(2L, result);
    }

    @Test
    public void testSolutionBruteforceFor3() throws Exception {
        double time = nanoTime();
        long result = solutionBruteforce(3);
        System.out.println("[015] brute force solution (" + result + ") in " + (nanoTime() - time) / 1000000 +
                " milliseconds.");
        assertEquals(6L, result);
    }

    @Test
    public void testSolutionBruteforceFor4() throws Exception {
        double time = nanoTime();
        long result = solutionBruteforce(4);
        System.out.println("[015] brute force solution (" + result + ") in " + (nanoTime() - time) / 1000000 +
                " milliseconds.");
        assertEquals(20L, result);
    }

    @Test
    public void testSolutionBruteforceFor5() throws Exception {
        double time = nanoTime();
        long result = solutionBruteforce(5);
        System.out.println("[015] brute force solution (" + result + ") in " + (nanoTime() - time) / 1000000 +
                " milliseconds.");
        assertEquals(70L, result);
    }

    @Test
    public void testSolutionBruteforceFor6() throws Exception {
        double time = nanoTime();
        long result = solutionBruteforce(6);
        System.out.println("[015] brute force solution (" + result + ") in " + (nanoTime() - time) / 1000000 +
                " milliseconds.");
        assertEquals(252L, result);
    }

    @Test
    public void testSolutionBruteforceFor20() throws Exception {
        double time = nanoTime();
        long result = solutionBruteforce(20);
        System.out.println("[015] brute force solution (" + result + ") in " + (nanoTime() - time) / 1000000 +
                " milliseconds.");
        assertEquals(35345263800L, result);
    }
}
