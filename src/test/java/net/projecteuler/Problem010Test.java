
package net.projecteuler;

import static common.TestUtil.checkResult;
import static java.lang.System.nanoTime;
import static net.projecteuler.Problem010.solution;
import static net.projecteuler.Problem010.solutionBruteforce;

import org.junit.Test;

public class Problem010Test {

    private static final int LIMIT = 2000000;

    @Test
    public void testSolution() throws Exception {
    	// given
        double time = nanoTime();
        
        // when
        long result = solution(LIMIT);

        // then
		checkResult("010", 142913828922L, result, time);
    }

    @Test
    public void testSolutionBruteforce() throws Exception {
    	// given
        double time = nanoTime();
        
        // when
        long result = solutionBruteforce(LIMIT);

        // then
		checkResult("010", "brute force ", 142913828922L, result, time);
    }
}
