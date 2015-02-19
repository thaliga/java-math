
package net.projecteuler;

import static common.TestUtil.checkResult;
import static java.lang.System.nanoTime;
import static net.projecteuler.Problem009.solutionBruteforce;

import org.junit.Test;

public class Problem009Test {
    @Test
    public void testSolutionBruteforce() throws Exception {
        // given
    	double time = nanoTime();
        
        // when
        long result = solutionBruteforce(1000);

        // then
		checkResult("009", "brute force ", 31875000L, result, time);
    }
}
