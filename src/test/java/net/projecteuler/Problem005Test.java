
package net.projecteuler;

import static java.lang.System.nanoTime;
import static net.projecteuler.Problem005.solution;
import static net.projecteuler.Problem005.solutionBruteforce;

import org.junit.Assert;
import org.junit.Test;

public class Problem005Test {
    @Test
    public void testSolutionBruteForceFor10() throws Exception {
        int value = 10;
        double time = nanoTime();
        long result = solutionBruteforce(value);
        System.out.println("Time for brute force solution(10) was " + (nanoTime() - time) / 1000000 + " milliseconds.");
        Assert.assertEquals(2520L, result);
    }

    @Test
    public void testSolutionBruteForceFor20() throws Exception {
        int value = 20;
        double time = nanoTime();
        long result = solutionBruteforce(value);
        System.out.println("Time for brute force solution(20) was " + (nanoTime() - time) / 1000000 + " milliseconds.");
        Assert.assertEquals(232792560L, result);
    }

    @Test
    public void testSolutionFor10() throws Exception {
        int value = 10;
        double time = nanoTime();
        long result = solution(value);
        System.out.println("Time for solution(10) was " + (nanoTime() - time) / 1000000 + " milliseconds.");
        Assert.assertEquals(2520L, result);
    }

    @Test
    public void testSolutionFor20() throws Exception {
        int value = 20;
        double time = nanoTime();
        long result = solution(value);
        System.out.println("Time for solution(20) was " + (nanoTime() - time) / 1000000 + " milliseconds.");
        Assert.assertEquals(232792560L, result);
    }
}
